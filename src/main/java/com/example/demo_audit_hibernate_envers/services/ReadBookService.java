package com.example.demo_audit_hibernate_envers.services;

import com.example.demo_audit_hibernate_envers.models.Book;
import com.example.demo_audit_hibernate_envers.repositories.BookRepository;
import com.example.demo_audit_hibernate_envers.responses.BooksResponse;
import com.example.demo_audit_hibernate_envers.utils.EntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class ReadBookService {
    @Autowired
    BookRepository repository;

    public BooksResponse getAllBooks(Integer pageNo, Integer pageSize) {
        PageRequest page = PageRequest.of(pageNo, pageSize);
        EntityMapper mapper = new EntityMapper();
        Page<Book> bookPage = repository.findAll(page);
        return mapper.toBooksResponse(bookPage);
    }
}
