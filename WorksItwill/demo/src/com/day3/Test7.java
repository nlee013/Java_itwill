package com.day3;

public class Test7 {

	//void = 반환값 없음. main은 기본 default.
	
	//System.out.print -> out은 printStream의 out을 가져와서 연결고리로 쓰는것임.
	
	public static void main(String[] args) {

		float f = 0; //초기화. 실제로는 0.0.이 들어가 있는 상태
		double d = 0; //0.0
		
		//일반적으로 i, j, k 등 사용함
		//<= 크거나 같거나를 의미.

		//for 시작값; 최대값; 증가값; i++ = i+1 를 의미.
		
		for(int i = 1; i <=100000; i++ ) {
			
			f += 100000; //f = f + 10000; 와 같음. 1이상의 숫자는 옆과 같게 표함.
			d += 100000;
			
			//System.out.println("Cheers!!:" + i); //출력해서 나타낼 때
			
			System.out.println("float:" + (f/100000));
			System.out.println("double:" + (d/100000));
			
			// 결과값이 딱 떨어지지않고 완전하지 않는 문제가 있음(알려면 2진수법 이해하면 됨)
			
		}
		
	}

	
}
