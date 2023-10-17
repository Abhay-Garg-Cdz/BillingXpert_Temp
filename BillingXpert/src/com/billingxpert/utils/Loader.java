package com.billingxpert.utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.billingxpert.dao.LoaderFields;

public class Loader {

	// for Serializing Object
	public static void serializeFields(LoaderFields fs) throws IOException {

		FileOutputStream fileOutputStream = new FileOutputStream("src/res/defaults/ids.loc");
		ObjectOutputStream ObjectOutputStream = new ObjectOutputStream(fileOutputStream);
		ObjectOutputStream.writeObject(fs);
		ObjectOutputStream.close();
	}

	// FOr DeSerializing Object
	public static void deserializeFields() throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream("src/res/defaults/ids.loc");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		LoaderFields fields = (LoaderFields) objectInputStream.readObject();
		objectInputStream.close();

		fields.initiateValues(fields);

	}

}
