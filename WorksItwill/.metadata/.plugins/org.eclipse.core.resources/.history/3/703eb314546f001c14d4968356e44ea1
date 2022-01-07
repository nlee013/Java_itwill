package com.day13;

import java.util.Calendar;

//4.내부 클래스 Inner class(익명의, 무명의 , Annoymous class)
//내부 클래스를 사용하는 이유: 가까운걸 꺼내기 좋음//나중에 많이 나올 예정

//내부 클래스 Inner class:
//class 안에 class 만든다
//class 안에 method를 만든다
//class를 static으로 만든다
//무명의(이름없는)annoymous class

public class Test69 {
	
	public Object getTitle() {//return 값을 Object로 받는 것을 upCast. 받아 사용하려면 downCast
		
		return new Object() {
			
			@Override
			public String toString() {
				return "Annoymous class...";
			}
		};
	}

	public static void main(String[] args) {

		Test69 ob = new Test69();
		
		//ob.getTitle(); -> 호출하면 반환값을 출력.
		//String str = ob.getTitle(); ->ob.getTitle();에 error
		Object str = ob.getTitle();//downCast
		
		System.out.println(str);
		
		
		//Calendar cal = new Calendar; 이렇게 안함
		/*Calendar cal = new Calendar() {//아래 구조가 내부 클래스임
			
			@Override
			public void roll(int field, boolean up) {
			}
			
			@Override
			public int getMinimum(int field) {
				return 0;
			}
			
			@Override
			public int getMaximum(int field) {
				return 0;
			}
			
			@Override
			public int getLeastMaximum(int field) {
				return 0;
			}
			
			@Override
			public int getGreatestMinimum(int field) {
				return 0;
			}
			
			@Override
			protected void computeTime() {
			}
			
			@Override
			protected void computeFields() {
			}
			
			@Override
			public void add(int field, int amount) {
			}
		};*/
	}

}
