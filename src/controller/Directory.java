package controller;

import java.io.*;
import java.util.*;

public class Directory {

	
	public void list(String path) throws Exception {
		
		File directory = new File(path);
		
		if (!(directory.isDirectory() && directory.exists())) {
			throw new Exception ("Invalid directory.");
		} else {
			File[] files = directory.listFiles();
			sort(files);
		}
	}
	
	public void sort (File[] files) {
		
		ArrayList<File> filesList = new ArrayList<File>();
		
		for (File file : files) {
			if (file.isFile()) filesList.add(file);
		}
		
		filesList.sort((f1,f2) -> Double.compare(f1.length(), f2.length()));
		
		for (File file : filesList) {
			double size = file.length()/Math.pow(2, 20);
			System.out.println("Name: " + file.getName() + " | Size: " + size + " MB"); ;
		}
	}
}