package com.example.demo_audit_hibernate_envers.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Setter
@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BooksResponse extends BaseResponse {
    @JsonProperty("data")
    private List<BookInfo> bookInfos;
}
