package com.chapter2._ach;

import com.chapter2._ach.Observable.Match;
import com.chapter2._ach.Observer.LastActionDisplay;
import com.chapter2._ach.Observer.ScoreDisplay;
import com.chapter2._ach.Observer.StatDisplay;

public class Main {

	public static void main(String[] args) {
		//create match
		Match match = new Match();
		
		//create displays && attach match
		LastActionDisplay last_action_display = new LastActionDisplay(match);
		ScoreDisplay score_display = new ScoreDisplay(match);
		StatDisplay stat_display = new StatDisplay(match);
		
		// update match
		match.setUpdate("0:0", "Lets start this show.", "Ball posession (Home/Away): 50% - 50%");
		match.update();
		
		match.setUpdate("1:0", "First shot, and first goal!", "Ball posession (Home/Away): 55% - 50%");
		match.update();
	}

}
