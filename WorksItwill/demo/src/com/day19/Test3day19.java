package com.day19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//정규화 표현식
//java.uti.regex

/*
 [a-z]->a와 z사이
 c[a-z]*: c로 시작하는 영단어(c, ca, cab 등)을 찾거나 그러고 싶을 때 (*는 여러개)
 c[a-z]: c로 시작하는 영단어(c, ca, cz) 두글자를 찾거나 그러고 싶을 때
 c[a-zA-Z0-9]*: c로 시작하는 영단어(c, cA, c4 등)을 찾거나 그러고 싶을 때
 
 c: c로 시작하는 두글자(ca, cB, c&)
 c*: c로 시작하는 모든 글자(ca, cB, c& 등)
 
 [b|c].* 또는 [bc].* 또는 [b-c].*:b가 나오거나 c가 나오거나 bbb (b,c,bbb)
 [\\d]+ 또는 [0-9]+ : 하나 이상의 숫자
 
 회사가면 다 있지만 아래에서 간단하게 만들어보자
 
 */
public class Test3day19 {

	public static void main(String[] args) {

		String[] str = {"bat","baby","bonous", "c", "cA", "ca", "c.", "c0", "car", "combat", "count", "date", "disc"};
		
		Pattern p;
		p = Pattern.compile("c[a-z]*");//c0은 숫자가 들어가서 안나옴
		
		for(String s : str) {
			Matcher m = p.matcher(s);
			
			if (m.matches()) {
			
				System.out.println(s);
				//c0은 숫자가 들어가서 안나옴
			}
		}
		
		System.out.println("------------");
		
		p = Pattern.compile("c.");//c0은 숫자가 들어가서 안나옴
		
		for(String s : str) {
			
			Matcher m = p.matcher(s);
			
			if (m.matches()) {
				System.out.println(s);
				//c0은 숫자가 들어가서 안나옴
			}
		}
		System.out.println("-----------");
		
		String[] mails = {"aaa@aaa.com", "@aaa.co.kr", "@bbb.com", "aaa@vvv.vo.kr", "sss.co.kr", "abc@aaa"};
		
		// [\\w]+ : 한글자 이상의 영, 숫자
		//@
		//(\\.[\\w]+) : 괄호 안에 있는 것은 반드시 .(도트)는 한번은 표시되어야 함
		// \\. : . 이런구조가 반드시 .(도트)는 한번은 와야됌
		
		String pat = "[\\w]+@[\\w]+(\\.[\\w]+)+";//밖에 + (여러개)
		
		for(String s :  mails) {
			
			//pattern과 비교해서(매치) 출력해라
			if(Pattern.matches(pat, s)) {//(패턴, 검사할 대상)
				
				System.out.println(s);
			}
		}
	}

}
