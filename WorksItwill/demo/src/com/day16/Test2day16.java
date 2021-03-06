package com.day16;

//이제는 Main Thread 뿐만 아니라 모든 thread가 실행해야지 종료되는 것

class MyThread2 implements Runnable{
	
	private int num;
	private String name;
	
	public MyThread2(int num, String name) {
		
		this.num = num;
		this.name = name;
	}
	
	@Override
	public void run() {
		
		int i = 0;
		
		while(i < num) {
			
			//여기엔 getName()이 없음
			System.out.println(name + ":" + i);
			 i++;
			 
			 try {
				Thread.sleep(100);//interval(시간)하면 Thread.sleep(시간); 1000= 1초
			} catch (Exception e) {
				
			}
		}
	}
}
public class Test2day16 {

	public static void main(String[] args) {

		System.out.println("Main 시작...");
		
		//새로 만든new Thread이름(new Runnable을 만들어준 Thread 이름(,)) ->new Thread(MyThread2)
		Thread th1 = new Thread(new MyThread2(100, "First: "));//Interface Runnable Thread
		Thread th2 = new Thread(new MyThread2(100, "Second"));//Interface Runnable Thread
		
		th1.start();
		th2.start();
		
		System.out.println("Main 종료...");
				
	}

}
