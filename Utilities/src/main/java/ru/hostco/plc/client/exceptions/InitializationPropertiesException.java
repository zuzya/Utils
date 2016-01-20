package ru.hostco.plc.client.exceptions;

import java.io.IOException;

public class InitializationPropertiesException extends IOException {

	public InitializationPropertiesException(String msg){
		super("Exception on initializating properties : " + msg);
	}
}
