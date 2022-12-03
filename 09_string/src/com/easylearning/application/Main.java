package com.easylearning.application;

public class Main {
	
	public static void example1() {
		String str1 = "abc";
		System.out.println(str1);
		str1 = str1.concat("def");
		System.out.println(str1);
		str1 = null;
	}
	
	public static void example2() {
		String str1 ="java";
		String str2 = "java";
		String str3 = new String("java");
		String str4 = String.valueOf("java");
		
		System.out.println("str1==str2:  "+(str1==str2)); //true
		System.out.println("str1==str3:  "+(str1==str3)); //
		System.out.println("str1==str4:  "+(str1==str4));
		System.out.println("str3==str4:  "+(str3==str4));
		
	}
	
	public static void memoryLeakageExample() {
		String str  ="String is: ";
		for(int i=65;i<=90;i++) {
			str = str.concat((char)i+" "); //memory leakage
		}
		System.out.println(str);	
	}
	
	public static void fixMemoryLeakageExample() {
		//to fix memory leakage for below example, use mutable string class
		//StringBuffer, StringBuilder
		
		String str  ="String is: ";
		StringBuilder sb = new StringBuilder(str);
		for(int i=65;i<=90;i++) {
			sb.append((char)i+" "); //memory leakage
		}
		str = sb.toString();
		System.out.println(str);	
		System.out.println(str.getClass());
	}
	
	
	public static void example4() {
		Main m = new Main();
		String s = m.getClass().getName();
		System.out.println(s);
		String[] sarr =s.split("\\.");
		System.out.println(sarr[sarr.length-1]);
		
		//substr
		
		String str ="abcde";
		System.out.println(str.substring(0,4));
		
		System.out.println(str.charAt(3));
		
		System.out.println(str.endsWith("de"));
	}
	
	public static void main(String[] args) {
		//fixMemoryLeakageExample();
		example4();
		
		
	}

}
