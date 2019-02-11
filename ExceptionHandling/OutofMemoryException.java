package com.bob.hms.admin.common;

public class OutofMemoryException {

	public static void main(String[] args) {
		Long memory = Runtime.getRuntime().maxMemory();
		System.out.println("Max Runtime Memory ==>"+memory);
		
		int[] matrix = new int[(int)(memory +1)];
		
		for (int i=0;i<matrix.length;++i)
			matrix[i] = i+1;

	}
}
