package com.day5assign;

import java.util.Scanner;

public class Day5Q4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int[] num = new int[5];
		int i, j, blank;

		System.out.print("다섯 개의 숫자를 입력하세요.");

		for (i = 0; i < 5; i++) {

			num[i] = sc.nextInt();

		}

		for (i = 0; i < num.length - 1; i++) {

			for (j = i + 1; j < num.length; j++) {

				/*
				 * if (num[i] < num[j]) {
				 * 
				 * blank = num[i]; num[i] = num[j]; num[j] = blank; }
				 */

				if (num[i] < num[j]) {
					
					num[i] = num[i] ^ num[j];
					num[j] = num[i] ^ num[j];
					num[i] = num[i] ^ num[j];
				}

			}

		}

		System.out.printf("제일 큰 수: %d, 제일 작은 수: %d", num[0], num[4]);

	}
}


