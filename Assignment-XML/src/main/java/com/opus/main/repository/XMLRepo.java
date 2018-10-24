package com.opus.main.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.opus.main.model.XMLData;



public interface XMLRepo  extends MongoRepository<XMLData, String>{
	

	public List<XMLData> findByWord(String word);
	public List<XMLData> findByLno(int lno);
	

}
