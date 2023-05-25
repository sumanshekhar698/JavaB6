package com.javab6.oops.strings;
//import java.lang.*;

public class MainStringInto {

	public static void main(String[] args) {
		
		
		//String are objects
		//Nornal Strings are immutable
		
		
		//String using String literal
		String x = "TOMMY";
		String z = "TOMMY";
		
		if(x==z)// == comapred the object refrence address
			System.out.println(true);
		else
			System.out.println(false);

		
		String y = new String("TOMMY");
		String m = new String("ToMMY");
		
		if(y==m)
			System.out.println(true);
		else
			System.out.println(false);
		
		
		
		if(y.equals(m))
			System.out.println(true);
		else
			System.out.println(false);
		
		
		if(y.equalsIgnoreCase(m))
			System.out.println(true);
		else
			System.out.println(false);


		

	}

}
