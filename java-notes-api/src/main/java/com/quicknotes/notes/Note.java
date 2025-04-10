package com.quicknotes.notes;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private String title;
    private String content;
    private LocalDateTime createdAt = LocalDateTime.now();

    // Getters and setters omitted for brevity
}
