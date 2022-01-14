package com.day18;

import java.awt.Color;
import java.awt.Frame;

//이번내용은 Event 단위의 Program이 어떻게 움직이는 확인할 것이다
//EVENT : 드래기, 클릭 등등
//윈도우즈는 c#:창을 form, MFS(C언어), java :창을 frame.window는 frame의 아버지

//AWT
public class Test1day18 extends Frame{//interface로 구현

	private static final long serialVersionUID = 1L;
	
	//main절에 코딩안함
	
	public Test1day18() {
		
		
		setTitle("Java's Window");
		setSize(200, 300);
		setBackground(new Color(170, 227, 227));//RGB
		
		setVisible(true);//기본값이 false이므로 true로 바꿔줌
	}
	public static void main(String[] args) {

		//스스로 생성한다
		new Test1day18();
		//앞에 ob가 필요없는 이유는 웹에서는 event단위(클릭하면 색칠해진다거나) 때문에 필요없다
		
	}

}
