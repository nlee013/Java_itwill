package com.day20;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

//2.���� Ŭ������ �����ϱ�

public class FileServerTest {

	class WorkThread extends Thread{
		
		private Socket sc = null;
		
		public WorkThread(Socket sc) {
			
			this.sc = sc;
		}
		
		@Override
		public void run() {
			
			try {
				
				//Server�� ����.����ȭ
				ObjectInputStream ois = new ObjectInputStream(sc.getInputStream());
				System.out.println(sc.getInetAddress().getAddress() + "����...");
				
				//File�� �����
				FileOutputStream fos = null;
				Object ob = null;
				
				while((ob = ois.readObject()) != null) {
					
					if(ob instanceof FileInfo) {//�Ѿ�� ob�� fileinfo�� ���ߴ°�?
						
						FileInfo info = (FileInfo) ob;//���� �س���
						
						if(info.getCode() == 100) {
							
							//�����͸� �޾ƿͼ� ����ȭ ��Ű��
							String str = new String(info.getData());
							fos = new FileOutputStream(str);//���� ����
							System.out.println(str + "���� ���� ����...");//���ϸ�
							
						}else if(info.getCode() == 200) {
							
						}else if(info.getCode() == 100) {//���� ���� ����
							
						}else if(info.getCode() == 110) {//���� ����
							
							if(fos == null)
								break;
							fos.write(info.getData(), 0, info.getSize());
							System.out.println(info.getSize() + "Byte �޴� ��!!!");
							
						}else if(info.getCode() == 200) {//���� ���� ��
							
							if(fos == null)
								break;
							
							//���ϸ��� �Ѿ�´�
							String str = new String(info.getData());
							
							fos.close();//���� ������
							System.out.println(str + "���� ���� ��!!!");
							break;
						}
						
						
					}//end..first if
					
				}//end..while
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		
	}
	
	public void serverStart() {
		
		try {
			ServerSocket ss = new ServerSocket(7777);
			System.out.println("Client ���� �����...");
			
			Socket sc = ss.accept();
			
			WorkThread wt = new WorkThread(sc);
			wt.start();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	public static void main(String[] args) {

		new FileServerTest().serverStart();
	}

}