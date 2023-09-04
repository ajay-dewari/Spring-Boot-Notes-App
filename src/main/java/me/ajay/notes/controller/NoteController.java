package me.ajay.notes.controller;

import me.ajay.notes.model.Note;
import me.ajay.notes.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/note")
@RestController
public class NoteController {

    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }


    @PostMapping
    public void addNote(@RequestBody Note note) {
        noteService.addNote(note);
    }

    @GetMapping
    public List<Note> getAllNote() {
        return noteService.getAllNote();
    }
}
