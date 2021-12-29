package com.day5;

import java.util.Scanner;

//selection sort 정렬 방법
//비교하는 대상이 1번째가 기준임  num[0]과 num[1]을 비교하기 시작

public class Test25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type any five numbers: ");
		
		int [] num = new int[5];
		
		int i,j,temp;
		
		for(i = 0; i < num.length; i ++) {
			num[i] = sc.nextInt();
		}
		
		System.out.print("Source Data: ");
		for(i = 0; i < num.length; i++) {
			System.out.printf("%4d",num[i]);
		}
		System.out.println();
		
		//selection sort의 공식. 기술면접에 많이 나옴.꼭 외우기
		
		for(i = 0; i < num.length-1; i ++) {
			
			for(j = i + 1; j <num.length; j++) {
				//System.out.println(i + ":" + j);
				
				if(num[i] > num[j]) {
					
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		
		//확장 for 문. 배열 일 때만 사용.
		System.out.print("Sorted Data: ");
		for(int k : num) {//배열의 자료형은 int. DB 에서 많이 사용
						 //num에 들어있는 int값을 순서대로 출력해서 보여줌.
			System.out.printf("%4d",k);
		}
		System.out.println();
	}

}


