
public class GCDInt {
public static void main(String[] args) {
	int n1 = 100, n2=153, gcd =1;
		for (int i=1;i<=n1 && i<=n2 ; ++i) {
			if(n1%i == 0 && n2%i ==0) 
				gcd = i;
		}
System.out.println("GCD Of 81 and 153 is "+ gcd);

	}
}
