public class LargestAmongArr {

	public static void main(String[] args) {

	int[] arr = {3,5,1,7,9,10};
	int temp  =0;
	for (int i=0; i<arr.length; i++) {
		if(arr[i] > temp) {
			temp =arr[i];
		}
	}
	System.out.println("Max element is array "+temp);
	}
}
