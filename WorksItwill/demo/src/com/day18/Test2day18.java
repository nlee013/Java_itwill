package com.day18;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//Frame에서 움직이는 event를 만들 것
//java는 단일 상속이여서 ,(콤마)사용불가-> interface를 사용해 다중구현 가능(implements WindowListener)
//-> WindowListener가 가진 method들을 override해야됨

public class Test2day18 extends Frame implements WindowListener{
	
	private static final long serialVersionUID = 1L;

	public void Test1day18() {
		
		setTitle("Java Window");
		setSize(300, 300);
		setBackground(new Color(170, 227, 227));
		
		//나한테 달아라.this는 무조건 나.
		addWindowListener(this);
		//Listener는 network의 감시자.여기서는 window상에 감시자를 추가한 것
		setVisible(true);
	}
	
	public static void main(String[] args) {

	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	//창 완전히 닫기.
	//open에서는 창 열면 기본 메뉴 바를 나오게 할 수 있다
	@Override
	public void windowClosed(WindowEvent e) {
		
	}

	//창에 뭔가를 작성되고 창을 닫을 때(종료되기 전)팝업창처럼 무언가를 물어보는 것
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {//창 최대화
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

}
