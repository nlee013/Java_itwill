package com.day6assign;

import java.util.Scanner;

public class Star {

	int num;
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~3 이내의 수?");
		
		num = sc.nextInt();
		
	}
	
	public int type() {
		
		switch(num) {
	case 3:
		System.out.println("***"); break;

	case 2:
		System.out.println("**"); break;

	case 1:
		System.out.println("*"); break;

	default:
		System.out.println("숫자입력 오류!!");
		}
		return num;
	}
}
