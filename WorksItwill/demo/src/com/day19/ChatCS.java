package com.day19;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ChatCS extends Frame implements Runnable, ActionListener{

	private MulticastSocket ms = null;;
	private InetAddress xGroup = null;
	
	private String host = "230.111.111.111";//192.168.16.4
	private int port = 7777;
	private String userName = "금요일 사천탕수육";
	
	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	
	//DatagrameSocket:UDP로 datagram packet를 전송하거나 수신함
	//DatagramPacket: UDP를 이용해 전송될 수 있는 data
	//MulticastSocket: 다수의 client에 datagram을 전송
	
	//TCP : 들어온 데이터와 출력할 데이터와 비교해 이상이 있는지 끝까지 검사.
	//data를 보낼 때 매우 신중함.
	
	//D class: 범위는 224.0.0~239.255.25중
	
	public ChatCS() {
		
		ta.setEditable(false);
		add(ta, BorderLayout.CENTER);
		
		add(tf, BorderLayout.SOUTH);
		tf.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setTitle("Groub Chatting [" + host + "]");
		setSize(400, 400);
		setVisible(true);
		tf.requestFocus();
		
	}
	
	//시작할 때 채팅 서버로써 준비하기(처음 시작할 때 연결)
	public void setup() {
		try {
			xGroup = InetAddress.getByName(host);
			ms = new MulticastSocket(port);
			
			//특정그룹에 합치는 과정
			ms.joinGroup(xGroup);
			
			//Thread 가동
			Thread th = new Thread(this);
			th.start();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public void disConnect() {
		
		try {
			ms.leaveGroup(xGroup);
			ms.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	public static void main(String[] args) {

		new ChatCS().setup();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String str = tf.getText().trim();
		//앞과 뒤에 공백을 없앰(trim)
		if(str.equals(""))
			return;
		
		//userName + "]" + str은 다 String으로 .getBytes();로 바꿔서 byte[]안에 넣는다
		byte[] buffer = (userName + "]" + str).getBytes();
		
		try {
			DatagramPacket dp = new DatagramPacket(buffer, buffer.length, xGroup, port);
			
			ms.send(dp);
			
			tf.setText("");
			tf.requestFocus();
			
		} catch (Exception e2) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void run() {
		
		try {
			
			while(true) {
				
				byte[] buffer = new byte[512];//한번에 512자씩 써서 보낸다
				
				//buffer를 buffer.lnegth(크기)만큼 받아내기
				DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
				
				ms.receive(dp);
				
				//받은 data를 문자화 시키기
				String str = new String(dp.getData()).trim();
				
				//출력
				ta.append(str + "\r\n");
				
			}
			
		} catch (Exception e) {
			
			System.out.println(e.toString());
			//에러가 날 때 접속을 끊어주기
			disConnect();
		}
	}

}
