public class Test 
{ 
	public static void main (String[] args) throws java.lang.Exception 
	{ 
			//An integer can be null, so this is fine 
			Integer i = null; 
			
			//Unboxing null to integer throws NullpointerException 
			int a = i; 
	} 
} 

