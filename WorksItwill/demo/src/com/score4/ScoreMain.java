package com.score4;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Score4 ob = new ScoreImpl();
		
		int ch;//choice
		
		while(true) {
			
			do {
				System.out.println("Choose one of 1) Input 2) Print 3) Search �й� 4) Search Name 5) Exit: ");
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
			default:
				System.out.print("The End");
				System.exit(0);//���α׷� ����
			}
		}
		
		/*//ScoreVO ob = new ScoreVO(); �� �ڵ带 �Ʒ�ó�� ����
		ScoreVO ob;
		ob = new ScoreVO();
		
		ob.setHak("111");
		//private�� ���� hak�� ��ȸ���η� ���Ա⿡ �Ʒ� ��� ����
		System.out.println(ob.getHak());
		
		ob.setKor(90);
		System.out.println(ob.getKor());
		
		ScoreVO ob1 = new ScoreVO();
		ob1.setHak("222");
		System.out.println(ob1.getHak());*/	
	}
}