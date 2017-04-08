package com.chapter2._ach;

import com.chapter2._ach.Observable.Match;
import com.chapter2._ach.Observer.LastActionDisplay;
import com.chapter2._ach.Observer.ScoreDisplay;
import com.chapter2._ach.Observer.StatDisplay;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Match match = new Match();
		
		LastActionDisplay lastActionDisplay = new LastActionDisplay(match);
		ScoreDisplay scoreDisplay = new ScoreDisplay(match);
		StatDisplay statDisplay = new StatDisplay(match);
		
		match.setUpdate("0:0", "Lets start this show...", "Ball posession (Home/Away) 50% - 50%");
		match.update();
		
		match.setUpdate("1:0", "First shot, and first goal!", "Ball posession (Home/Away) 55% - 45%");
		match.update();
	}

}
