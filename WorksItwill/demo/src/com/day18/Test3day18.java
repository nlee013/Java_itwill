package com.day18;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test3day18 extends Frame {

	public Test3day18() {
		
		setTitle("Java Window");
		setSize(300, 300);
		setBackground(new Color(170, 227, 227));
		
		//여기서는 다른 것들은 자유롭게 움직여도 되지만
		//종료 버튼에서만 감시자를 붙이려고 한다
		//addWindowListener(new MyWindowAdapter());//생성자 생성?.필요한 class를 안에 넣는다
		
		//WindowAdapter() -> 무명의 Anonymous class이므로 directly로 override 할 수 있는 method를 연결해줌
		//아래류의 코딩은 웹에서 많이 사용함
		//위와 같이 class를 여러개 만들어서 넣어줘도 되지만 아래처럼 써서 필요한 override method만 골라사용하면 됌
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
			}
		});
		
		setVisible(true);
	}
	
	//위치는 맨 위나 아래에 많이 쓰고 이번엔 중간에 써보자
	//Window Listener의 역할을 하게 만든다
	//WindowAdapter에서 사용할 method만 선택해서 override한다
	
	/*
	class MyWindowAdapter extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		
	}*/
	
	public static void main(String[] args) {

		new Test3day18();
	}

}
