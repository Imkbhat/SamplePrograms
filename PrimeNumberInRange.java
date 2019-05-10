package com.sampleprograms;

import java.util.Scanner;

public class PrimeNumberInRange {

	public static void main(String[] args) {
		
		int s1, s2, flag = 0, i , j ;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st Number.");
		s1 = s.nextInt();
		
		System.out.println("Enter 2nd Number.");
		s2 = s.nextInt();
		
		System.out.println("Prime Number in between "+s1+" & "+s2+" are=>");
		
		for (i=s1; i<=s2; i++) {
			for (j = 2; j<i ; j++) {
				if (i%j == 0) {
					flag = 0;
					break;
				} else {
					flag = 1;
				}
			}
			if (flag == 1) {
				System.out.println( i );
			}
		}
	}

}



