package com.Fitness;

import java.util.Scanner;

public class Fitness {
	
	Scanner sc = new Scanner(System.in);
	Health[] ht;
	
	public void input() {
		
		ht = new Health[1];
		
		String[] title = {"Create new ID: ","Type your home address: "};
		String[] data = {"Type your height(cm): ", "Type your weight: " };
		
		System.out.print("Type your name: ");
		
		ht[0] = new Health();
		ht[0].name = sc.next();
		
		for(int i = 0; i < 2; i++) {
			
			System.out.print(title[i]);
			ht[0].info[i] = sc.next();
			
			//System.out.printf("%6s %15s",ht[0].id, ht[0].address);
		}
		
		
		for(int i = 0; i < 2; i++) {
			
			System.out.print(data[i]);
			ht[0].dataa[i] = sc.nextDouble();
			
			//System.out.printf("%3d %4d", ht[0].dataa[i]);
		}
	}
	
	public void bmiMeasure() {
		
		ht[0].bmi = ht[0].dataa[0]/ht[0].dataa[1]*100;
		
		if(ht[0].bmi < 18.5) {
			
			System.out.print("Your BMI: " + ht[0].bmi + "저체중 입니다. 좀 더 먹어서 찌우세요");
		}
		else if(ht[0].bmi > 18.5 && ht[0].bmi < 22.9) {
			
			System.out.print("Your BMI: " + ht[0].bmi + "보통 체중 입니다. 지금처럼 유지하세요");

		}
		else if(ht[0].bmi > 23 && ht[0].bmi < 24.9) {
			
			System.out.print("Your BMI: " + ht[0].bmi + "과체중 입니다. 운동해서 좀 더 뺍시다!");

		}
		else if(ht[0].bmi > 25) {
			System.out.print("Your BMI: " + ht[0].bmi + "비만 입니다. 어디서 꿀꿀 소리가 들리네요. 당장 운동합시다!");

		}
		
	}
	
}
