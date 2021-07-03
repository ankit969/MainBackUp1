package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFiles16 {
	
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("E:\\Selenium\\Eclipseworkspace2\\Practice6\\src\\Selenium\\prop.properties");
		prop.load(ip);
		
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("name"));
	}

}
