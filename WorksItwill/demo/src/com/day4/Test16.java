package com.day4;

import java.util.Scanner;

public class Test16 {

	public static void main(String[] args) {

		//반복문(for, while, do~while)
		
		Scanner sc = new Scanner(System.in);
		
		int unit;
		
		System.out.print("Type unit: "); //7
		unit = sc.nextInt();
		
		//가장 쉽게 사용가능한 반복문은 if이며, 초기값을 설정해줘야됨.
		
		for(int i = 1; i <= 9; i++){ //배열할 때 1=0;하면 i<9;로 부등호의 =가 없음.
			
			System.out.println(unit + "*" + i + "=" + (unit*i));
		}
		
		//여러개를 반복해서 실행하는 반복문
//		System.out.println(unit + "*" + 1 + "=" + (unit)*1);
//		System.out.println(unit + "*" + 2 + "=" + (unit)*2);
//		System.out.println(unit + "*" + 3 + "=" + (unit)*3);
//		System.out.println(unit + "*" + 4 + "=" + (unit)*4);
		
		System.out.println("-----------------------");
		
		int j = 1; //필요한 숫자값을 정해서 초기값을 설정하자. 그리고 보통 while문은 j=1부터 시작한다.(나중에 나올 배열문제 때문에)
		
		while(j <= 9) {
			
			System.out.println(unit + "*" + j + "=" + (unit*j));
			j++;
		}
		
		System.out.println("-----------------------");
		
		int k = 0; //무조건 1번은 실행. do~while문은 ex) 사용자에게 먼저 정보를 요구 후, 조건 만족시 실행/ 불만족시 불실행.
		
		do {
			
			k++;
			System.out.println(unit + "*" + k + "=" + (unit*k));
			
		}while(k < 9);

		
	}

}
