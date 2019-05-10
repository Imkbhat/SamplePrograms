package com.sampleprograms;

public class FactorialMain {
	
	public int factorial(int number) {
		int fact =1;
		for (int i=1;i<=number; i++) {
			fact = fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println("Factorial of 5 is ==> "+new FactorialMain().factorial(5));
	}

}
