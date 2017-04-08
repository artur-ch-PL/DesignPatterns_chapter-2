package com.chapter2._ach.Observer;

import java.util.Observable;
import java.util.Observer;

import com.chapter2._ach.Observable.Match;

public class StatDisplay implements Observer, IDisplay {
	Observable observable;
	private String stats;
	
	public StatDisplay(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("<stat display>\t" + stats);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof Match){
			Match match = (Match) o;
			this.stats = match.getStats();
			display();
		}
		
	}

}
