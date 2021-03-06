package com.day16;

import java.util.Calendar;

//Thread 보다 Runnable을 많이 쓰는 것 같음

class MyThread3 implements Runnable{

	@Override
	public void run() {
		
		while(true) {
			
			//뒤에 있는 인수 나눠사용할 때 tF는 날짜, tT시간
			System.out.printf("%1$tF %1$tT\n", Calendar.getInstance());
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
		}
	}
}

public class Test3day16 {

	public static void main(String[] args) {

		//현재 시스템의 날짜와 시간을 1초마다 출력해라
		
		Thread th = new Thread(new MyThread3());
		th.start();
		//Thread th = new Thread(new MyThread3()).th.start();같은 형식으로도 가능
	}
}
