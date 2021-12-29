package com.practice;

import java.util.Scanner;

public class Pract1 {

	/*정수를 입력해주세요 : 00 
	홀수입니다/ 짝수입니다
	홀수의 합 : 00 / 짝수의 합 : 00*/
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n;
		int sum = 0;
	
		String str = "";
		
		System.out.println("Type any integer : ");
		
		n = sc.nextInt();

			if(n%2 == 0) {
				str = "Even number";
				
				for(int i = n-2; i <= n; i+=2) {
					sum += i;
				}
				
				System.out.println("Result: " + str + "\nTotal: " + sum);

			}
			else{
				str = "Odd number";
				
				for(int i = n-2; i <= n; i+=2) {
					sum += i;
				}
		
				System.out.println("Result: " + str + "\nTotal: " + sum);

			}

	}
}
