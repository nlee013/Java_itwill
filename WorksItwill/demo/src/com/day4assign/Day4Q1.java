package com.day4assign;

public class Day4Q1 {

	/*1. 1에서 100까지 수의 홀수의 합, 짝수의 합, 전체의 합
	짝수합 : 2550
	홀수합 : 2500
	합 : 5050*/
	
	public static void main(String[] args) {
		
		int n,sum1,sum2; 
		
		//홀수 합
		sum1 = 0;
		
		for(n = 1; n <=100; n +=2) {
			
			sum1 += n;
		}
		
		//짝수 합
		sum2 = 0;
		
		for(n = 2; n <=100; n +=2) {
			
			sum2 += n;
		}
		
		System.out.printf("Result of 홀수의 합: %d\nResult of 짝수의 합: %d\nResult of 전체의 합: %d\n", sum1, sum2, (sum1+sum2));
	}
	
}
