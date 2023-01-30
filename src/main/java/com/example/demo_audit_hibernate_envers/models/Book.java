package com.example.demo_audit_hibernate_envers.models;

import com.google.gson.Gson;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Data
@Setter
@Getter
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "test_audit_envers", name = "book")
@Audited
public class Book {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;

    @Column(name = "is_active")
    private boolean isActive;

    public String toString() {
        return new Gson().toJson(this);
    }
}
