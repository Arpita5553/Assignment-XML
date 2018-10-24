package com.opus.main.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class XMLData{

	@Id
	String id;
	String fname;
	int lno;
	String word; 
	
	public XMLData() {
		// TODO Auto-generated constructor stub
	}

	public XMLData(String fname, int lno, String word) {
	
		this.fname = fname;
		this.lno = lno;
		this.word = word;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public int getLno() {
		return lno;
	}

	public void setLno(int lno) {
		this.lno = lno;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public String toString() {
		return "XMLData [id=" + id + ", fname=" + fname + ", lno=" + lno + ", word=" + word + "]";
	}
	

	
	
	
	
}
