package com.javab6.basics;

public class BasicDataTypeInDepth {

	public static void main(String[] args) {

//		byte = 1 byte ; short 2 bytes; int = 4 bytes ;long = 8 bytes
		int x = 87878;
//		short s = x;//Compilation error

		short s = 76;
		x = s;
		System.out.println(s);

		long l = 8787989923479723L;//8.78799E15  = 8.78799 * 10^15
		x = (int) l;
		System.out.println(x);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Long.MAX_VALUE);
		
		
		// float = 4 bytes (IEEE) *| long = 8 bytes (2s complement)
		float f = l;
		System.out.println(f);
		
		int ch = 'A';
		System.out.println(ch);
		
//		DSA

		
		
		
		

	}

}
