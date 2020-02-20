public class StringPalindrome
{
    
    static boolean isPalindrome(String str) {
        int i = 0, j= str.length()-1;
        
        while(i<j) {
            if(str.charAt(i) != str.charAt(j))
                return false;
                
            i++;
            j--;
            
        }
        return true;
    }
    
	public static void main(String[] args) {
	    if(isPalindrome("KirannariK")) {
	        System.out.println("True");
	    } else {
	        System.out.println("False");
	    }
	}
}
