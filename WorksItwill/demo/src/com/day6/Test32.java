package com.day6;

public class Test32 {

	public static void main(String[] args) {

		
		int[][] a = {{5,3,6},{2,7,8},{5,1,7}};
		int[][] b = {{3,7,9},{9,1,6},{1,4,0}};
		
		int[][] sum = new int[3][3];
		
		int i,j;
		
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < b.length; j++) {
				
				sum[i][j] = a[i][j] + b[i][j]; 
			
				System.out.printf("%4d",sum[i][j]);
			}
			System.out.println();
		}
	}
}
