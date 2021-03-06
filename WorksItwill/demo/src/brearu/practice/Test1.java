package brearu.practice;

//14일차
//class의 두번째 시간 : 생성자
//Instance를 쉽게 초기화하는 방법

/*
< 자바 vs 파이썬 >

- 자바: 생성자는 메서드와 비슷.
-클래스의 이름과 동일하고 리턴값X

- 파이썬: 생성자는 생성하다의 영문자인 initialization의 앞 글자 땀
-__init__(self, ~ ) 라는 고정된 이름 사용.

-class에서 선언한 변수 사용할 때 무조건 self.
->(나만의) 라는 수식어를 붙여야 합니다.
*/


//[15일차] class에 method 추가하기

//class 자체에서 일반을 붙여주는 것은 this(우리의).
//지난 14일차에서 길게 쓴 코딩을 method를 이용해 짧게 작성해보자
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
	
	//method 생성
	void print(String setname) {
		
		System.out.println("***" + setname + "***");
		System.out.println("칫솔: " + tbrush);
		System.out.println("치약: " + tpaste);
		System.out.println("비누: " + soap);
		System.out.println("샴푸: " + shamp);
		System.out.println("린스: " + rinse);
	}
}

public class Test1 {//method 추가

	public static void main(String[] args) {

		washing ob1 = new washing(2, 7, 3, 1,1);
		washing ob3 = new washing(0, 4, 2, 1,1);
		
		ob1.print("**세 01호");
		ob3.print("**세 03호");

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
		
		System.out.println("**세 01호");
		System.out.println("칫솔: " + ob1.tbrush);
		System.out.println("치약: " + ob1.tpaste);
		System.out.println("비누: " + ob1.soap);
		System.out.println("샴푸: " + ob1.shamp);
		System.out.println("린스: " + ob1.rinse);
		
		System.out.println("--------------------");
		
		System.out.println("**세 3호");
		System.out.println("칫솔: " + ob3.tbrush);
		System.out.println("치약: " + ob3.tpaste);
		System.out.println("비누: " + ob3.soap);
		System.out.println("샴푸: " + ob3.shamp);
		System.out.println("린스: " + ob3.rinse);

	}

}*/
