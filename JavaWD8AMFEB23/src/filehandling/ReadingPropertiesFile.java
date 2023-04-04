package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFile {
	
	public static void main(String[] args) throws IOException {
		ReadingPropertiesFile rp = new ReadingPropertiesFile();
		rp.readPropertiesfile();
	}
	
	public void readPropertiesfile() throws IOException {
		File file = new File("./src/filehandling/data.properties");
		FileInputStream fis = new FileInputStream(file);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
	}

}
