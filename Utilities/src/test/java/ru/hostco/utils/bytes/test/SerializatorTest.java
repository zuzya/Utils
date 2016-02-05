package ru.hostco.utils.bytes.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ru.hostco.utils.bytes.Serializator;


public class SerializatorTest {
	
	@Test
	public void test01(){
		
		A a = new A();
		a.a = 1;
		a.b = 2;
		
		byte[] bytes = Serializator.createBytesFromObject(a);		
		Object obj = (A)Serializator.createObjectFromBytes(bytes);		
		assertTrue(a.equals(obj));
	}

}
