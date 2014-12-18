package com.chapter2._ach.Observer;
import java.util.Observable;
import java.util.Observer;

import com.chapter2._ach.Observable.Match;

public class LastActionDisplay implements Observer, Display {
	Observable observable;
	private String last_action;
	
	public LastActionDisplay(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("<timestamp>: "+last_action);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof Match){
			Match match = (Match) o;
			this.last_action = match.getLastComment();
			display();
		}
		
	}

}
