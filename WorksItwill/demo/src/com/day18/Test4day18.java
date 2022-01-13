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

	// Text Area�� ����, radio button(option button), label�� ������
	
	private Button btn;
	private TextArea ta;
	private TextField tf;
	
	public Test4day18() {
		
		tf = new TextField();
		ta = new TextArea();
		btn = new Button("Add");
		
		//���� �⺻���� �߰� ���: BorderLayout
		add(tf, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		add(btn,BorderLayout.SOUTH);
		
		//�����ڸ� test4day18�� �ܴ�
		tf.addActionListener(this);
		btn.addActionListener(this);
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
	//actionPerformed: �����ϴ� method
	//��� �� �� ���� �� �ִ� Object�� �޾Ƴ� �غ� �ؾ߉�
	@Override
	public void actionPerformed(ActionEvent e) {//���⼭ e�ε� evt�̸� �ؿ� evt.getSource();�� �ٲ�߉�
		
		Object ob = e.getSource();
		
		if(ob instanceof Button || ob instanceof TextField){
			
			String str = tf.getText();
			
			//������ �߰��Ϸ��� �ϴ� ���� ����
			if(!str.equals("")) {
				
				ta.append(str + "\r\n");
				
				tf.setText("");//null�� ����־ �ʱ�ȭ
				tf.requestFocus();
			}
		}
	}

}