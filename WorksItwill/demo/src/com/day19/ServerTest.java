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

//���� ActionListener. Thread �ʿ�. Frame�̶�� �� ��ӹ޾Ƽ� ���߻���� �ȵǹǷ� Runnable���
public class ServerTest extends Frame implements ActionListener, Runnable {

	private static final long serialVersionUID = 1L;

	//������ ���� �ϱ�
	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	
	private ServerSocket ss = null;
	private Socket sc = null;
	
	//��������, ���� �ʿ�
	public ServerTest(){
		
		add(ta, BorderLayout.CENTER);
		add(tf, BorderLayout.SOUTH);
		
		tf.addActionListener(this);
		
		//�����ư
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
			}
		});
		
		setTitle("Chatting server");
		setSize(300, 400);
		setVisible(true);
	}
	
	public void serverStart() {
		
		try {
			
			ss = new ServerSocket(7777);
			ta.setText("Server is staring...");
			
			//client�� ������ ��.client�� ���� ������ holding ����.
			//accept�� ������ ���ϰ� ���������� �޾Ƽ� ����.cpu�� �������·� ��ȯ�Ѵ�
			sc = ss.accept();

			Thread th = new Thread(this);
			th.start();
			
		} catch (Exception e) {
			
			System.out.println(e.toString());
		}
	}
	
	
	public static void main(String[] args) {

		new ServerTest().serverStart();//serverStart()�� ȣ���ؾߵǾ.
		//�ؿ� �ִ� run�� �ڵ�����.
		//actionperformer�� ����ġ�� ����Ǳ� ������ ���� ȣ���� method�� ����
	}

	@Override
	public void run() {
	//����ڿ��� �����͸� ���� ��
		
		String str;
		String ip;
		
		try {
			if(sc == null) 
				return;//����������
				
				InputStream is = sc.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				
				//client IP
				ip = sc.getInetAddress().getHostAddress();
				ta.append("\r\n[" + ip + "] ����!!");
				
				while((str = br.readLine()) != null) {
					ta.append("\r\n" + str);
				}
			
		} catch (Exception e) {
			ta.append("\r\n Client ���� ����...");
			//client�� ������ �� �� ����� �Ǹ� ������ ���� ���Ƽ� ������ �ٽ� ���Ұ���
			//�׷��� û�Ҹ� �ʱ�ȭ�� �ؾߵȴ�
			sc = null;
			ss = null;
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	//����ڿ��� �����͸� ���� ��
	//ActionLisenter�� �������ֹǷ� ���� �� ������ �ʿ����
		
		String str = tf.getText();
		
		//�˻�
		if(str.trim().equals("")) {
			
			return;
		}
		
		if(sc == null) {
			
			return;
		}
		
		try {
			//������ �Ʒ�ó�� �� �� ������ ������ �ڵ�ó�� �� �ٷ� �����ϰ� �����ִ�
			//OutputStream os = sc.getOutputStream();
			PrintWriter pw = new PrintWriter(sc.getOutputStream(), true);
			pw.println("Server]" + str);//��������-> client���� ����//print()�� ���� ������ �ȳ���
			
			ta.append("\r\nServer]" + str);
			tf.setText("");
			tf.requestFocus();
			
		} catch (Exception e2) {
			ta.append("\r\n Client Connection is end...");//client�� ������ ������ϴ�
			sc = null;
		}
	}

}