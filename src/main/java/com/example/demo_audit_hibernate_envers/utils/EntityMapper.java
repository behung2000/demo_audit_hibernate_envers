package com.example.demo_audit_hibernate_envers.utils;


import com.example.demo_audit_hibernate_envers.models.Book;
import com.example.demo_audit_hibernate_envers.responses.BookInfo;
import com.example.demo_audit_hibernate_envers.responses.BooksResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.List;

public class EntityMapper {
    public BooksResponse toBooksResponse(Page<Book> bookPage) {
        if (bookPage.hasContent() && !bookPage.getContent().isEmpty()) {
            List<BookInfo> list = new ArrayList<>();
            for (Book book : bookPage.getContent()) {
                BookInfo bookInfo = BookInfo.builder().build();
                BeanUtils.copyProperties(book, bookInfo);
                list.add(bookInfo);
            }
            return BooksResponse.builder().status(0).messenger(null).bookInfos(list).build();
        }
        return BooksResponse.builder().status(0).messenger(null).bookInfos(null).build();
    }
}
