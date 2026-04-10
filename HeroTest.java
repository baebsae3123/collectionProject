package test;

import java.util.Random;
import java.util.Scanner;

public class HeroTest {

	String name;
	int pos;
	int hp;
	Random r = new Random();

	// 생성자
	public void Hero(String n , int p, int h) {
			name = n;
			pos = p;
			hp = h;
		
	}
	
	//메소드
	public void jump() {

		pos =  pos + r.nextInt(3)+1;

		System.out.println(name+" 위치 :" + pos);
	}
	public void leftmove() {

		pos =  pos + -1;

		System.out.println("주인공 위치 :" + pos);
	}
	public void rightmove() {

		pos =  pos + +1;

		System.out.println("주인공 위치 :" + pos);
	}
}