package com.assignments;

import java.util.Scanner;

//인원수 10명 이내 점수 받아 오름차순 selection sort 구하기


public class Day13Practice {

	public static void main(String[] args) {

		//인원수	
		int inwon, temp1;
		String temp2;
		
		Scanner sc = new Scanner(System.in);
		
		//인원수 출력
		do {
			System.out.println("How many people do you want to type in here: ");
			inwon = sc.nextInt();
			
		}while(inwon < 1 || inwon > 10);
		
		String[] name = new String[inwon];
		int[] score = new int [inwon];
		
		//인원수
		for(int i = 0; i < inwon; i++) {
			
			System.out.println("Type your name: ");
			name[i] = sc.next();	
			
			System.out.println("Type your score: ");
			score[i] = sc.nextInt();
		}
		
		for(int i = 0; i < score.length-1; i++) {
			for(int j = i + 1; j < score.length; j++) {
				
				if(score[i] > score[j]) {
					
					temp1 = score[i];
					score[i] = score[j];
					score[j] = temp1;
					
					temp2 = name[i];
					name[i] = name[j];
					name[j] = temp2;
				}
			}
		}
		
		//확장 for문은 안될듯..?
		for(int i = 0; i < inwon; i++) {
			System.out.println("Name: " + name[i] + "Score: " + score[i]);
		}
	}

}
