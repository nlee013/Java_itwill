package com.day5;

import java.util.Random;

public class Test27 {

	//1~45까지의 수 중에서 6개의 난수(Random이라는 함수)를 발생시켜 크기순으로 정렬
	public static void main(String[] args) {

		Random rd = new Random();//math라는 클래스는 복잡하고 자세한 수치 값을 쓸 때 사용
		int[] num = new int[6];
		
		int i, j, n, temp;
		
		n = 0;
		
		//물리적인 의미는 move지만 random은 copy의 개념이 들어가
		//또 같은 수가 나올 수 있다
		
		while(n < 6) {//몇번을 돌려서 나올지 모르기 때문에 for 문을 안쓰고 while문을 사용.
			num[n] = rd.nextInt(45) + 1; //0값이 없을 때 + 1 붙이면 44+1 = 45까지 나옴.
			
			for(i = 0; i < n; i++) {
				
				if(num[i] == num[n]) {
					n--;
					break;//for문을 빠져나오기 위함. 똑같은 값이 1개라도 나올 때 break로 빠져나와 다시 올라감
				}
			}			
			n++; //증가시켜야만 방 num의 수가 증가함
		}
		
		//오름차순 정렬
		//num.length(); -> method 매소드 이므로 여기서 쓰면 안됨.
		for(i = 0; i < num.length-1; i++) {
			for(j = i+1; j < num.length; j++) {
				if(num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		//아래 코드는 for(int k = 0; k < num.length; k++)와 같음
		for(int k : num) {
			System.out.printf("%4d", k);
		}
	}
}
