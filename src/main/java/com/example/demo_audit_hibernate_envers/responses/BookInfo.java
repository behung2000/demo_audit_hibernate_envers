package com.example.demo_audit_hibernate_envers.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;
import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookInfo {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("author")
    private String author;


    public void validate() {
        if (name == null || name.trim().isEmpty()) {
            throw new RuntimeException("name fail");
        }

        if (author == null || author.trim().isEmpty()) {
            throw new RuntimeException("author fail");
        }
    }

    public String toString() {
        return new Gson().toJson(this);
    }
}
