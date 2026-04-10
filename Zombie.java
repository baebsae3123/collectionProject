package test;

import java.util.Random;

public class Zombie extends Unit { // 추상클래스

    Random r = new Random();

    // 생성자
    public Zombie(String n, int p) {
        super(n, p); // 부모 생성자 호출
    }

    // 메소드
    @Override
    public void move() {
        pos = pos + r.nextInt(3) - 1; // -1,0,1
        System.out.println(name + " 위치 :" + pos);
    }
}