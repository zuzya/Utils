package ru.hostco.utils.bytes.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
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
