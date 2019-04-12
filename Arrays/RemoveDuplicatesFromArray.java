package com.bob.hms.admin.common.pract.samplepgs;

public class RemoveDuplicatesFromArray {
	
	public static int removeDuplicates(int[] arr, int n) {
		//return 0 or 1 if array length is 0 or 1
		if (n ==0 || n == 1) {
			return n;
		}
		//temporary array
		int[] temp = new int[n];
		//Variable to keep element in temporary arr
		int j =0;
		for (int i=0; i<n-1; i++) {
			if (arr[i] != arr[i+1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n-1];
		//change Arr
		for (int i=0; i<j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}
	
	public static void main(String[] args) {
		int arr[] = {10,20,20,30,30,40,50,50};  
        int length = arr.length;  
        length = removeDuplicates(arr, length);  
        //printing array elements  
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
    }  
}
