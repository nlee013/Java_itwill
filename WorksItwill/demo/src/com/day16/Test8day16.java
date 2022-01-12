package com.day16;

//Thread의 동기화
class MyThread8 implements Runnable{
	 
	private int bank = 10000;//내 통장 잔고
	
	private int getBank() {
		
		return bank;
	}
	
	private int drawMoney(int m) {
		
		bank  -= m;//인출 bank = bank -m;
		return m; //인출 금액
	}
	
	@Override
	public void run() {
		
		int moneyNeed = 6000;//인출할 금액
		int money;
		String msg = "";
		
		try {
			//동기화 블럭
			//synchronized (this) {
				
				if(getBank() >= moneyNeed) {
						money = drawMoney(moneyNeed);
						msg = "인출 성공!!";
				}else {
						money = 0;
						msg = "인출 실패!!";
				}
			//}
			
			System.out.println(Thread.currentThread().getName() + msg + "인출 금액: " + money + ",잔고: " + getBank());
			
		} catch (Exception e) {
		
		}
	}
}

	public class Test8day16 {

	public static void main(String[] args) {

		MyThread8 ob = new MyThread8();//핵심내용: 객체가 하나임
		
		//이 thread th1과 th2가 위의 MyThread8 ob의 ob 하나가지고 경쟁함
		//public void run()가지고 경쟁함
		Thread th1 = new Thread(ob);
		Thread th2 = new Thread(ob);
				
		th1.start();
		th2.start();
	}
}
