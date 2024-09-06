package com.ninos.notes.services.impl;

import com.ninos.notes.models.Note;
import com.ninos.notes.repository.NoteRepository;
import com.ninos.notes.services.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class NoteServiceImpl implements NoteService {

    private final NoteRepository noteRepository;



    @Override
    public Note createNoteForUser(String username, String content) {
        Note note = new Note();
        note.setContent(content);
        note.setOwnerUsername(username);
        return noteRepository.save(note);
    }

    @Override
    public Note updateNoteForUser(Long noteId, String username, String content) {
        Note note = noteRepository.findById(noteId).orElseThrow(() -> new RuntimeException("Note not found"));
        note.setContent(content);
        return noteRepository.save(note);

    }

    @Override
    public void deleteNoteForUser(Long noteId, String username) {
     noteRepository.deleteById(noteId);
    }

    @Override
    public List<Note> getNotsForUser(String username) {
        return noteRepository.findByOwnerUsername(username);
    }
}
