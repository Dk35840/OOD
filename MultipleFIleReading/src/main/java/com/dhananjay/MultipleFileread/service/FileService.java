package com.dhananjay.MultipleFileread.service;

import java.io.File;
import java.util.List;

public class FileService {

	public File[] getListOfFile(){
		
		File[] listOfFiles =new File[] {};
		
		String folderPath = "src\\main\\java\\resources\\";
		File file = new File(folderPath);
		
		

		if (!file.isFile()) {
			listOfFiles = file.listFiles();
		}

		return listOfFiles;
	}
	
}
