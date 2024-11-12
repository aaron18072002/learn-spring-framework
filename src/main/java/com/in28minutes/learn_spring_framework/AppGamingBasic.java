package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.games.GameConsole;
import com.in28minutes.learn_spring_framework.games.GameRunner;
import com.in28minutes.learn_spring_framework.games.MarioGame;
import com.in28minutes.learn_spring_framework.games.SuperContraGame;

public class AppGamingBasic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameConsole mario = new MarioGame();
		GameConsole superContra = new SuperContraGame();
		
		System.out.println(superContra);
		
		GameRunner gameRunner = new GameRunner(superContra);
		gameRunner.run();
	}
}
