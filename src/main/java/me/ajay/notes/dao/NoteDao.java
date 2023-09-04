package me.ajay.notes.dao;

import me.ajay.notes.model.Note;

import java.util.List;
import java.util.UUID;

public interface NoteDao {

    int addNote(UUID id, Note note);

    default int addNote(Note note) {
        UUID id  = UUID.randomUUID();
        return addNote(id, note);
    }

    List<Note> selectAllNotes();
}
