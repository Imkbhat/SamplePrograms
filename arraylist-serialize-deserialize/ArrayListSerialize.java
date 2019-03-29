package com.bob.hms.admin.common.pract;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ArrayListSerialize {

	public static void main(String[] args) throws IOException {
		List<String> serailizeList = new ArrayList<>();
		serailizeList.add("Kiran");
		serailizeList.add("Bhat");
		serailizeList.add("Shimoga");
		
		try {
			FileOutputStream stream = new FileOutputStream("listData");
			ObjectOutputStream objOutputStream = new ObjectOutputStream(stream);
			objOutputStream.writeObject(serailizeList);
			stream.close();
			objOutputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
