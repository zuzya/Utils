package ru.hostco.utils.xml;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class UniversalUnmarshaller {

	public static <T> String marshall(T object, Class<T> clazz)
			throws JAXBException {
		JAXBContext ctx = JAXBContext.newInstance(clazz);
		StringWriter sw = new StringWriter();
		Marshaller marshaller = ctx.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(object, sw);
		return sw.toString();
	}
	
	/**
	 * Марашаллинг с помощью враппера JAXBElement'a, чтобы не писать аннотацию @XmlRoot
	 * 
	 * @param object - обернутый объект
	 * @param clazz - класс объекта
	 * @return
	 * @throws JAXBException
	 */
	public static <T, E> String marshallFromJAXBElement(JAXBElement<T> object, Class<T> clazz)
			throws JAXBException {
		JAXBContext ctx = JAXBContext.newInstance(clazz);
		StringWriter sw = new StringWriter();
		ctx.createMarshaller().marshal(object, sw);
		return sw.toString(); 
	}

	public static <T> void marshall(T object, StringWriter sw, String namesapace)
			throws JAXBException {
		
		JAXBContext jc = JAXBContext.newInstance(namesapace);
        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(object, sw);
	}
	
	public static <T> String marshall(T object, String namesapace)
			throws JAXBException {
		
		JAXBContext jc = JAXBContext.newInstance(namesapace);
        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        StringWriter sw = new StringWriter();
        marshaller.marshal(object, sw);
        
        return sw.toString();
	} 
	
	@SuppressWarnings("unchecked")
	public static <T> T unmarshall(String objectString, Class<T> clazz)
			throws JAXBException {
		JAXBContext ctx = JAXBContext.newInstance(clazz);
		return (T) ctx.createUnmarshaller().unmarshal(
				new StringReader(objectString));
	}
	
	/**
	 * Анмаршалинг, возвращающий элемент без JAXB-враппера
	 * 
	 * @param objectString
	 * @param clazz
	 * @return
	 * @throws JAXBException
	 */
	@SuppressWarnings("unchecked")
	public static <T> T unmarshall_withJAXBElementValue(String objectString, Class<T> clazz)
			throws JAXBException {
		JAXBContext ctx = JAXBContext.newInstance(clazz);
		
		JAXBElement<T> el = (JAXBElement<T>) ctx.createUnmarshaller().unmarshal(new StringReader(objectString));
		return el.getValue();
	}
	
	
	@SuppressWarnings("unchecked")
	public static <T> T unmarshall(String objectString, String namesapace)
			throws JAXBException {
		
		JAXBContext jc = JAXBContext.newInstance(namesapace);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        JAXBElement<T> el = (JAXBElement<T>) unmarshaller.unmarshal(
        		new StringReader(objectString));
        return el.getValue();
	}
	
	
	/**
	 * 
	 * 
	 * @param data
	 * @param clazz
	 * @return
	 * @throws JAXBException
	 */
	@SuppressWarnings({ "unchecked", "restriction" })
	public static <T> T unmarshall(byte[] data, Class<T> clazz)
			throws JAXBException {
		
		JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
		InputStream is = new ByteArrayInputStream(data);		
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		T el = (T) jaxbUnmarshaller.unmarshal(is);	
		
        return el;
	}
	


			


}
