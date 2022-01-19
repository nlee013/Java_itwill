package com.day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class FileClientTest {

	public static void main(String[] args) {

		int port = 7777;
		String host = "192.168.16.15";//192.168.16.4
		Socket sc = null;
		
		ObjectOutputStream oos = null;
		
		Scanner scn = new Scanner(System.in);
		
		String filePath;
		
		try {
			
			System.out.print("������ ���� ��� �� ���� ��? :");//d:\\doc\\test.txt;
			filePath = scn.next();
			
			File f = new File(filePath);
			
			if(!f.exists()) {
				
				System.out.println("������ �����ϴ�!");
				System.exit(0);
			}
			
			sc = new Socket(host, port);
			
			oos = new ObjectOutputStream(sc.getOutputStream());
			//������ �� ���� ����(�Ƚᵵ ����)
			oos.flush();
			
			FileInfo info;
			
			//���� ���� ����
			info = new FileInfo();//class�ϱ� ��ü ����
			info.setCode(100);//���� ���� ����(���� �̸�)
			info.setData(f.getName().getBytes());
			info.setSize((int)f.length());
			
			oos.writeObject(info);
			System.out.println(f.getName() + "���� ���� ����...");
			
			Thread.sleep(30);//30 ������ ���� �� 0.3��
			
			//���� ���� �����Ϸ��� ������ �о�߉�
			FileInputStream fis = new FileInputStream(f);
			int data = 0;
			byte[] buffer = new byte[1024];//FileInfo���� 1024�� ������ ��ŭ
			
			while((data = fis.read(buffer, 0, 1024)) != -1) {
				
				info = new FileInfo();
				
				info.setCode(110);
				info.setSize(data);
				info.setData(buffer);
				
				oos.writeObject(info);
				System.out.println(data + "Bytes ���� ��...");
				
				buffer = new byte[1024];
				
				Thread.sleep(300);
				
			}//end..while
			fis.close();
			
			//���� ���� ���� �κ��� �������� ���� �κ��̶� ���� ����
			info = new FileInfo();//class�ϱ� ��ü ����
			info.setCode(200);//���� ���� ����(���� �̸�)
			info.setData(f.getName().getBytes());
			info.setSize((int)f.length());
			
			oos.writeObject(info);
			System.out.println(f.getName() + "���� ���� ��...");
			
			Thread.sleep(30);//30 ������ ���� �� 0.3��
			
			oos.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());//Erroró��
		}
		
	}

}