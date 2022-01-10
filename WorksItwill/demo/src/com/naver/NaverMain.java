package com.naver;

import java.util.Scanner;

public class NaverMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Naver ob = new NaverImpl();
		
		int ch;//choice
		
		while(true) {
			
			do {
				System.out.println("Choose one of 1)Create a new account "
						+ "2)Print 3)Find my ID 4)Login 5)Exit: ");
				
				ch = sc.nextInt();
				
			}while(ch < 1);
			
			switch(ch) {
			
			case 1:
				ob.input(); break;//type
			case 2:
				ob.print(); break;
			case 3:
				ob.searchId(); break;
			case 4:
				ob.updatePw(); break;
			default:
				System.out.print("The End");
				System.exit(0);
			}
		}
	}

}
