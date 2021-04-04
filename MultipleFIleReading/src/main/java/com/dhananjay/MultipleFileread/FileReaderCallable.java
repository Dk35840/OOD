package com.dhananjay.MultipleFileread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;

public class FileReaderCallable implements Callable<Integer> {

	StringBuilder sb = new StringBuilder();

	Map<String, CopyOnWriteArrayList<String>> mp ;
	List<String> listOfString;
	File file;
	private String wordToCount;

	FileReaderCallable(File file, String wordToCount, Map<String, CopyOnWriteArrayList<String>> mp, List<String> listOfStrings) {
		this.file = file;
		this.mp = mp;
		this.listOfString = listOfStrings;
		this.wordToCount = wordToCount;

	}

	int wordCount = 0;

	@Override
	public Integer call() throws Exception {

		Thread.sleep(1000);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		while ((line = br.readLine()) != null) {

			String words[] = line.split(" ");

			for (int i = 0; i < words.length; i++) {

				if (words[i].equals(wordToCount)) {
					++wordCount;

					//sb.append(words[i] + " ");
				}

				listOfStringCount(words, i);

			}

		}

		br.close();
		return wordCount;
	}

	void wordCount(String[] words, String wordToCount) {

	}

	void listOfStringCount(String[] words, int i) {
		for (int j = 0; j < listOfString.size(); j++) {

			String key = listOfString.get(j);

			if (words[i].equals(key) && i + 1 < words.length) {

				if (mp.get(key) == null)
					mp.put(key, new CopyOnWriteArrayList<>());

				mp.get(key).add(words[i + 1]);
			}
		}
	}

}
