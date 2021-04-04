package com.dhananjay.MultipleFileread;

import java.io.File;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import com.dhananjay.MultipleFileread.service.FileService;
import com.dhananjay.MultipleFileread.FileReaderCallable;

public class ReadMultipleFilesMain {

	// TODO Auto-generated method stub

	private static final int THREAD_COUNT = 6;
	private static String wordToCount = "Java";

	public static void main(String[] args) throws Exception {

		LocalTime first = LocalTime.now();

		ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT);

		List<String> listOfWords = Arrays.asList("Key12", "key123");

		File[] listOfFiles = new FileService().getListOfFile();
		List<Future<Integer>> listOFFuture = new ArrayList<>();

		Map<String, CopyOnWriteArrayList<String>> mp = new ConcurrentHashMap<>();

		for (File f : listOfFiles) {
			listOFFuture.add(executorService.submit(new FileReaderCallable(f, wordToCount, mp, listOfWords)));
		}

		int totalCount = 0;
		int j = 0;

		System.out.println("Total words for count: " + wordToCount);
		for (Future<Integer> f : listOFFuture) {
			int i = f.get();
			totalCount += i;
			System.out.println(listOfFiles[j++].getName() + " " + i);
		}
		executorService.shutdown();
		executorService.awaitTermination(1, TimeUnit.MINUTES);

		System.out.println();
		System.out.println("Total Count: " + totalCount);

		LocalTime last = LocalTime.now();
		System.out.println("Difference in time duration is :" + Duration.between(first, last));

		System.out.println();
		System.out.println("Now out concurrent file read");

		
		Iterator<ConcurrentHashMap.Entry<String, CopyOnWriteArrayList<String>>> itr = mp.entrySet().iterator();

		// The hasNext() method is used to check if there is
		// a next element The next() method is used to
		// retrieve the next element
		while (itr.hasNext()) {
			ConcurrentHashMap.Entry<String, CopyOnWriteArrayList<String>> entry = itr.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			System.out.println(entry.getValue().size());
		}

	}
}
