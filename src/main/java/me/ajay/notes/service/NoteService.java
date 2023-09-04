package me.ajay.notes.service;

import me.ajay.notes.dao.NoteDao;
import me.ajay.notes.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    private final NoteDao noteDao;

    @Autowired
    public NoteService(@Qualifier("fakeNoteDao") NoteDao noteDao) {
        this.noteDao = noteDao;
    }

    public int addNote(Note note) {
        return noteDao.addNote(note);
    }

    public List<Note> getAllNote() {
        return noteDao.selectAllNotes();
    }

}
