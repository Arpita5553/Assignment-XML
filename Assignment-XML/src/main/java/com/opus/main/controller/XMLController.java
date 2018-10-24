package com.opus.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.opus.main.model.XMLData;
import com.opus.main.services.ServiceImpl;

@RestController
public class XMLController {

	
	@Autowired
	private ServiceImpl service;
	
	@RequestMapping("/{key}")
	public List<XMLData> getByWord(@PathVariable("key") String key )
	{
		return service.getByWord(key);
	}
	
	@RequestMapping("/getAll")
	public List<XMLData> getAll()
	{
		return service.getAll();
	}
	
	
	@RequestMapping("/insert")
	public void rw()
	{
		service.insertData();
		
	}
	
}
