package test;

import java.util.Random;
import java.util.Scanner;

public abstract class Unit{ //추상 클래스
	Random r = new Random();

	
	String name;
	int pos;
	public Unit(String name, int pos) {
		this.name = name;
		this.pos = pos;
	}
	
	public void left() {
		pos = -1;
		
	}
	public void right() {
		pos = +1;

	}
	public abstract void move(); // 추상 메서드
}