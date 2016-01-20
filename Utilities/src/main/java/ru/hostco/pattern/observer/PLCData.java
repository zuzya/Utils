package ru.hostco.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class PLCData implements Observable {

    private List<Observer> observers = new ArrayList<Observer>();
	     
    private byte[] data;   
    
    public void setNewData(byte[] data) {	
		this.data = data;
		notifyObservers();
	}
    
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);		
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);	
		
	}

	@Override
	public void notifyObservers() {
		
		for(Observer o : observers){
			o.update(data);
		}
		
	} 


}
