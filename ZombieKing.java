package test;

import java.util.Random;

public class ZombieKing extends Unit{

	public ZombieKing(String name, int pos) {
		super(name,pos);

	}
	
	@Override
	public void move() {
		Random r = new Random();
		pos = r.nextInt(20)+1;
		System.out.println(name+" 위치 :" + pos);
	}
}