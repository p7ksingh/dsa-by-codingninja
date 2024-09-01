package com.p1.basicDSA;

public class SumOfNumber {
	public void sum(int a, int b) {
		int c = a+b;
		System.out.println("Total sum is :: "+c);
	}

	public static void main(String[] args) {
		SumOfNumber s = new SumOfNumber();
		s.sum(100, 100);
	}

}
