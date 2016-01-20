package ru.hostco.utils.properties.test;

import java.util.Properties;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

import ru.hostco.plc.client.exceptions.InitializationPropertiesException;
import ru.hostco.utils.properties.PropertiesLoader;
import ru.hostco.utils.properties.Validator;

public class PropertiesTest {

	@Test
	@Ignore
	public void test01(){
		
		Properties p = PropertiesLoader.getProperties("");
		assertNotNull(p);
	}
	
	@Test
	public void validateProperties_empty() {
		
		Properties props = null;
		try {
			Validator.validateProps(props);
			fail("Nullable poperties");
		} catch (Exception e) {			
			//ignored		
		}
				
		props = new Properties();
		try {
			Validator.validateProps(props);
			fail("Empty properties");
		} catch (Exception e) {			
			//ignored		
		}
	}
	
	@Test
	public void validateProperties_normal_3prop() {
		
		Properties props = new Properties();
		props.setProperty("k1", "v1");
		props.setProperty("k2", "v2");
		props.setProperty("k3", "v3");
		try {
			Validator.validateProps(props);			
		} catch (Exception e) {			
			fail("Nullable element");	
		}		
	}
	
	@Test
	public void validateProperties_nullable_2element() {
		
		Properties props = new Properties();
		props.setProperty("k1", "v");
		props.setProperty("k2", "");
		try {
			Validator.validateProps(props);
			fail("Nullable element");
		} catch (Exception e) {			
			//ignored		
		}		
	}
}
