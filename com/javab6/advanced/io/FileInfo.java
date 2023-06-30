package com.javab6.advanced.io;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {

		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaB6\\notes\\sample.txt";

		File file = new File(path);

		System.out.println(file.exists());

		if (file.exists()) {
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getName());

			System.out.println(file.canRead());
			System.out.println(file.canWrite());

		} else {
			System.out.println("File not present");
		}

	}

}
