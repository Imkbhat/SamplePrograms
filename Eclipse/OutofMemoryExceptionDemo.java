package com.bob.hms.admin.common;

public class OutofMemoryExceptionDemo {

	public static void main(String[] args) {
		Long max = Runtime.getRuntime().maxMemory();
		
		System.out.println("Max  Memory======> "+max);
		
		int[] matrix = new int[(int)(max+1)];
		
		for (int i=0;i<matrix.length;++i) {
			matrix[i] = matrix[i+1];
		}
	}

}
