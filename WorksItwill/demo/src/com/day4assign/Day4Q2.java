package com.day4assign;

import java.util.Scanner;

public class Day4Q2 {

	/*2. 1에서 100까지의 수중 3의 배수의 갯수
	3의 배수의 개수 : 33*/
	public static void main(String[] args) {
		
	int n, t = 0;
	
	Scanner sc = new Scanner(System.in);
	
	for(n = 1; n <= 100; n++) {
		
		if(n%3 ==0) {
			t++;
		}	
	 }
		System.out.println("3의 배수의 개수: " + t);
	}
}
