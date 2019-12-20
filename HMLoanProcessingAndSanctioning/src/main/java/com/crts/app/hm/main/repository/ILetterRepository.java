package com.crts.app.hm.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.hm.main.model.Letter;

@Repository
public interface ILetterRepository extends CrudRepository<Letter, Integer>{

}
