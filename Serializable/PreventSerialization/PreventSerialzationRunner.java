package com.insta.hms.outpatient;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PreventSerialzationRunner {

	public static void main(String[] args) {
		Customer customer = new Customer(123, "Kiran", "123456");
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream("customer.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(customer);
			oos.flush();
			fos.close();
			} catch (FileNotFoundException fnfex) {
	            fnfex.printStackTrace();
	        }
	        catch (IOException ioex) {
	            ioex.printStackTrace();
	        }
	}

}
