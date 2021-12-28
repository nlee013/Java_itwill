package com.day4assign;

import java.util.Scanner;

public class Day4Q3 {

	/*3. 두수를 입력받아 적은 수에서 큰수까지의 합
	1~100 까지의 합 : 5050*/
	
	public static void main(String[] args) {
		
	
	   Scanner sc = new Scanner(System.in);
	   
	   int n1, n2, sum; //  2 10
	   
	   sum = 0;
	   
	   System.out.print("Type any two numbers: ");
	   
	   n1 = sc.nextInt();
	   n2 = sc.nextInt();
	   
	   if(n1 < n2) {
		   
		  for(n1 = 0; n1 <= n2; n1++) {
			  sum += n1;
		  }
		   
	   }
	   else if(n1 > n2) {
		   
		   
	   }
	   System.out.println("Result of sum: " + sum);
	
	  }

}
