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
//server���� client�� ������ Thread�� 1�� �̹Ƿ� 1:1(�� �� ��) ä��.
public class ClientTest extends Frame implements ActionListener, Runnable {

	private static final long serialVersionUID = 1L;

	//������ ���� �ϱ�
	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	
	private Socket sc = null;
	
	//����ڸ� ã�ư��ߵ�
	private String host = "192.168.0.18";//client host ����//local host :192.168.0.18
	//��������Ʈ ���� ipconfig �Է��ϸ�  IPv4 �ּ� Ȯ���ϸ� ��.
	private int port = 7777;
			
	//��������, ���� �ʿ�
	public ClientTest(){
		
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
		
		setTitle("Chatting Client");//ä�� Ŭ���̾�Ʈ
		setSize(300, 400);
		setVisible(true);
	}
	
	public void connect() {
		
		try {
			
			sc = new Socket(host, port);

			Thread th = new Thread(this);
			th.start();//����
			
		} catch (Exception e) {
			
			System.out.println(e.toString());
		}
	}
	
	
	public static void main(String[] args) {

		new ClientTest().connect();//serverStart()�� ȣ���ؾߵǾ.
		//�ؿ� �ִ� run�� �ڵ�����.
		//actionperformer�� ����ġ�� ����Ǳ� ������ ���� ȣ���� method�� ����
	}

	@Override
	public void run() {
	//����ڿ��� �����͸� ���� ��
		
		String str;
		
		try {
			if(sc == null) 
				return;//����������
				
				InputStream is = sc.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				
				while((str = br.readLine()) != null) {
					ta.append("\r\n" + str);
				}
			
		} catch (Exception e) {
			ta.append("\r\n Server ���� ����...");
			//client�� ������ �� �� ����� �Ǹ� ������ ���� ���Ƽ� ������ �ٽ� ���Ұ���
			//�׷��� û�Ҹ� �ʱ�ȭ�� �ؾߵȴ�
			sc = null;
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
			pw.println("Client]" + str);//��������-> client���� ����//print()�� ���� ������ �ȳ���
			
			ta.append("\r\nClient]" + str);//"\r\n����]"
			tf.setText("");
			tf.requestFocus();
			
			
		} catch (Exception e2) {
			ta.append("\r\n Server Connection is end...");//client�� ������ ������ϴ�
			sc = null;
		}
	}

}