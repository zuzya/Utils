package ru.hostco.utils.arrays;

import org.apache.commons.lang3.ArrayUtils;

public class ArraysProcessor {

	
	public static void reverse(byte[] array){		
		ArrayUtils.reverse(array);
	}
	
	public static byte[] reverseNSize(int n, byte[] array){	
		
		byte[] bytesNlength = new byte[n];		
		System.arraycopy(array, 0, bytesNlength, 0, n);
		ArrayUtils.reverse(bytesNlength);
		return bytesNlength;
	}
}
