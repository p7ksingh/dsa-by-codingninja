package com.p1.basicDSA;

import java.util.Scanner;

public class ScannerExampleFloat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Float f=sc.nextFloat();
//		Float f1=sc.nextFloat();
//		
//		System.out.println("Sum of Float is : "+(f+f1));
		
		Long l1 =sc.nextLong();
		Long l2 =sc.nextLong();
		System.out.println("Sum of Float is : "+(l1+l2));
		
     Double d1=sc.nextDouble();
	Double d2 =sc.nextDouble();
	System.out.println("Sum of Double is :"+(d1+d2));
	}

}
