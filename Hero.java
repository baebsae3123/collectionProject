package test;

import java.util.Random;

public class Hero extends Unit {

    Random r = new Random();
    int hp;
    // 생성자 - 부모 생성자 호출
    public Hero(String n, int p,int h) { //추상클래스
        super(n, p);
        hp = h;
    }

    // 메소드
    public void jump() {
        pos = pos + r.nextInt(3) + 1;
        System.out.println(name + " 위치 :" + pos);
    }

    public void leftmove() {
        pos = pos - 1;
        System.out.println(name + " 위치 :" + pos);
    }

    public void rightmove() {
        pos = pos + 1;
        System.out.println(name + " 위치 :" + pos);
    }
    @Override
    public void move() {

    }
}