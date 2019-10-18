package com.insta.hms.outpatient;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;

public class Customer implements Serializable {
	
	 transient int custometId;
	 String name;
	 transient String SSNo;
	
	public Customer(int custometId, String name, String sSNo) {
		super();
		this.custometId = custometId;
		this.name = name;
		SSNo = sSNo;
	}
	
	private void writeObject(OutputStream os) throws Exception {
		throw new IOException("IO Exception, Can't be Serialzed.");
	}
	
}
