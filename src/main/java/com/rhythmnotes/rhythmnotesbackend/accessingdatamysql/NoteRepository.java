package com.rhythmnotes.rhythmnotesbackend.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;
import com.rhythmnotes.rhythmnotesbackend.accessingdatamysql.Note;

public interface NoteRepository extends CrudRepository<Note, Integer> {
}
