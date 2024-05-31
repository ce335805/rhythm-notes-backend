package com.rhythmnotes.rhythmnotesbackend.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

public interface DiaryEntryRepository extends CrudRepository<DiaryEntry, Integer> {
}
