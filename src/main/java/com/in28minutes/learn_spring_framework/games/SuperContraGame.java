package com.in28minutes.learn_spring_framework.games;

public class SuperContraGame {
	@Override
	public String toString() {
		return "Super Contra Game";
	}
	
	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("Shit down");
	}
	
	public void left() {
		System.out.println("Stop");
	}
	
	public void right() {
		System.out.println("Shooting");
	}
}
