package com.javab6.advanced.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadAFile {

	public static void main(String[] args) {

		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaB6\\notes\\sample.txt";

		File file = new File(path);

		// Scanner

		try (Scanner sc = new Scanner(file);) {
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
