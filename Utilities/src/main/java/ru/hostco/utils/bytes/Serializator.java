package ru.hostco.utils.bytes;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Serializator {

	/**
	 * Создает массив байтов из объекта
	 * 
	 * @param obj
	 * @return
	 */
	public static byte[] createBytesFromObject(Object obj){
		
		byte[] yourBytes = null;
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutput out = null;
		
		try {
			out = new ObjectOutputStream(bos);
			out.writeObject(obj);
			yourBytes = bos.toByteArray();
			
			return yourBytes;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		  try {
			    if (out != null) {
			      out.close();
			    }
			  } catch (IOException ex) {
			    // ignore close exception
			  }
			  try {
			    bos.close();
			  } catch (IOException ex) {
			    // ignore close exception
			  }
		}
		return yourBytes;
	}
	
	/**
	 * Пытаемся создать объект из массива байтов
	 * 
	 * @param bytes
	 * @return
	 */
	public static Object createObjectFromBytes(byte[] bytes){
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		ObjectInput in = null;
		try {
		  in = new ObjectInputStream(bis);
		  Object o = in.readObject(); 
		  return o;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
		  try {
		    bis.close();
		  } catch (IOException ex) {
		    // ignore close exception
		  }
		  try {
		    if (in != null) {
		      in.close();
		    }
		  } catch (IOException ex) {
		    // ignore close exception
		  }
		}
		
		return null;
	}
	
}
