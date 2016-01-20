package ru.hostco.utils.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {

	/**
	 * Читает файлик пропертей
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
	
	public static Properties getProperties(InputStream is) {	
		
		Properties prop = new Properties();
		InputStream input = null;

		try {

			// load a properties file
			prop.load(is);

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
	
	/**
	 * 
	 * @param propertyName
	 * @return
	 */
	public static Properties getSystemProperties(String propertyName) {
		
		Properties config = null;
		
		if (config == null) {
			config = new Properties();
			FileInputStream stream = null;
			try {
				String configPath = System.getProperty(propertyName);
				stream = new FileInputStream(configPath);
		   		config.load(stream);		   		
		   		
//		   	} catch (IOException ioe) {
//		   		ioe.printStackTrace();
		    } catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (stream != null)
					try {
						stream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
			}
			
		}
		return config;
	}	

}
