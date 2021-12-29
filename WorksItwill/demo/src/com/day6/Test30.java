package com.day6;

import java.util.Scanner;

//주민등록번호
public class Test30 {

	public static void main(String[] args) {
		
		//합 = (9*2) + (4*3) + ... + (8*5)
		//합 = 11 - 합%11
		//합 = 합%10
		//합 == 9
		
		Scanner sc = new Scanner(System.in);
		
		String jumin;
		int[] chk = {2,3,4,5,6,7,8,9,2,3,4,5};
		int i , tot, su; //total 비교할 su수
		
		System.out.print("주민번호:[******-*******]?");
		jumin = sc.next();
		
		//i라는 변수는 자료형이여서 method없음.
		//여기서 jumin은 class이므로 method있음
		//배열의 length와 달리 ()괄호가 있음
		
		//14자리
		if(jumin.length() != 14) {
			System.out.println("Wrong Type!!!");
			return; //exit(프로그램 자체가) 종료. return 0; 0으로 돌아감
		}
		//System.out.println("14자리 Success!!"); //확인용
		
		tot =0; //초기값. tot <- 총 합계 값을 저장하는 곳
		
		//index : 01234567890123
		//jumin : 941228-2056789
		//check : 234567 892345
		
		for(i = 0; i < 12; i++) {
			
			if(i >= 6) {//뒷자리 비교
				tot+= chk[i]*Integer.parseInt(jumin.substring(i+1, i+2));
				
			}else {//(앞자리)생년월일 비교
				tot+= chk[i]*Integer.parseInt(jumin.substring(i, i+1));
			}
		}
		
		su = 11 - tot%11;
		su = su % 10;
		
		if(su == Integer.parseInt(jumin.substring(13))){
			System.out.println("정확한 주민번호!!");
		}else {System.out.println("부정확한 주민번호!!");
		
		}

		/*String str = "Seoul Korea"; //String 자료형 같은 클래스
		//index가 만들어짐 : 0123456789
		
		System.out.println(str);
		System.out.println(str.substring(0, 3));//점.을 찍으면 수많은 method가 나옴
		System.out.println(str.substring(6, 8));//일부분만 출력. 언급한 index값 출력.
		System.out.println(str.substring(6)); //끝까지
		*/	
		
		}

}
