package com.dhananjay.MultipleFileread;

import java.io.File;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import com.dhananjay.MultipleFileread.service.FileService;

public class ReadMultipleFilesMain {

	// TODO Auto-generated method stub

	private static final int THREAD_COUNT = 5;

	public static void main(String[] args) throws Exception {

		LocalTime first = LocalTime.now();

		ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT);

		File[] listOfFiles = new FileService().getListOfFile();
		List<Future<Integer>> listOFFuture = new ArrayList<>();

		for (File f : listOfFiles) {
			listOFFuture.add(executorService.submit(new FileReaderCallable(f)));
		}

		int totalCount = 0;
		int j = 0;
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
		
	}
}
