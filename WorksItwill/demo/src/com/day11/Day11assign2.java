package com.day11;

import java.util.Calendar;
import java.util.Scanner;

/*Calendar�� ��, ��, ���� �Է¹޾� 100(x)�� �� �����(����) �����

�⵵?2016
��?4
��?20
������?100

�� �� �� : 2016�� 4�� 20�� ������
100�� �� : 2016�� 7�� 29�� �ݿ���*/
		
public class Day11assign2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Calendar cal = Calendar.getInstance();
		
		int y, m, d, w, after;
		
		do {
			System.out.println("Type any year: ");
			y = sc.nextInt();
		}while(y<1);
		
		do {
			System.out.println("Type any month: ");
			m = sc.nextInt();
		}while(m < 1 || m > 12);
		
		do {
			System.out.println("Type any date: ");
			d = sc.nextInt();
		}while(d < 1 || d > 31);
		
		do {
			System.out.println("���� ��?: ");
			after = sc.nextInt();
		}while(after < 1);
		
		w = cal.get(Calendar.DAY_OF_WEEK);
		
		String[] week = {"��", "��", "ȭ", "��", "��", "��", "��"};
	
		System.out.println("���� ��: " + y + "��" + m + "��" + d + "��" + week[w-1] + "����");
		
		cal.add(Calendar.DATE, after);//���� ����
		
		//���� ���� ����Ǿ��ְ� get���� �ҷ���
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1; //��(0~11)-> 0���� ���� �����Ƿ� +1
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);

		
		System.out.println(after + "�� ��: " + y + "��" + m + "��" + d + "��" + week[w-1] + "����");

	}

}