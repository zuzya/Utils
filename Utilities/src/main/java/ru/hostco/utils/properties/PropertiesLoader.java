package ru.hostco.utils.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {

	/**
	 * ������ ������ ���������
	 * 
	 * @param path
	 * @return
	 */
	public static Properties getProperties(String path) {	
		
		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream(path);
			// load a properties file
			prop.load(input);

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return prop;
	}

}
