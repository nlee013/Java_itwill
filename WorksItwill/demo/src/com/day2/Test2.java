package com.day2;

class Test2 {
	
	//아래 이름이 반드시 변경되면 안됨. 반드시 기본으로 외워두자.
	
	public static void main(String[]args) {
		
		//메모리에 그릇(공간)을 만든다. a라는 그릇에 10을 넣는다는 의미 -> 오른쪽 값을 왼쪽에 넣는다

		//변수(변하는 값) 선언
		//자료형 int (종류는 8가지)
		//int 는 정수 숫자값을 입력할 때 쓰임(소수점, 글자 불가, 약 -21억~21억 사이 숫자)
		
		int a = 10;
		int b = 5;
		
		//비어있는 그릇이 아니라, 무언가(쓰레기값)가 들어있지만 우리는 무엇인지 모름.
		//만약에 숫자 값을 입력한다면, 그 값이 무언가(쓰레기값)를 지우고 대신 들어감.
		
		int c, d;
		
		//그릇에 담긴 값 출력
		System.out.println(a);
		System.out.println(b);
		
		/*System.out.println(c); 쓰레기값은 출력불가.
		->실행 전에 빨간 줄 = 컴파일 오류 = 반드시 오류 수정해야됨.
		Runtime error = 실행 전에는 오류가 없지만 실행 후 오류남
		실행이 6번 돌고 오류가 났을 경우는 Logic을 수정하면 됨
		*/
		
		c = a + b;
		
		System.out.println(c);
		
		d = b-c;
		
		System.out.println(d);
		
		//""안에 들어가는 것은 문자 = string. + 은 붙여써서 쓰임.
		System.out.println(a + "+" + b + "=" + c); 
		System.out.println(); //enter 효과 = 줄 바꿈
		System.out.println(b + "-" + c + "=" + d);
		
		//System.out.print(); 빨간 줄 = 가로 안에 문자를 쓰지 않으면 무조건 오류남
		
		/* < 가장 많이 쓰이는 것>
		
		d = decimal 정수를 저장할 수 있는 곳. 순서대로 값이 들어감  -> int값을 10진수로 출력
		s
		c
		f = double값을 소수로 출력
		g
		
		f = format의 약자 format(모양)
		%n = \n = 줄 바꿈
		 */
		
		System.out.printf("%d + %d = %d%n", a, b, c); 
		System.out.printf("%d - %d = %d", a, b, d);

		
	}

}
