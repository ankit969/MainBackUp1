package selenium2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readPropertiesFileInSelenium16 {
	
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("E:\\Selenium\\Eclipseworkspace2\\Practice9\\src\\selenium2\\test.properties");
		prop.load(ip);
		
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("name"));
	}

}
