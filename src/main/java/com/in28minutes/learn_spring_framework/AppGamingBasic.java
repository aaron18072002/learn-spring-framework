package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.games.GameRunner;
import com.in28minutes.learn_spring_framework.games.MarioGame;

public class AppGamingBasic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarioGame mario = new MarioGame();
		
		GameRunner gameRunner = new GameRunner(mario);
		gameRunner.run();
	}
}
