package com.day15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.excep.OperationAuthenticator;

//계산기 예외처리

public class CalcExcep {

	public static void main(String[] args) {

		//예외처리 할 때 퍼버드 리더가 공부하기 좋아서 쓰는듯
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		double num1, num2, result;
		
		OperationAuthenticator auth = new OperationAuthenticator();
		
		try {
			
			System.out.println("두개의 수[a, b]");//10, 34
			str = br.readLine();
			
			auth.inputFormat(str);//OperationAuthenticator auth에 갔다가 오류 있을시 오류문자 뜸
			
			String[] temp  = str.split(",");//검사가 아니라 temp에 다시 넣어놓기
			
			auth.number(temp[0]);
			
			num1 = Double.parseDouble(temp[0]);
			
			auth.number(temp[1]);
			num2 = Double.parseDouble(temp[1]);
			
			System.out.println("연산자?: ");//++
			str = br.readLine();
			
			auth.operator(str.charAt(0));
			
			char ch = str.charAt(0);
			
			result = 0;
			
			if(ch == '+')
				result = num1 + num2;
			
			else if(ch == '-')
				result = num1 - num2;
			
			else if(ch == '*')
				result = num1 * num2;
			
			else if(ch == '/')
				result = num1 / num2;
			
			System.out.printf("%g %c %g = %g\n", num1, ch, num2, result);
			
		} catch (Exception e) {	
		
			System.out.println(e.toString());
		}
	}

}
