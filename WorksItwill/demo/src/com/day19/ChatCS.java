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
	private String userName = "�ݿ��� ��õ������";
	
	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	
	//DatagrameSocket:UDP�� datagram packet�� �����ϰų� ������
	//DatagramPacket: UDP�� �̿��� ���۵� �� �ִ� data
	//MulticastSocket: �ټ��� client�� datagram�� ����
	
	//TCP : ���� �����Ϳ� ����� �����Ϳ� ���� �̻��� �ִ��� ������ �˻�.
	//data�� ���� �� �ſ� ������.
	
	//D class: ������ 224.0.0~239.255.25��
	
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
	
	//������ �� ä�� �����ν� �غ��ϱ�(ó�� ������ �� ����)
	public void setup() {
		try {
			xGroup = InetAddress.getByName(host);
			ms = new MulticastSocket(port);
			
			//Ư���׷쿡 ��ġ�� ����
			ms.joinGroup(xGroup);
			
			//Thread ����
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
		//�հ� �ڿ� ������ ����(trim)
		if(str.equals(""))
			return;
		
		//userName + "]" + str�� �� String���� .getBytes();�� �ٲ㼭 byte[]�ȿ� �ִ´�
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
				
				byte[] buffer = new byte[512];//�ѹ��� 512�ھ� �Ἥ ������
				
				//buffer�� buffer.lnegth(ũ��)��ŭ �޾Ƴ���
				DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
				
				ms.receive(dp);
				
				//���� data�� ����ȭ ��Ű��
				String str = new String(dp.getData()).trim();
				
				//���
				ta.append(str + "\r\n");
				
			}
			
		} catch (Exception e) {
			
			System.out.println(e.toString());
			//������ �� �� ������ �����ֱ�
			disConnect();
		}
	}

}