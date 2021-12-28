package com.day3assign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
1.정수를 입력 받아서 짝수, 홀수를 구별해서 출력.
예) 3 입력시 -> 3 => 홀수
예) 4 입력시 -> 4 => 짝수
*/

public class Day3Q1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		String temp = "";
		
		System.out.print("Type a number: ");
		num = Integer.parseInt(br.readLine());

		temp = num%2==0? "Even number": "Odd number";
		
		/*if(num%2 == 0) {
			temp = "Even number";
		}
		else if(num%2 != 0) {
			temp = "Odd number";
		}*/
		
		System.out.println(temp);
	}
}