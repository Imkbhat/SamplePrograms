public class String reverseWithoutUsingFunc1 {	
  
  public static void main(String[] args) {	
    String str = "Sachin Tendulkar";
    char[] arr = str.toCharArray();
    for(int i=arr.length-1;i>=0;i--) {
      System.out.println(arr[i]);
    }
  }	
}


Output:

r
a
k
l
u
d
n
e
T
 
n
i
h
c
a
S
