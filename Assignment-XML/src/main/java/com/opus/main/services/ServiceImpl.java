package com.opus.main.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opus.main.model.XMLData;
import com.opus.main.repository.XMLRepo;


@Service
public class ServiceImpl implements Services {

	@Autowired
	private XMLRepo repo;



	public void insertData() 
	{
		
		
		
		 File file = new File("C:\\Users\\arpita.bhalerao\\Documents\\Maven\\Assignment-XML\\Files"); 
		    
		    File[] files = file.listFiles();
			//File xmlFile = new File("employee.xml");

			BufferedReader bufReader = null;
			Reader fileReader;
			StringBuilder sb = new StringBuilder();
			String line = null;
			String xml2String = null;
			int cnt=0;
			//DataBaseOperations db ;
			
				
				try 
				{
					//for(int i = 0; i<files.length ; i++)
					for (File f : files)
					{
				
						fileReader = new FileReader(f);
						bufReader = new BufferedReader(fileReader);
						
						try 
						{
							line = bufReader.readLine();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} 
					
						while( line != null)
						{
							cnt++;
							sb.append(line).append("\n");
							try {
								line = bufReader.readLine();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} 
							xml2String = sb.toString();
							repo.save(new XMLData(f.getName(),cnt,xml2String));
						} 

						
						//db.save(xml2String);
						
					}
				} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
				
				//xml2String = sb.toString();
				System.out.println("XML to String using BufferedReader : "); 
				System.out.println(xml2String); 
				try {
					bufReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//return xml2String;
			
	}
	
	public List<XMLData> getAll()
	{
		return repo.findAll();
	}
	
	public List<XMLData> getByWord(String word)
	{
		return repo.findByWord(word);
	}

	public List<XMLData> getByLineNum(int lno) {
		// TODO Auto-generated method stub
		return repo.findByLno(lno);
	}
	
	

	
}

