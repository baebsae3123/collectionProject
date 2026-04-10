package test;

 class MyThread extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(getName() + ":" +i);
		}
	}
public class ThreadTest{
	public static void main(String[] args) {
		MyThread th = new MyThread();
		th.start();
	}
}

}


