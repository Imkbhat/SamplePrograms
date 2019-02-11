public class BinarySearch {
public int binarySearch(int[] arr, int l, int h, int key) {
	
if(h>=l) { 
int mid = (l+h)/2;
if(arr[mid] == key) 
	return mid;
if(arr[mid] > key)
	return binarySearch(arr, l, mid-1, key);

	return binarySearch(arr, mid+1, h, key);
  }
return -1;
}

public static void main(String[] args) {

BinarySearch bs = new BinarySearch();
int[] arr = {1,2,4,5,6,7,8,9,10,12};
int key = 12;
int h = arr.length-1;
int l = 0;

int res = bs.binarySearch(arr,l,h,key);
if (res == -1) {
	System.out.println("Element Not Found");
  } else {
	System.out.println("Element Found at Pos :"+res);
 }
 }
}
