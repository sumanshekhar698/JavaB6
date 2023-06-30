package com.javab6.advanced.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadAFileRobust {

	public static void main(String[] args) {

		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaB6\\notes\\sample.txt";

		try {
			FileInputStream fis = new FileInputStream(path);
			int readChar = 0;

			while ((readChar = fis.read()) != -1) {
				System.out.print((char)readChar);

			}
			
			System.out.println("\n"+readChar);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
