package ru.hostco.utils.xml;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class Utils {

	/**
	 * Возвращает текущую дату
	 * 
	 * @return текущая дата
	 * @throws DatatypeConfigurationException
	 */
	public static XMLGregorianCalendar getCurrentDate()
			throws DatatypeConfigurationException {
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		DatatypeFactory datatypeFactory = null;

		datatypeFactory = DatatypeFactory.newInstance();
		XMLGregorianCalendar now = datatypeFactory
				.newXMLGregorianCalendar(gregorianCalendar);
		return now;
	}
}
