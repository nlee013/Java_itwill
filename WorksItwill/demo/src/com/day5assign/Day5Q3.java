package com.day5assign;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

//3. 1~3사이의 난수를 발생시켜 가위,바위,보 게임 프로그램 작성
//1:가위, 2:바위, 3:보

public class Day5Q3 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		//System.out.print("1:가위, 2:바위, 3:보");
		//switch 문
		int com, user, cnt;
		int[] num = new int[3];
		char ans;
		
		Random rd = new Random();
		
		com = rd.nextInt(3) + 1;
		
		System.out.println(com);//com이 생각한 값
		
		String tmp = sc.nextLine(); 
		
		user = Integer.parseInt(tmp);

		
		while(true) {
			
			for(int i = 0; i < 3; i++) {
			
				System.out.print("가위 바위 보 게임!\n설명: 1:가위, 2:바위, 3:보 중 숫자 하나를 작성하자");
				user = sc.nextInt();
			
				System.out.println("I" + com);
				
				switch(com) {
				
				case 1:
					System.out.println("1:가위");
					
				case 2: 
					System.out.println("2:바위");
					break;
					
				case 3: 
					System.out.println("3:보");
					break;
				}
				
				System.out.println("You" + user);
				
				switch(user) {
				
				case 1:
					System.out.println("1:가위!");
					
				case 2: 
					System.out.println("2:바위");
					break;
					
				case 3: 
					System.out.println("3:보");
					break;
				}
				
				if(user == com) {
					System.out.println("컴퓨터와 비겼습니다.");
				}
				else if((user == 1 && com ==3)||(user==2 && com ==1)||(user == 3 &&com ==2)) {
					System.out.println("당신이 이겼습니다");
				}
				else {
					System.out.println("컴퓨터가 이겼습니다");
				}
				/*int j = 0;
					
				if((com == 1 && num[j] == 2) || com == 2 && num[j] == 3 || com == 3 && num[j] == 1) {//1 2 //1 3
						System.out.print("You Win!!\n");
						//break;
				}
				else if((com == 1 && num[j] == 3) || com == 2 && num[j] == 1 || com == 3 && num[j] == 2 ){
						System.out.print("You Lose!!\n");
						break;
				}*/
			}	
			
			System.out.print("Do you want to continue? [Y/N]");
			
			ans = (char)System.in.read();
			
			if(ans != 'Y' && ans != 'y') {
				System.out.println("The End!");
	        break;
			}
			
	}

  }
}
