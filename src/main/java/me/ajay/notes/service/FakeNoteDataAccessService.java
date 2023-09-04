package me.ajay.notes.service;

import me.ajay.notes.dao.NoteDao;
import me.ajay.notes.model.Note;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeNoteDao")
public class FakeNoteDataAccessService implements NoteDao {

    private static List<Note> db = new ArrayList<>();
    @Override
    public int addNote(UUID id, Note note) {
        db.add(new Note(id, note.getTitle(), note.getDescription()));
        return 1;
    }

    @Override
    public List<Note> selectAllNotes() {
        return db;
    }
}
