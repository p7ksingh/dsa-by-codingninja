package com.p1.basicDSA;

import java.util.Scanner;

public class Logical {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b= sc.nextInt();
	int c=sc.nextInt();
	boolean isAGreater=(a>=b)&&(a>=c);
	boolean isAGreater1=(a>=b)||(a>=c);
	boolean isAGreater2=!(a>=b);
	System.out.println(isAGreater);
	System.out.println(isAGreater1);
	System.out.println(isAGreater2);
}
}
