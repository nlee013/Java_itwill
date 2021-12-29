package com.day4assign;

import java.util.Scanner;

public class Day4Q4 {

	//4. 아래와 같이 구구단을 출력하세요
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int j = 1; j <= 9; j++) {
			
			for(int i = 2; i <= 5; i++) {
				
				System.out.print(i + "*" + j + "=" + (j*i) + "\t");
		  }	
		
			System.out.println();
			
		}
		
		System.out.println();

		
		for(int j = 1; j <= 9; j++) {
			
			for(int i =6; i <= 9; i++) {
				
				System.out.print(i + "*" + j + "=" + (j*i) + "\t");
		  }		
			System.out.println();
		}
	}
}

	

