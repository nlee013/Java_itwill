package com.day8;

public class Test43 {
	//method �ۿ� �� �� �ִ� �ڵ��� ���� ���� ��.�� ����ϱ�
	int a = 5; //instance ����
	
	{//�ʱ�ȭ block
		System.out.println("�ʱ�ȭ ���� a: " + a); //5
		a = 10;
		
		System.out.println("�ʱ�ȭ ���� a: " + a);
	}
	
	static int b;
	static {//static ����
		b = 10;
		System.out.println("static ���� b: " + b);
	}
	//����: ���ϴ� ��
	//���: �׻� ���� ��. �� �� ���� ������ ���α׷��� �ٲٱ� ������ �ȹٲ�.
	//		�빮�ڷ� ����. �ݵ�� �ʱ�ȭ�� ����ߵ�)
	
	final int C;
	
	public Test43() {
		System.out.println("������...");
		C = 100;
		System.out.println("C: " + C);
	}
	
	public static void main(String[] args) {
		
		Test43 ob1 = new Test43();
		Test43 ob2 = new Test43();
		
		
	}

}