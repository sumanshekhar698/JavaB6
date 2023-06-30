package com.javab6.advanced.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteAFileRobust {

	public static void main(String[] args) {

		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaB6\\notes\\sample.txt";
		String msg = "Hey Java is Easy \n is it ??";

		try {
			FileOutputStream fos = new FileOutputStream(path);
			
			fos.write(msg.getBytes());


		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
