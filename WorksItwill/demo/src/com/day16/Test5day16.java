package com.day16;

//Thread와 Runnable은 명령어가 다를 뿐이지, 똑같은 Thread이다

class MyThread5 implements Runnable{
	
	@Override
	public void run() {
		
		for(int i = 1; i <= 20; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				
			}
		}
	}
}
	

public class Test5day16 {

	public static void main(String[] args) {

		System.out.println("Main 시작...");
		
		Thread th1 = new Thread(new MyThread5());
		Thread th2 = new Thread(new MyThread5());
		Thread th3 = new Thread(new MyThread5());
		
		
		//기본 default는 모든 thread가 종료되면 실행이 끝나지만,
		//Main Tread가 종료될 때까지 실행시키지 않으려면 Daemon Thread 사용하기
		//->Daemon Thread : 다른 Thread의 도움을 주는 Thread.
		//다른(여기서는 Main) Thread가 종료되면, Daemon Thread가 종료되지 않아도 Process가 종료됨
		
		//Daemon 많이 쓰임
		th1.setDaemon(true);
		th2.setDaemon(true);
		th3.setDaemon(true);
		
		th1.start();
		th2.start();
		th3.start();
		
		/*try {
			Thread.sleep(1000);//없으면 종료가 되는 동시에 같이 종료됨
		} catch (Exception e) {

		}*/
		
		try {
			//join(); ->  일반적으로 Main이 끝날 때까지 기다려
			//join()을 A thread()안에 쓰면 A thread가 끝날때까지 기다리게 됨
			th1.join();
			th2.join();
			th3.join();
		} catch (Exception e) {
			
		}
		
		System.out.println("Main 종료...");
	}
}
