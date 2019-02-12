package com.bob.hms.admin.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class WriteObjectStream {

	public static void main(String[] args) 
			throws FileNotFoundException,IOException {
		
		List<String> list =  new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
		
		
		FileOutputStream fstream = new FileOutputStream("/home/nikunj.s/inputFile.txt");
		ObjectOutputStream oStream = new ObjectOutputStream(fstream);
		oStream.writeObject(list);
		oStream.close();
		fstream.close();
	}

}
