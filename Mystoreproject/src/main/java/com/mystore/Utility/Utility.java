package com.mystore.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {

	
	public static String readDataFromPropertyfile (String key) throws IOException {
		Properties prop = new Properties ();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"//config.properties");
		prop.load(file);
		String value =prop.getProperty(key);
		return value;
		
	}
	
	
	
	
}
