package com.javab6.advanced.io;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) {

		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaB6\\notes\\myFile.txt";

		File file = new File(path);
		System.out.println(file.exists());
		
		try {
			boolean createNewFile = file.createNewFile();
			System.out.println(createNewFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		file.delete();

	}

}
