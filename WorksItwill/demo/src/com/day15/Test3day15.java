package com.day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

//예외를 의도적으로 발생 시키는 방법

public class Test3day15 {

	public static String getOper() throws Exception {//연산자 받는 코드
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String oper = "";//null;
		
		try {
			System.out.println("연산자?: ");
			oper = br.readLine();
			
			if(!oper.equals("+") && !oper.equals("-") &&//둘다 부정이면 &&
			   !oper.equals("*") && !oper.equals("/")) {
				
				//exception은 class.
				//사용자 정의 오류는 무조건 Exception에 맡긴다.
				//그러므로 무조건 throw Exception 작성
				//e.toString()에서 뿌려준다(출력)
				throw new Exception("연산자 입력 오류!!");	
			}
			
		} catch (IOException e) {//여기서 Exception 여러개 불가능 불가능
			//IOException을 사용하면 위에 throw new Exception에서 오류남.
			//그러므로 public static String getOper()에 throws Exception 추가해야됨
			System.out.println("입력 ERROR!!");
		}
		
		return oper;//연산자를 반환시켜줘야되니까
	}
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1, num2, result;
		String oper;
		
		try {
			System.out.println("First nuebr: ");
			num1 = Integer.parseInt(br.readLine());
			
			System.out.println("Second number: ");
			num2 = Integer.parseInt(br.readLine());
			
			oper = Test3day15.getOper();//여기로 돌려줌. 에러가 난다면 여기서 에러가 나는 것임
			
			result = 0;
			
			if(oper.equals("+")) {
				
				result = num1 + num2;
			}else if(oper.equals("-")) {
				result = num1 - num2;
			}else if (oper.equals("*")) {
				result = num1*num2;
			}else if (oper.equals("/")) {
				result = num1/num2;
			}
			
			System.out.printf("%d %s %d = %d\n", num1, oper, num2, result);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}	

}
