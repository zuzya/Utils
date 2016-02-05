package ru.hostco.utils.date;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DateUtils {

	
	/**
	 * Возвращает текущую дату в виде XMLGregorianCalendar
	 * 
	 * @return
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
	
	
	/**
	 * 
	 * @param date
	 * @return
	 * @throws DatatypeConfigurationException
	 */
	public static Date getDateFromXMLCalendar(XMLGregorianCalendar xmlDate) throws DatatypeConfigurationException {
		
		if(xmlDate == null)
			return null;
		Date date = xmlDate.toGregorianCalendar().getTime();
		return date;
	}
	
	/**
	 * 
	 * @param date
	 * @return
	 * @throws DatatypeConfigurationException
	 */
	public static XMLGregorianCalendar getXMLDateFromParam(Date date) throws DatatypeConfigurationException {
		
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		gregorianCalendar.setTime(date);
		DatatypeFactory datatypeFactory = null;

		datatypeFactory = DatatypeFactory.newInstance();
		XMLGregorianCalendar now = datatypeFactory
				.newXMLGregorianCalendar(gregorianCalendar);
		return now;
	}
	
	
	/**
	 * 
	 * 
	 * @param localdate
	 * @return
	 * @throws DatatypeConfigurationException
	 */
	public static XMLGregorianCalendar getXMLDateFromParam(LocalDateTime localdate) throws DatatypeConfigurationException {
				
		DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
		XMLGregorianCalendar now = datatypeFactory
				.newXMLGregorianCalendar(localdate.toString());
		return now;
	}
	
	/**
	 * 
	 * @param sdate
	 * @param sdf
	 * @return
	 * @throws DatatypeConfigurationException
	 * @throws ParseException
	 */
	public static XMLGregorianCalendar getXMLDateFromStringParam(String sdate, SimpleDateFormat sdf)
			throws DatatypeConfigurationException, ParseException {
		
		Date date = sdf.parse(sdate);
		return getXMLDateFromParam(date);

	}
	
	/**
	 * 
	 * @param sdate
	 * @param formatter
	 * @return
	 * @throws DatatypeConfigurationException
	 * @throws ParseException
	 */
	public static XMLGregorianCalendar getXMLDateFromStringParam(String sdate, DateTimeFormatter formatter)
			throws DatatypeConfigurationException, ParseException {
		
		
		LocalDateTime dateTime = LocalDateTime.parse(sdate, formatter);		
		return getXMLDateFromParam(dateTime);

	}
	
	
	/**
	 * 
	 */
	public static DateFormatSymbols dateFormatSymbolsRussian = new DateFormatSymbols(){

        @Override
        public String[] getMonths() {
            return new String[]{"января", "февраля", "марта", "апреля", "мая", "июня",
                "июля", "августа", "сентября", "октября", "ноября", "декабря"};
        }
        
    };
}
