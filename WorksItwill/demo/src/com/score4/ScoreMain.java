package com.score4;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Score4 ob = new ScoreImpl();
		
		int ch;//choice
		
		while(true) {
			
			do {
				System.out.println("Choose one of 1) Input 2) Print 3) Search 학번 4) Search Name"
									+  "5) Total 정렬 6) 학번 정렬 7)Delete 학번 8)Exit: ");
				ch = sc.nextInt();
			}while(ch < 1);
			
			switch(ch) {
			
			case 1:
				ob.input(); break;
			case 2:
				ob.print(); break;
			case 3:
				ob.searchHak(); break;
			case 4:
				ob.searchName(); break;
			case 5:
				ob.descSortTot(); break;
			case 6:
				ob.ascSortHak(); break;
			case 7:
				ob.deleteHak(); break;
			default:
				System.out.print("The End");
				System.exit(0);//프로그램 종료
			}
		}
		
		/*//ScoreVO ob = new ScoreVO(); 옆 코드를 아래처럼 가능
		ScoreVO ob;
		ob = new ScoreVO();
		
		ob.setHak("111");
		//private로 만든 hak을 우회도로로 빼왔기에 아래 출력 가능
		System.out.println(ob.getHak());
		
		ob.setKor(90);
		System.out.println(ob.getKor());
		
		ScoreVO ob1 = new ScoreVO();
		ob1.setHak("222");
		System.out.println(ob1.getHak());*/	
	}
}
