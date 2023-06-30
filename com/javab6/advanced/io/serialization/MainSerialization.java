package com.javab6.advanced.io.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainSerialization {

	public static void main(String[] args) {
		
		Student suman = new Student(1, "Suman");
		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaB6\\notes\\sample.txt";
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(suman);
			
			fos.flush();
			fos.close();			



		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	

	}

}
