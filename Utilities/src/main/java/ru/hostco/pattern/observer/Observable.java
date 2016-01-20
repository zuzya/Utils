package ru.hostco.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public interface Observable {

	 void registerObserver(Observer o);
	 void removeObserver(Observer o);
	 void notifyObservers();
	
}
