package com.day19;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Test5day19 extends Frame implements ActionListener{

	private static final long serialVersionUID = 1L;

	private TextArea ta;
	private TextField tf;
	
	public Test5day19() {
		
		ta = new TextArea();
		add(ta);
		
		tf = new TextField();
		tf.addActionListener(this);
		add(tf, BorderLayout.NORTH);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		setTitle("HTML Viewer");
		setSize(400, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {

		new Test5day19();
	}

	@Override
	public void actionPerformed(ActionEvent e) {//위에서 이미 감시해서 여기선 따로 감시안해도 무조건 실행
		
		//HTTP: Highper Text Transform Protocol
		try {
			String str;
			URL url = new URL(tf.getText());
			
			ta.setText("");//초기화
			
			//데이터를 읽어왔을 때 사용하는 가장 기본 Stream:InputStream
			
			//방법1(얘는 필요할 때 연결하면 소스가 다 쏟아져나옴)
			//InputStream is = url.openStream();
			
			//방법2(얘는 좀 더 고급진 느낌)
			URLConnection conn = url.openConnection();
			InputStream is = conn.getInputStream();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(is));//사람이 볼 수 있게 풀어내기
			
			while((str = br.readLine()) != null) {
				
				if(ta.getText().equals("")) {	
					ta.setText(str);
				}else {
					ta.setText(ta.getText() + "\r\n" + str);
				}
					is.close();
			}		
			
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
}
