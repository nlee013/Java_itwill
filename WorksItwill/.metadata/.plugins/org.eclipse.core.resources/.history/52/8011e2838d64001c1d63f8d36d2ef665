package com.day4;

import java.util.Scanner;

//ctrl + i -> 자동 코드 정리 단축 키

public class Test23 {

	public static void main(String[] args) {
		
		//모든 변수에는 배열이 있다.
		//int num[] = new int[5];
		
		int[] num = new int[5]; //<-기본 정석이므로 이걸 먼저 써보자.
		//만약 변수 이름을 바꾸고 싶으면 앞에 int->string/float/double로 바꿔 작성가능하지만, 섞어 사용하면 관리하기 힘듦.

		Scanner sc = new Scanner(System.in);
		
		System.out.print("다섯개의 변수? "); //5 7 9 3 2
		
		for(int i = 0; i< num.length; i++) { 
			num[i] = sc.nextInt();

		}
		
		//아래코드는 아무 숫자를 입력해도 출력되게 코드 짬
		/*num[0] = sc.nextInt();
		num[1] = sc.nextInt();
		num[2] = sc.nextInt();
		num[3] = sc.nextInt();
		num[4] = sc.nextInt();*/
		
		//지정한 숫자임
		/*num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;*/

		for(int i = 0; i< num.length; i++) { //배열을 사용할 때 <=를 잘 사용안함. 
			
		// 아래코드같은 경우 <=쓰면 'Runtime Error'로 불림. Logic 문제이므로 코드 수정하면 됨.
			
			System.out.println("num["+ i +"]:" + num[i]);
			
		/*System.out.println("num[0]" + num[0]);
		System.out.println("num[1]" + num[1]);
		System.out.println("num[2]" + num[2]);
		System.out.println("num[3]" + num[3]);
		System.out.println("num[4]" + num[4]);*/
		
		}
		
		//배열의 length는 괄호()가 없음
		System.out.println("배열 갯수: " + num.length); //-> length는 위 코드의 int[5]-> 5개를 가져온다. 
		
		num[3] = 100;
		System.out.println("num[3]: " + num[3]);
		
		int a = num[3] - 30;
		System.out.println("a: " + a);
		
	}

}
