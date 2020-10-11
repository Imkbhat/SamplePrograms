import java.util.Arrays;

public class Anagram {
public boolean isAnagram(String s1, String s2) {

char[] arr1 = s1.toCharArray();
char[] arr2 = s2.toCharArray();

if(arr1.length != arr2.length)
	return false;

Arrays.sort(arr1);
Arrays.sort(arr2);

for(int i=0; i<arr1.length; i++) {
	if(arr1[i] != arr2[i]) {
		return false;
	}
}
return true;
}


public static  void main(String[] args) {

Anagram ana = new Anagram();

String s1 = "Kirana";
String s2 = "nraKi";

if(ana.isAnagram(s1,s2)) {
System.out.println("Both String are Anagram");
} else {
System.out.println("Both String are not Anagram");
}

}

}
