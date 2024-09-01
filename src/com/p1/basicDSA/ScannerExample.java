package com.p1.basicDSA;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		//how to take char as input
		Scanner sc = new Scanner(System.in);
		//String str =sc.nextLine();
		String str=sc.next();
		
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			i++;
			System.out.println("String is : "+ch);
		}
		
	}

}
