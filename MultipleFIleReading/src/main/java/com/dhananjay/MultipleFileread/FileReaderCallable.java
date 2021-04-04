package com.dhananjay.MultipleFileread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.concurrent.Callable;

public class FileReaderCallable implements Callable<Integer> {

	StringBuilder sb = new StringBuilder();

	File file;

	FileReaderCallable(File file) {
		this.file = file;
	}

	int wordCount = 0;

	@Override
	public Integer call() throws Exception {
		
		Thread.sleep(100);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		while ((line = br.readLine()) != null) {

			String words[] = line.split(" ");

			for (int i = 0; i < words.length; i++) {

				if (words[i].equals("to")) {
					++wordCount;

					sb.append(words[i] + " ");
				}

			}

		}

		br.close();
		return wordCount;
	}

}
