package com.day19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//����ȭ ǥ����
//java.uti.regex

/*
 [a-z]->a�� z����
 c[a-z]*: c�� �����ϴ� ���ܾ�(c, ca, cab ��)�� ã�ų� �׷��� ���� �� (*�� ������)
 c[a-z]: c�� �����ϴ� ���ܾ�(c, ca, cz) �α��ڸ� ã�ų� �׷��� ���� ��
 c[a-zA-Z0-9]*: c�� �����ϴ� ���ܾ�(c, cA, c4 ��)�� ã�ų� �׷��� ���� ��
 
 c: c�� �����ϴ� �α���(ca, cB, c&)
 c*: c�� �����ϴ� ��� ����(ca, cB, c& ��)
 
 [b|c].* �Ǵ� [bc].* �Ǵ� [b-c].*:b�� �����ų� c�� �����ų� bbb (b,c,bbb)
 [\\d]+ �Ǵ� [0-9]+ : �ϳ� �̻��� ����
 
 ȸ�簡�� �� ������ �Ʒ����� �����ϰ� ������
 
 */
public class Test3day19 {

	public static void main(String[] args) {

		String[] str = {"bat","baby","bonous", "c", "cA", "ca", "c.", "c0", "car", "combat", "count", "date", "disc"};
		
		Pattern p;
		p = Pattern.compile("c[a-z]*");//c0�� ���ڰ� ���� �ȳ���
		
		for(String s : str) {
			Matcher m = p.matcher(s);
			
			if (m.matches()) {
			
				System.out.println(s);
				//c0�� ���ڰ� ���� �ȳ���
			}
		}
		
		System.out.println("------------");
		
		p = Pattern.compile("c.");//c0�� ���ڰ� ���� �ȳ���
		
		for(String s : str) {
			
			Matcher m = p.matcher(s);
			
			if (m.matches()) {
				System.out.println(s);
				//c0�� ���ڰ� ���� �ȳ���
			}
		}
		System.out.println("-----------");
		
		String[] mails = {"aaa@aaa.com", "@aaa.co.kr", "@bbb.com", "aaa@vvv.vo.kr", "sss.co.kr", "abc@aaa"};
		
		// [\\w]+ : �ѱ��� �̻��� ��, ����
		//@
		//(\\.[\\w]+) : ��ȣ �ȿ� �ִ� ���� �ݵ�� �ѹ��� ǥ�õǾ�� ��
		// \\. : . �̷������� �ݵ�� �ѹ��� �;߉�
		
		String pat = "[\\w]+@[\\w]+(\\.[\\w]+)+";//�ۿ� + (������)
		
		for(String s :  mails) {
			
			//pattern�� ���ؼ�(��ġ) ����ض�
			if(Pattern.matches(pat, s)) {
				
				System.out.println(s);
			}
		}
	}

}