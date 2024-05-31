package com.rhythmnotes.rhythmnotesbackend.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/rhythmnotes")
public class MainController {
    @Autowired
    private DiaryEntryRepository diaryEntryRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNote(@RequestBody DiaryEntry diaryEntry
    ) {
        diaryEntryRepository.save(diaryEntry);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<DiaryEntry> getAllNotes() {
        return diaryEntryRepository.findAll();
    }


    @DeleteMapping(path = "/delete/{id}")
    public @ResponseBody String deleteNote(@PathVariable int id) {
        diaryEntryRepository.deleteById(id);
        return "Diary Entry deleted successfully";
    }

}

