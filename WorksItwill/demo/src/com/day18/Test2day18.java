package com.day18;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//Frame���� �����̴� event�� ���� ��
//java�� ���� ����̿��� ,(�޸�)���Ұ�-> interface�� ����� ���߱��� ����(implements WindowListener)
//-> WindowListener�� ���� method���� override�ؾߵ�

public class Test2day18 extends Frame implements WindowListener{
	
	private static final long serialVersionUID = 1L;

	public void Test1day18() {
		
		setTitle("Java Window");
		setSize(300, 300);
		setBackground(new Color(170, 227, 227));
		
		//������ �޾ƶ�.this�� ������ ��.
		addWindowListener(this);
		//Listener�� network�� ������.���⼭�� window�� �����ڸ� �߰��� ��
		setVisible(true);
	}
	
	public static void main(String[] args) {

	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	//â ������ �ݱ�.
	//open������ â ���� �⺻ �޴� �ٸ� ������ �� �� �ִ�
	@Override
	public void windowClosed(WindowEvent e) {
		
	}

	//â�� ������ �ۼ��ǰ� â�� ���� ��(����Ǳ� ��)�˾�âó�� ���𰡸� ����� ��
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
	public void windowIconified(WindowEvent e) {//â �ִ�ȭ
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

}