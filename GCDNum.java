package com.nmc.hms.billingruleengine;

public class GCDNum {

	public static void main(String[] args) {
		int num1 = 42, num2= 777, gcd =1;
		for (int i=1;i<=num1 && i<=num2 ; ++i) {
			if (num1%i == 0 && num2%i == 0 )
				gcd = i;
		}
		System.out.println("GCD of 42 and 777 is:" +gcd);
	}

}
