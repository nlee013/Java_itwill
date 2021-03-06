package com.day15;
//일반적으로 List 의 Array List 범용적으로 많이 사용함
import java.util.Scanner;

//5~10자 이내의 영문자를 입력받아 출력하는 프로그램 만들기
//사용자가 문자열: abcdefg 결과: abcd
//문자열: abc 결과: 문자열의 길이는 5~10자 입니다
//문자열: abcde2345 결과: 영문자만 가능합니다

class MyAuthException{//사용자 정의를 인증해주는 예외처리다
	
	public void inputFormat(String str) throws Exception {//MyException도 가능함. 다른 것을 갖다써도 됨
		//사용자 정의 오류는 exception에서 받아서 확인함
		
		//예외발생 시 : 문자 길이
		if(str.length() < 5 || str.length() >10) {//에러가 나는 경우만 써놨음
			
			throw new Exception("5~10자만 입력 가능합니다.");
		}
		
		//예외발생 시 : 영문자
		
		//1번 방법
		//int eng = 0, num = 0;
		
		//2번 방법
		boolean eng = false;
		boolean num = false;
		
		//3번 방법
		//boolean eng, num = false; -> false가 num(마지막 값)에만 들어감
		//eng = num = false;
		
		for(int i = 0; i < str.length(); i++) {
				
			char ch = str.charAt(i);
			
			//if((ch < 65 || ch > 90) && (ch < 97 || ch > 122)) {	
			
			//범위 값이므로 &&로 해야됨
			if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				//eng++;
				eng = true;
				
			}else if((ch >= '0' && ch <= '9')){
				//num++;
				num = true;
			}		
		}	
		
	  //if(eng == 0 || num == 0)
	  if(eng == false || num == false)	
			throw new Exception("영문자와 숫자 혼용만 가능합니다.");
	}
}

public class Day15Assign {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str;
		
		MyAuthException auth = new MyAuthException();
		
		try {//여기서 부터 사용자 입력값 받기
			
			System.out.println("Type 문자열: ");
			str = sc.next();
			
			auth.inputFormat(str);
			System.out.println(str);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
