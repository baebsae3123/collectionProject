//package test;
package test;

import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Zombie z1 = new Zombie("좀비1", 7);
		Zombie z2 = new Zombie("좀비2",15);
		Zombie z3 = new Zombie("좀비2",15);
		Zombie z4 = new Zombie("좀비2",15);

		ZombieKing zomKing = new ZombieKing("좀비킹", 19);
		
		HeroTest h = new HeroTest();
		

		
		h.Hero("주인공",1,3);

		System.out.println("왼쪽 :1 오른쪽 :2 점프 : 3");
		while(true) {
			if(h.pos < 1) {
				h.pos = 1;
			}
			if(h.pos > 20) {
				h.pos = 20;
			}
			if(z1.pos < 1) {
				h.pos = 1;
			}
			if(z1.pos > 20) {
				h.pos = 20;
			}
			if(z2.pos < 1) {
				h.pos = 1;
			}
			if(z2.pos > 20) {
				h.pos = 20;
			}
			if(zomKing.pos < 1) {
				h.pos = 1;
			}
			if(zomKing.pos > 20) {
				h.pos = 20;
			}
			//플레이어 움직임
			if(h.pos == z1.pos) {
				h.pos = 1;
				h.hp += -1;
				System.out.println("게임 재시작");
				System.out.println(h.hp + " 현재 체력");
				if(h.hp == 0 ) {
					System.out.println("@@@@@@@@@@@@@@@@@");
					System.out.println("GAME OVER");
					System.out.println("@@@@@@@@@@@@@@@@@");
					break;
				}
			}
			if(h.pos == z2.pos) {
				h.pos = 1;
				h.hp += -1;
				System.out.println("게임 재시작");
				System.out.println(h.hp + " 현재 체력");
				if(h.hp == 0 ) {
					System.out.println("@@@@@@@@@@@@@@@@@");
					System.out.println("GAME OVER");
					System.out.println("@@@@@@@@@@@@@@@@@");
					break;
				}
			}
			if(h.pos == zomKing.pos) {
				h.pos = 1;
				h.hp += -1;
				System.out.println("게임 재시작");
				System.out.println(h.hp + " 현재 체력");
				if(h.hp == 0 ) {
					System.out.println("@@@@@@@@@@@@@@@@@");
					System.out.println("GAME OVER");
					System.out.println("@@@@@@@@@@@@@@@@@");
					break;
				}
			}
			
			int HeroMove = sc.nextInt(); // 1 
			


			
			if(h.pos >= 20) {
				System.out.println("미션클리어");
				break;
			}
			if(HeroMove == 1) {
				h.leftmove();
			}else if(HeroMove == 2) {
				h.rightmove();
			}
			else if(HeroMove == 3) {
				h.jump();
			}

			//좀비가 움직임 2마리 // 7- 6으로 움직임
			z1.move(); //2
			z2.move(); //2
			zomKing.move(); //2

			
		}
		

	

	}
}