package com.chapter2._ach.Observer;

import java.util.Observer;
import java.util.Observable;

import com.chapter2._ach.Observable.Match;

public class ScoreDisplay implements Observer, IDisplay {
	Observable observable;
	private String score;
	
	public ScoreDisplay(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
			System.out.println("<score display>\t" + score);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof Match){
			Match match = (Match) o;
			this.score = match.getScore();
			display();
		}
	}

}
