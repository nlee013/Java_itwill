package com.assignments;

import java.util.Scanner;

public class Day13Practice {

	public static void main(String[] args) {

		String[] name = new String [3];
		int[] num = new int [5];
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("How many people do you want to type in here: ");
			name = sc.next();
			
		}while(name);
	}

}
