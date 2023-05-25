package com.javab6.oops.strings.mutable;

public class MutableStringsIntro {

	public static void main(String[] args) {


		
//		StringBuilder
//		StringBuffer  // MT programs
		
		StringBuilder sb = new StringBuilder("madam");//Single Thread Programs
		sb.append(" paris");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		sb.delete(1, 3);

		System.out.println(sb);
		
//		Comparing to Differrent Strings Classes Objects
		StringBuilder sb1 = new StringBuilder("madam");//Single Thread Programs
		StringBuilder sb2 = new StringBuilder("madam");//Single Thread Programs
		
		String x ="";
		
		//StringBuilder & StringBuffer ==> equas method doesnt compare data, it compares object ref
		if(sb1.toString().equals(sb2.toString()))
				System.out.println(true);
		else 
			System.out.println(false);
		

		
		

	}

}
