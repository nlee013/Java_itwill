package com.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test53 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("수식[3 + 5]?");//수식을 37 + 23로 만든다
		String str = br.readLine();
		
		str = str.replaceAll("\\s", "");//공백을 null값으로 만듦
		//System.out.println(str);//확인용
		
		//사용자가 입력한 연산자를 읽어옴
		//1)정석
		String[] oper = {"+", "-", "*", "/"};
		for(String op : oper) {
			
			int pos = str.indexOf(op);
		
		//2)한 번에 합쳐서 이렇게도 사용함
			/*for(String op : new String[] {"+", "-", "*", "/"}) {
				
				int pos = str.indexOf(op)
			}*/
			
			if(pos > -1) {//반환값을 없을 때 -1 <꼭 암기> //숫자 연산자 숫자
														  //연산자를 기준으로 -1, +1
				int num1 = Integer.parseInt(str.substring(0, pos)); //subString 사용하기
				int num2 = Integer.parseInt(str.substring(pos + 1));
				
				//System.out.println(num1 + ":" + num2); //확인용
				
				int result = 0;
				char oper2 = str.charAt(pos);
				
				switch(oper2) {
				case '+':
					result = num1 + num2; break;
				case '-':
					result = num1 - num2; break;
				case '*':
					result = num1 * num2; break;
				case '/':
					result = num1 / num2; break;
				}
				//System.out.printf("%d %c %d = %d", num1, oper2, num2,result);
				//위 코드와 형식이 같다.
				
				//<차이점>
				// 위 코드는 그 자리에서 바로 출력.
				// 아래 코드는 변수안에 값을 저장해두고 다른 곳에서 출력 할 때 사용
				//->sf는 method의 반환값인 return으로 string으로 돌려 받을 때와 같이 사용.
				
				//모양이 만들어 변수 값안에 꼭 담아낸 뒤 return값으로 받아낸다.
				String sf = String.format("%d %c %d = %d", num1, oper2, num2,result);
				
				System.out.println(sf);
			}
		}
	}
}
