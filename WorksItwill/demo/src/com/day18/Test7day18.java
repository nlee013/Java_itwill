package com.day18;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

//Abstract Window Toolkit->Swing을 써서 Menu Bar에 Menu만들기

public class Test7day18 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	private JLabel lbl;
	
	
	public Test7day18() {
		
		lbl = new JLabel("메세지", JLabel.CENTER);//(넣을 내용, 위치)
		add(lbl);
		
		//Add Menu 메뉴 추가
		JMenuBar mbar = new JMenuBar();
		JMenu menu;
		JMenuItem mi;
		
		menu = new JMenu("메세지 대화 상자");//메세지 대화 상자
		mi = new JMenuItem("메세지");//메세지
		menu.add(mi);
		mi.addActionListener(this);

		mi = new JMenuItem("입력");//입력
		menu.add(mi);
		mi.addActionListener(this);

		mi = new JMenuItem("종료");//종료
		menu.add(mi);
		mi.addActionListener(this);
		
		mbar.add(menu);
		
		setJMenuBar(mbar);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setTitle("대화상자");//대화상자
		setSize(300, 300);
		setVisible(true);
		
	}

	public static void main(String[] args) {

		new Test7day18();
	}

	@Override
	public void actionPerformed(ActionEvent e) {//여기에 문자가 들어옴//
		
		String str = e.getActionCommand();//입력한 제목값을 그대로 가져옴//메뉴의 이름.String값으로.
		
		//위에 쓴 내용 띄어쓰기 철자 그대로 꼭 쓰기!!
		if(str.equals("메세지")) {
			
			//다이어로그를 내앞에 나타내라
			JOptionPane.showMessageDialog(this, "Friday is coming!", "요일 알림", JOptionPane.INFORMATION_MESSAGE);
			
		}else if (str.equals("입력")) {
			
			String age = JOptionPane.showInputDialog(this, "나이가 몇살이신가요?", "나이 입력:", JOptionPane.QUESTION_MESSAGE);
			
			lbl.setText("당신의 나이는 " + age + "세 이시네요..");
			
		}else if (str.equals("종료")) {
			
			int result;
			
			result = JOptionPane.showConfirmDialog(this, "프로그램을 종료 기기?", "종료확인", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
			
			//lbl.setText(Integer.toString(result));
			
			if(result == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		}
	}

}
