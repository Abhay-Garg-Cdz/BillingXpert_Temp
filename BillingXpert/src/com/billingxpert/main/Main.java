package com.billingxpert.main;
import java.io.IOException;

import com.billingxpert.dao.LoaderFields;
import com.billingxpert.utils.Loader;
import com.billingxpert.views.DashBoard;

public class Main {

	public static LoaderFields fs;
	public static void main(String[] args) throws IOException, ClassNotFoundException {


		
		fs = Loader.deserializeFields();
		
		new DashBoard();
		
		
		Loader.serializeFields(fs);
		
		

	}

}
