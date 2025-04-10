package com.quicknotes.notes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {

    @Autowired
    private NoteRepository repo;

    @PostMapping
    public Note addNote(@RequestBody Note note) {
        return repo.save(note);
    }

    @GetMapping("/{userId}")
    public List<Note> getUserNotes(@PathVariable Long userId) {
        return repo.findByUserId(userId);
    }
}
