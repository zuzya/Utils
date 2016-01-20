package ru.hostco.utils.arrays.test;

import static org.junit.Assert.*;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

import ru.hostco.utils.arrays.ArraysProcessor;

public class ArraysProcessorTest {

	
	@Test
	public void test_reverse(){
		
		byte[] arr = {0,0,0,1};
		ArraysProcessor.reverse(arr);
		
		byte[] exp =  {1,0,0,0};
		assertArrayEquals(exp, arr);
	}
	
	@Test
	public void test_reverse4size(){
		
		byte[] arr = {0,0,0,1,0,0,0,0};
		byte[] reversed = ArraysProcessor.reverseNSize(4, arr);		
		
		byte[] exp =  {1,0,0,0};
		assertArrayEquals(exp, reversed);
	}
	
	
	@Test
	public void test_reverse3size_2(){
		
		byte[] arr = {0,0,2,0,0,0,0};
		byte[] reversed = ArraysProcessor.reverseNSize(3, arr);		
		
		byte[] exp =  {2,0,0};
		assertArrayEquals(exp, reversed);
	}
}
