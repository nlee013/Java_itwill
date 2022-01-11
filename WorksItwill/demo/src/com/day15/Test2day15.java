package com.day15;

import java.util.Scanner;

//예외 처리 : Exception 사용하기

public class Test2day15 {

	public static void main(String[] args) {

		//아래 코드도 try안에 넣어도 무관.
		int num1, num2, result;
		String oper;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("두개의 수?: ");
			
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			System.out.print("연산자?: ");
			oper = sc.next();
			
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
			
			//catch문 여러개 작성 가능
			}catch (NumberFormatException e) {
				System.out.println("Type an integer: ");
			}
			catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다");
			}
			catch (Exception e) {//위에 있는 exception에서 해결 할 수 없다면 여기서 해결
			//exception은 다른 exception보다 제일 아래에 작성함
			//실행하다가 error가 발생하면 catch가 받고
			//Exception이 처리되고 e에게 반환해줌
				
			System.out.println("잘못 입력했습니다. 숫자를 다시 입력해주세요. ");
			System.out.println(e.toString());//이 부분 많이 쓰일 예정.
			e.printStackTrace();
				
			}finally {//error가 나도 언제든지 무조건 실행됨
				System.out.println("언제든지 실행된다.");
			}
			System.out.println("catch문 밖...");
		}
	}

