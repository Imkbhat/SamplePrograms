package com.bob.hms.admin.common;

public class ExceptionChaining {

	public static void main(String[] args) {
		
		try {
			// Creating an exception 
            NumberFormatException ex = 
                       new NumberFormatException("Exception"); 
  
            // Setting a cause of the exception 
            ex.initCause(new NullPointerException( 
                      "This is actual cause of the exception")); 
  
            // Throwing an exception with cause. 
            throw ex; 
		} catch(Exception ex) {
			System.out.println(ex);
			System.out.println(ex.getCause());
		}
	}

}
