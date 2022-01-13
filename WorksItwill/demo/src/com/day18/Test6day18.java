package com.day18;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test6day18 extends Frame{
	
	private static final long serialVersionUID = 1L;

	private int x, y;
	private Label lbl = new Label("", Label.CENTER);
	
	public Test6day18() {
		
		add(lbl, BorderLayout.SOUTH);
		
		//Mouse�� ���õ� �ڵ�
		addMouseListener(new MouseHandler());
		addMouseMotionListener(new MouseMotionHandler());
		
		setBackground(new Color(170, 227, 227));//Background Colour
		setForeground(new Color(80, 22, 1));
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setTitle("��ǥ Ȯ��");
		setSize(400, 400);
		//setResizable(false); â �ִ�ȭ ���ϰ� false�� ��
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {

		String str;
		str = "("+ x + "," + y +")";
		g.drawString(str, x, y);
	}
	
	@Override
	public void update(Graphics g) {
		paint(g);
	}
	
	//Mouse
	class MouseHandler extends MouseAdapter{

		@Override
		public void mousePressed(MouseEvent e) {
			
			x = e.getX();
			y = e.getY();
			
			repaint();//update ȣ���ϴ� ���ɾ�
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			
			
			
		}
		
	}
	
	class MouseMotionHandler extends MouseMotionAdapter{

		@Override
		public void mouseDragged(MouseEvent e) {
			
			x = e.getX();
			y = e.getY();
			
			repaint();//update ȣ���ϴ� ���ɾ�
			
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
		
			String str = String.format("(%d, %d)", e.getX(), e.getY());//format�� �ϳ����� ������ ������(����)
			lbl.setText(str);
		}
		
	}
	
	
	
	public static void main(String[] args) {

		new Test6day18();
	}

}