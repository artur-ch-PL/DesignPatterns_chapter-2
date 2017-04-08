package com.chapter2._ach.Observable;

import java.util.ArrayList;

import com.chapter2._ach.Observer.IObserver;
/***
 * 
 * @author Artur
 *  Not used class
 *  Below implementation is simply presentation how could looks yours observable object, but you ought to use JAVA UTIL implmentations ;) 
 */

public class Observable {
	private boolean changed;
	private ArrayList<IObserver> observers;
	
	public Observable() {
		observers = new ArrayList<IObserver>();
	}
	
	void addObsever(IObserver o){
		observers.add(o);
	};
	
	void deleteObserver(IObserver o){
		int i = observers.indexOf(o);
		if (i >= 0){
			observers.remove(i);
		}
	};
	
	void notifyObservers(){
		if(changed){
			for(int i=0; i < observers.size(); i++){
				IObserver observer = (IObserver) observers.get(i);
				observer.update();
			}
		}
	};
	
	void setChange(){
		changed = true;
	};
	
	
}
