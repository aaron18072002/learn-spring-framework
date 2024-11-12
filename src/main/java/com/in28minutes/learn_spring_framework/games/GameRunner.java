package com.in28minutes.learn_spring_framework.games;

public class GameRunner {
	private MarioGame game;
	
	public GameRunner(MarioGame game) {
		this.game = game;
	}
	
	public void run() {
		this.game.run();
	}
}
