package brearu.practice;

//14����
//class�� �ι�° �ð� : ������
//Instance�� ���� �ʱ�ȭ�ϴ� ���

/*
< �ڹ� vs ���̽� >

- �ڹ�: �����ڴ� �޼���� ���.
-Ŭ������ �̸��� �����ϰ� ���ϰ�X

- ���̽�: �����ڴ� �����ϴ��� �������� initialization�� �� ���� ��
-__init__(self, ~ ) ��� ������ �̸� ���.

-class���� ������ ���� ����� �� ������ self.
->(������) ��� ���ľ �ٿ��� �մϴ�.
*/


//[15����] class�� method �߰��ϱ�

//class ��ü���� �Ϲ��� �ٿ��ִ� ���� this(�츮��).
//���� 14�������� ��� �� �ڵ��� method�� �̿��� ª�� �ۼ��غ���
class washing{
	int tbrush;
	int tpaste;
	int soap;
	int shamp;
	int rinse;
	
	washing(int tbrush, int tpaste, int soap, int shamp, int rinse){
		this.tbrush = tbrush;
		this.tpaste = tpaste;
		this.soap = soap;
		this.shamp = shamp;
		this.rinse = rinse;
	}
	
	//method ����
	void print(String setname) {
		
		System.out.println("***" + setname + "***");
		System.out.println("ĩ��: " + tbrush);
		System.out.println("ġ��: " + tpaste);
		System.out.println("��: " + soap);
		System.out.println("��Ǫ: " + shamp);
		System.out.println("����: " + rinse);
	}
}

public class Test1 {//method �߰�

	public static void main(String[] args) {

		washing ob1 = new washing(2, 7, 3, 1,1);
		washing ob3 = new washing(0, 4, 2, 1,1);
		
		ob1.print("**�� 01ȣ");
		ob3.print("**�� 03ȣ");

	}

}


/*class washing{
	int tbrush;
	int tpaste;
	int soap;
	int shamp;
	int rinse;
	
	washing(int A, int B, int C, int D, int E){
		tbrush = A;
		tpaste = B;
		soap = C;
		shamp = D;
		rinse = E;
	}
	
}

public class Test1 {

	public static void main(String[] args) {

		washing ob1 = new washing(2, 7, 3, 1,1);
		washing ob3 = new washing(0, 4, 2, 1,1);
		
		System.out.println("**�� 01ȣ");
		System.out.println("ĩ��: " + ob1.tbrush);
		System.out.println("ġ��: " + ob1.tpaste);
		System.out.println("��: " + ob1.soap);
		System.out.println("��Ǫ: " + ob1.shamp);
		System.out.println("����: " + ob1.rinse);
		
		System.out.println("--------------------");
		
		System.out.println("**�� 3ȣ");
		System.out.println("ĩ��: " + ob3.tbrush);
		System.out.println("ġ��: " + ob3.tpaste);
		System.out.println("��: " + ob3.soap);
		System.out.println("��Ǫ: " + ob3.shamp);
		System.out.println("����: " + ob3.rinse);

	}

}*/