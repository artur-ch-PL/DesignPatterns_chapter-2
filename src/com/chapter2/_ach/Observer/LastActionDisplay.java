package com.chapter2._ach.Observer;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;

import javax.print.attribute.DateTimeSyntax;

import com.chapter2._ach.Observable.Match;

public class LastActionDisplay implements Observer, IDisplay {
	Observable observable;
	private String lastAction;
	
	public LastActionDisplay(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("<action>\t" + lastAction);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof Match){
			Match match = (Match) o;
			this.lastAction = match.getLastComment();
			display();
		}
		
	}

}
