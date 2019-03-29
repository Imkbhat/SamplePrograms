package com.bob.hms.admin.common.pract;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDeserialize {

	public static void main(String[] args) {
		
		List<String> namesList = new ArrayList<>();
		
		try {
			FileInputStream  stream = new FileInputStream("listData");
			ObjectInputStream objStream = null;
			try {
				objStream = new ObjectInputStream(stream);
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				namesList = (List<String>) objStream.readObject();
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		 //Verify list data
        for (String name : namesList) {
            System.out.println(name);
        }
		
	}

}
