package com.day18;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//����ó��. �̸�,������, ���� label,  ����(������), ���� �Է¶�, ���, ���� ��ư ���� �� Ŭ��
//java�� label�� ���� �� �迭�� �����

public class Test5day18 extends Frame implements ActionListener{

	private static final long serialVersionUID = 1L;

	private TextField[] tf = new TextField[4];
	private Label result = new Label("", Label.LEFT);//alignment ��
	private Button btn1, btn2;

	public Test5day18() {

		String[] title = {"Name", "Korean", "English", "Mathematics", "Total"};

		setLayout(null);//layout�� �ʱ�ȭ

		for(int i = 0; i < 5; i++) {

			Label lbl = new Label();

			lbl.setText(title[i]);
			lbl.setBounds(10, (i + 1)*30, 90, 20);

			add(lbl);

			if(i != 4) {

				tf[i] = new TextField();
				tf[i].setBounds(100, (i + 1)*30, 60, 20);
				tf[i].addKeyListener(new KeyHandler());

				add(tf[i]);

			}else {
				result.setBounds(100, (i + 1)*30, 60, 20);
				add(result);
			}
		}

		//��� Button
		btn1 = new Button("Result");
		btn1.setBounds(180, 30, 60, 20);

		add(btn1);

		btn1.addActionListener(this);
		btn1.addKeyListener(new KeyHandler());//���� ���� class �־��ֱ�
		//�ѹ� �� �� ���� btn1.addKeyListener(new KeyAdapter()); �� override �ϱ�(�� ����)

		btn2 = new Button("Exit");
		btn2.setBounds(180, 60, 60, 20);

		add(btn2);

		btn2.addActionListener(this);//�Ϸ� ��ġ��
		//btn2.addKeyListener(new KeyHandler());
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setTitle("���� ó��");
		setSize(260, 180);
		setResizable(false);
		setVisible(true);

	}

	public static void main(String[] args) {

		new Test5day18();
	}

	@Override
	public void actionPerformed(ActionEvent e) {//�Ϸ� ��ħ�� ���ؼ� �����ؾ߉�

		Object ob = e.getSource();

		if(ob instanceof Button) {//��ư�϶��� �����ϰ� ����. ��ư�ΰ�?

			Button b = (Button)ob;//downcasting

			//� ��ư���� �����ϱ�
			if(b == btn1) {

				//����
				execute();

			}else if (b == btn2) {
				System.exit(0);
			}
		}
	}

	private void execute() {

		int tot = 0;

		try {

			for(int i = 1; i <=3; i++) {

				tot+= Integer.parseInt(tf[i].getText());//tot�� [i]��° �迭�� ���� �����Ͷ�

			}
			result.setText(Integer.toString(tot));//���ڷ� �ٲ��ֱ�
			//result.setText(""+ tot); -> ��¦ null�� �־��ָ� ���ڰ� �ȴ�

		} catch (Exception e2) {
			result.setText("Type Error!");
		}
	}

	//method ���� Keyboard event ����
	class KeyHandler extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {

			Object ob = e.getSource();

			if(e.getKeyCode() != KeyEvent.VK_ENTER) {

				return;
			}

			//Enter�� ���� �� ����(����)�ϱ�
			if(ob instanceof Button) {

				Button b = (Button)ob;

				if(b == btn1) {//��� ��ư

					//����
					execute();

					return;
				}
			}
			
			if(ob instanceof TextField) {//�Է� ĭ

				TextField t = (TextField)ob;

				for(int i = 0; i < tf.length; i++) {

					//Text 3��(�Է� ĭ ������ ��°)�� Ŀ���� �����߉�
					if(i != 3 && tf[i] == t) {

						tf[i + 1].requestFocus();

						return;

					}else if(tf[3] == t) {

						btn1.requestFocus();
						//return; ���Ⱑ �������̿��� �ᵵ �Ƚᵵ ����.
					}
				}
			}
		}	
	}
}
