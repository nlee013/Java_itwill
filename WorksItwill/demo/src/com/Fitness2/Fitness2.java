package com.Fitness2;

import java.util.Scanner;

public class Fitness2 {

	int inwon;
	
	Health2[] ht2;
	
	Scanner sc = new Scanner(System.in);
	
	public void set() {
		
		do {
			System.out.print("How many members do you want to sign up?: ");
			inwon = sc.nextInt();
			
		}while(inwon < 1 || inwon > 10);
		
		ht2 = new Health2[inwon];
	}
	
	public void input() {
		String[] Q = {"Create new ID: ","Type your home address: "};
		String[] dataa = {"Type your height(cm): ", "Type your weight: "};

		for(int i = 0; i < inwon; i++) {
			
			ht2[i] = new Health2();
			
			System.out.print("Type your name: ");
			ht2[i].name = sc.next();
			
			for(int j = 0; j < 2; j++) {
				
				System.out.print(Q[j]);
				ht2[i].info[j] = sc.next();
				
				System.out.print(dataa[j]);
				ht2[i].data[j] = sc.nextDouble();
			}
		}
		
	}
	
	public void bmiMeasure() {
		
		for(int i = 0; i < inwon; i++) {
			
			ht2[i].bmi = ht2[i].data[i]/ht2[i].data[i]*100;
		
			if(ht2[i].bmi < 18.5) {
			
			System.out.print("Your BMI: " + ht2[i].bmi + "저체중 입니다. 좀 더 먹어서 찌우세요");
			}
			
			else if(ht2[i].bmi > 18.5 && ht2[i].bmi < 22.9) {
			
			System.out.print("Your BMI: " + ht2[i].bmi + "보통 체중 입니다. 지금처럼 유지하세요");

			}
			else if(ht2[i].bmi > 23 && ht2[i].bmi < 24.9) {
			
			System.out.print("Your BMI: " + ht2[i].bmi + "과체중 입니다. 운동해서 좀 더 뺍시다!");

			}
			else if(ht2[i].bmi > 25) {
			System.out.print("Your BMI: " + ht2[i].bmi + "비만 입니다. 어디서 꿀꿀 소리가 들리네요. 당장 운동합시다!");

			}
		}
		
	}
	
	public void print() {
		
		for(int i = 0; i < inwon; i++) {
			
			System.out.printf("%6s", ht2[i].name);
			
			for(int j = 0; j < 2; j ++) {
				
				System.out.printf("%6s", ht2[i].info);
				System.out.printf("%4d", ht2[i].data);
				
			}
				System.out.printf("%5d", ht2[i].bmi);
		}
	}
		
}
