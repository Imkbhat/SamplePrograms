public class EmailValidationTest {
	
	public static void validateEmail(String s) throws EmailValidateException {
		boolean contains = s.contains("@");
		if (contains) {
		   System.out.println("Valid Email");
		} else {
			throw new EmailValidateException("Invalid Email");
		}

	}


	public static void main(String[] args) throws EmailValidateException {
	
	String email = "kbs71190gmail.com";
	try {
	  validateEmail(email);
	} catch (EmailValidateException ex) {
	   ex.printStackTrace();
	}

	}
} 
