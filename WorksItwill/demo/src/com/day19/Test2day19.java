package com.day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test2day19 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Class name[java.lang.String]? ");
		
		String str = br.readLine();
		
		//***아래 이것만 꼭 기억하기!!!!***
		Class cls = Class.forName(str);
		
		//String의 생성자 Constructor 정보를 묻기
		//overloading되는게 많이 있을 수 있어서 배열로 하자
		System.out.println("Constructor's data");//생성자 정
		Constructor<?>[] c = cls.getConstructors();//Constructor<?>의 ? 생략해도 됌
		
		for (int i = 0; i < c.length; i++) {
			
			System.out.println(c[i]);
		}
		
		System.out.println("Field data...");//필드 정보
		//java.lang.reflect 꼭기억해서 이걸로 쓰기
		Field[] f = cls.getFields();
		
		for (int i = 0; i < f.length; i++) {
			
			System.out.println(f[i]);
		}
		
		
		System.out.println("Method data...");//필드 정보
		//java.lang.reflect 꼭기억해서 이걸로 쓰기
		Method[] m = cls.getMethods();
		
		for (int i = 0; i < m.length; i++) {
			
			System.out.println(m[i]);
		}
	}

}
