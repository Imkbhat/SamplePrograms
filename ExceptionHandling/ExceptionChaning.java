public class ExceptionChaning {

	public static void main(String[] args) {
	try {
		NumberFormatException ex = new NumberFormatException("Number");
		ex.initCause(new NullPointerException("This is Initial Cause"));
		throw ex;
	} catch(Exception ex) {
		System.out.println(ex);
		System.out.println(ex.getCause());
	    }
	}


}
