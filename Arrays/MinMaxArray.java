public class MinMaxArray
{
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int[] arr = {1,2,3,4,5,6,7,8,9};
		for(int x : arr) {
		    if(x > max) max = x;
		    if(x < min) min = x;
		}
		System.out.println(max +"========="+min);
	}
}


Output: 
9=========1
