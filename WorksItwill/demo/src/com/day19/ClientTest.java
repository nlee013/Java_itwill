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
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//감시 ActionListener. Thread 필요. Frame이라는 걸 상속받아서 다중상속이 안되므로 Runnable사용
//server에서 client로 보내는 Thread가 1개 이므로 1:1(일 대 일) 채팅.
public class ClientTest extends Frame implements ActionListener, Runnable {

	private static final long serialVersionUID = 1L;

	//디자인 먼저 하기
	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	
	private Socket sc = null;
	
	//사용자를 찾아가야됨
	private String host = "192.168.0.18";//client host 쓰기//local host :192.168.0.18
	//명령프롬트 들어가서 ipconfig 입력하면  IPv4 주소 확인하면 됌.
	private int port = 7777;
			
	//서버소켓, 소켓 필요
	public ClientTest(){
		
		add(ta, BorderLayout.CENTER);
		add(tf, BorderLayout.SOUTH);
		
		tf.addActionListener(this);
		
		//종료버튼
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
			}
		});
		
		setTitle("Chatting Client");//채팅 클라이언트
		setSize(300, 400);
		setVisible(true);
	}
	
	public void connect() {
		
		try {
			
			sc = new Socket(host, port);

			Thread th = new Thread(this);
			th.start();//실행
			
		} catch (Exception e) {
			
			System.out.println(e.toString());
		}
	}
	
	
	public static void main(String[] args) {

		new ClientTest().connect();//serverStart()도 호출해야되어서.
		//밑에 있는 run은 자동실행.
		//actionperformer는 엔터치면 실행되기 때문에 따로 호출할 method는 없음
	}

	@Override
	public void run() {
	//사용자에게 데이터를 받을 때
		
		String str;
		
		try {
			if(sc == null) 
				return;//실행하지마
				
				InputStream is = sc.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				
				while((str = br.readLine()) != null) {
					ta.append("\r\n" + str);
				}
			
		} catch (Exception e) {
			ta.append("\r\n Server 연결 종료...");
			//client가 접속이 한 번 끊기게 되면 쓰레기 값이 남아서 소켓을 다시 사용불가능
			//그래서 청소를 초기화로 해야된다
			sc = null;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	//사용자에게 데이터를 보낼 때
	//ActionLisenter가 감시해주므로 따로 또 감시할 필요없음
		
		String str = tf.getText();
		
		//검사
		if(str.trim().equals("")) {
			
			return;
		}
		
		if(sc == null) {
			
			return;
		}
		
		try {
			//원래는 아래처럼 쓸 수 있지만 다음줄 코드처럼 한 줄로 간단하게 쓸수있다
			//OutputStream os = sc.getOutputStream();
			PrintWriter pw = new PrintWriter(sc.getOutputStream(), true);
			pw.println("Client]" + str);//내보내기-> client에게 전송//print()만 쓰면 데이터 안나감
			
			ta.append("\r\nClient]" + str);//"\r\n나영]"
			tf.setText("");
			tf.requestFocus();
			
			
		} catch (Exception e2) {
			ta.append("\r\n Server Connection is end...");//client와 접속이 끊겼습니다
			sc = null;
		}
	}

}
