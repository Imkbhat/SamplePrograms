public class reverseString {
	public static void main() {
	String str = "Kiran Bhat";
	String reverse =  "";
	for (int i = str.length()-1 ; i>=0; i--) {
		reverse = reverse+str.charAt(i);	
		}
	}
}
