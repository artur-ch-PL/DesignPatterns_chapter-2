package com.chapter2._ach.Observable;

import java.util.ArrayList;

import com.chapter2._ach.Observer.Observer;
/***
 * 
 * @author Artur
 *  Not used class
 *  Below implementation is simply presentation how could looks yours observable object, but you ought to use JAVA UTIL implmentations ;) 
 */

public class Observable {
	private boolean changed;
	private ArrayList<Observer> observers;
	
	public Observable() {
		observers = new ArrayList<Observer>();
	}
	
	void addObsever(Observer o){
		observers.add(o);
	};
	
	void deleteObserver(Observer o){
		int i = observers.indexOf(o);
		if (i >= 0){
			observers.remove(i);
		}
	};
	
	void notifyObservers(){
		if(changed){
			for(int i=0; i < observers.size(); i++){
				Observer observer = (Observer) observers.get(i);
				observer.update();
			}
		}
	};
	
	void setChange(){
		changed = true;
	};
	
	
}
