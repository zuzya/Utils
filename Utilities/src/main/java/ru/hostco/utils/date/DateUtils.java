package ru.hostco.utils.date;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DateUtils {

	
	/**
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
	
	public static DateFormatSymbols dateFormatSymbolsRussian = new DateFormatSymbols(){

        @Override
        public String[] getMonths() {
            return new String[]{"января", "февраля", "марта", "апреля", "мая", "июня",
                "июля", "августа", "сентября", "октября", "ноября", "декабря"};
        }
        
    };
}
