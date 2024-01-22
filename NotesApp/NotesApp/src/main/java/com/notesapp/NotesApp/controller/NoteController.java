//package com.notesapp.NotesApp.controller;
//
//import com.notesapp.NotesApp.entity.Note;
//import com.notesapp.NotesApp.service.NoteService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@CrossOrigin("*")
//@RestController
//public class NoteController {
//
//    @Autowired
//    private NoteService noteService;
//
//    @CrossOrigin(origins = "http://localhost:3000")
//    @GetMapping("/notes")
//    public List<Note> getNotes() {
//        return noteService.readAll();
//    }
//
//    @PostMapping("/notes")
//    public Note saveNotes(@RequestBody Note note) {
//        return noteService.saveNote(note);
//    }
//
//    @GetMapping("/notes/{id}")
//    public Note getNote(@PathVariable Long id) {
//        return noteService.readNote(id);
//    }
//
//    @DeleteMapping("/notes/{id}")
//    public ResponseEntity<HttpStatus> deleteNote(@PathVariable Long id) {
//        noteService.deleteNote(id);
//        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
//    }
//
//    @PutMapping("/notes")
//    public Note updatedNote(@RequestBody Note updatedNote) {
//        return noteService.saveNote(updatedNote);
//    }
//
//
//}
