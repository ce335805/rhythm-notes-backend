package com.rhythmnotes.rhythmnotesbackend.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(path="/rhythmnotes")
public class MainController {
    @Autowired
    private NoteRepository noteRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNote(@RequestParam String title, @RequestParam String content) {
        Note note = new Note();
        note.setTitle(title);
        note.setContent(content);
        noteRepository.save(note);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Note> getAllNotes() {
        return noteRepository.findAll();
    }

}
