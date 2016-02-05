package ru.hostco.utils.properties;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Properties;

import ru.hostco.plc.client.exceptions.InitializationPropertiesException;

public class Validator {

	/**
	 * Валидация пропертей
	 * 
	 * @param props
	 * @throws InitializationPropertiesException 
	 */
	public static void validateProps(Properties props) throws InitializationPropertiesException, Exception {
		
		if(props == null)
			throw new InitializationPropertiesException("Nullable Properties!");
		
		if(props.isEmpty())
			throw new InitializationPropertiesException("Empty Properties!");
		
		props.keySet().forEach((key) -> {	
			if(props.get(key) == null || ((String)props.get(key)).isEmpty()){
				try {
					throw new InitializationPropertiesException("Empty Property! Property name: " + key);
				} catch (Exception e) {
					throw new UncheckedIOException(e.getMessage() + key, (IOException) e);
				}
			};
		});
	}
}
