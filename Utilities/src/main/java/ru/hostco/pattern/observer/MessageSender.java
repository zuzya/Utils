package ru.hostco.pattern.observer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;


public class MessageSender implements Observer{
     
    byte[] data;    
	private Observable subject;

    public MessageSender(Observable subject) {
		super();
		this.subject = subject;
		subject.registerObserver(this);
	}


	
	@Override
	public void update(byte[] data) {
		
		this.data = data;
		display();		
		
		sendMessage(data);
	}
	


	/**
	 * Показать текущее состояние
	 */
	private void display() {
		
		System.out.println(new String(data));
		
	}
	
	private void sendMessage(byte[] data) {
		
//		String queueName = "aqueue";
//		
//		try {
//			MQClient endpoint = new MQEndPoint();
//			endpoint.sendMessage("", queueName, data);
//			
//		} catch (IOException | TimeoutException e) {
//			e.printStackTrace();
//		}
	}



}
