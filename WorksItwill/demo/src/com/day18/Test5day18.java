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

//성적처리. 이름,국영수, 총점 label,  점수(국영수), 총점 입력란, 결과, 종료 버튼 생성 및 클릭
//java는 label을 만들 때 배열로 만든다

public class Test5day18 extends Frame implements ActionListener{

	private static final long serialVersionUID = 1L;

	private TextField[] tf = new TextField[4];
	private Label result = new Label("", Label.LEFT);//alignment 정
	private Button btn1, btn2;

	public Test5day18() {

		String[] title = {"Name", "Korean", "English", "Mathematics", "Total"};

		setLayout(null);//layout을 초기화

		for(int i = 0; i < 5; i++) {

			Label lbl = new Label();

			lbl.setText(title[i]);
			lbl.setBounds(10, (i + 1)*30, 90, 20);//(i + 1)*30 y 교차점마다 입력칸 생성

			add(lbl);

			if(i != 4) {
				
				//배열 만든 것을 꼭 반복문 안에 들어아가야됌
				tf[i] = new TextField();
				tf[i].setBounds(100, (i + 1)*30, 60, 20);
				tf[i].addKeyListener(new KeyHandler());

				add(tf[i]);

			}else {
				result.setBounds(100, (i + 1)*30, 60, 20);
				add(result);//label
			}
		}

		//결과 Button
		btn1 = new Button("Result");
		btn1.setBounds(180, 30, 60, 20);

		add(btn1);

		btn1.addActionListener(this);
		btn1.addKeyListener(new KeyHandler());//내가 만든 class 넣어주기
		//한번 만 쓸 경우는 btn1.addKeyListener(new KeyAdapter()); 후 override 하기(좀 복잡)

		btn2 = new Button("Exit");
		btn2.setBounds(180, 60, 60, 20);

		add(btn2);

		btn2.addActionListener(this);//일러 바치기
		//btn2.addKeyListener(new KeyHandler());
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setTitle("성적 처리");
		setSize(260, 180);
		setResizable(false);
		setVisible(true);

	}

	public static void main(String[] args) {

		new Test5day18();
	}

	@Override
	public void actionPerformed(ActionEvent e) {//일러 바침을 당해서 (이벤트)구분해야됌

		Object ob = e.getSource();

		if(ob instanceof Button) {//버튼일때만 반응하고 싶음. 버튼인가?

			Button b = (Button)ob;//downcasting

			//어떤 버튼인지 구분하기
			if(b == btn1) {

				//연산
				execute();

			}else if (b == btn2) {
				System.exit(0);
			}
		}
	}
	
	//별도의 method를 만들어서 위에 호출
	private void execute() {

		int tot = 0;

		try {

			for(int i = 1; i <=3; i++) {

				tot+= Integer.parseInt(tf[i].getText());//tot의 [i]번째 배열의 값을 가져와라

			}
			result.setText(Integer.toString(tot));//문자로 바꿔주기
			//result.setText(""+ tot); -> 살짝 null을 넣어주면 문자가 된다

		} catch (Exception e2) {
			result.setText("Type Error!");
		}
	}

	//method 끝에 Keyboard event 쓰기
	class KeyHandler extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {

			Object ob = e.getSource();

			if(e.getKeyCode() != KeyEvent.VK_ENTER) {//enter인가?

				return;
			}

			//Enter을 쳤을 때 점검(검증)하기
			if(ob instanceof Button) {

				Button b = (Button)ob;

				if(b == btn1) {//결과 버튼

					//연산
					execute();

					return;
				}
			}
			
			if(ob instanceof TextField) {//입력 칸.

				TextField t = (TextField)ob;//downcast

				for(int i = 0; i < tf.length; i++) {

					//Text 3번(입력 칸 마지막 번째)에 커서를 가져야됌
					if(i != 3 && tf[i] == t) {

						tf[i + 1].requestFocus();//다음칸인 textfield에 커서를 갖다둬라

						return;//빠져나옴

					}else if(tf[3] == t) {

						btn1.requestFocus();
						//return; 여기가 마지막이여서 써도 안써도 무관.//빠져나옴
					}
				}
			}
		}	
	}
}

