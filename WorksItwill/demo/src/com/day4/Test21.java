package com.day4;

import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;

		System.out.print("1~3 이내의 수?");

		num = sc.nextInt(); //사용자가 사용하는 숫자의 기본 default 값.

		switch(num) { //switch case문

		case 3:
			System.out.println("***"); break;

		case 2:
			System.out.println("**"); break;

		case 1:
			System.out.println("*"); break;

		default:
			System.out.println("숫자입력 오류!!");

		}

	}

}
