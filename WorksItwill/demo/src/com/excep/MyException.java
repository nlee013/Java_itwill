package com.excep;

//예외처리 연습
public class MyException extends Exception{//Exception(부모)을 상속받는 자식 class

	//Exception처럼 큰 것을 상속 받았을 때 공간을 만들라고
	//노란줄이 뜨면 첫번째 줄(Add default serial version D) 누르면 생기는 것
	private static final long serialVersionUID = 1L;
	
	public MyException(String msg) {
		
		super(msg);//부모 생성자를 찾아감
	}
}
