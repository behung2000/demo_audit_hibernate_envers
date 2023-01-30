package com.example.demo_audit_hibernate_envers.repositories;

import com.example.demo_audit_hibernate_envers.models.Book;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;

@Repository
@EntityScan("com.example.demo_audit_hibernate_envers.models")
public interface BookRepository extends RevisionRepository<Book, Integer, Integer>, JpaRepository<Book, Integer> {
}
