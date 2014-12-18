package com.chapter2._ach.Observable;
import java.util.Observable;


public class Match extends Observable {
	private String score;
	private String lastComment;
	private String stats;
	
	public Match() {};
	
	public void update(){
		setChanged();
		notifyObservers();
	}
	
	public void setUpdate(String score, String lastComment, String stats){
		this.score = score;
		this.lastComment = lastComment;
		this.stats = stats;
	}

	public String getScore() {
		return score;
	}

	public String getLastComment() {
		return lastComment;
	}
	
	public String getStats() {
		return stats;
	}
	
}
