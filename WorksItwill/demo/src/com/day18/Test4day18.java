package com.day18;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//ActionListener
public class Test4day18 extends Frame implements ActionListener{

	private static final long serialVersionUID = 1L;

	// Text Area에 글자, radio button(option button), label등 만들어보기
	
	private Button btn;
	private TextArea ta;
	private TextField tf;
	
	public Test4day18() {
		
		tf = new TextField();
		ta = new TextArea();
		btn = new Button("Add");
		
		//가장 기본적인 추가 기능: BorderLayout
		add(tf, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		add(btn,BorderLayout.SOUTH);
		
		//CCTV 감시자를 test4day18에 단다
		tf.addActionListener(this);//여기선 enter
		btn.addActionListener(this);//여기선 click
		
		setTitle("Nayoung's Window");
		setSize(300, 300);
		setBackground(new Color(170, 227, 227));
		
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);			
			}
		});
	
		setVisible(true);
		
	}
	public static void main(String[] args) {

		new Test4day18();
	}
	//actionPerformed: 실행하는 method
	//ActionListener의 method
	//모든 걸 다 받을 수 있는 Object로 받아낼 준비를 해야됌
	@Override
	public void actionPerformed(ActionEvent e) {//여기서 e인데 evt이면 밑에 evt.getSource();로 바꿔야됌
		
		Object ob = e.getSource();
		
		//전체적인 큰 비교.instanceof 비교
		
		if(ob instanceof Button || ob instanceof TextField){
			
			String str = tf.getText();
			
			//공백을 추가하려고 하는 것을 막기
			if(!str.equals("")) {
				
				ta.append(str + "\r\n");
				
				tf.setText("");//null을 집어넣어서 초기화
				tf.requestFocus();
			}
		}
	}

}
