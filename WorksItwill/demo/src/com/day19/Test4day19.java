package com.day19;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Scanner;

public class Test4day19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String host;
		
		System.out.print("Host[www.naver.com]? ");//ȣ��Ʈ
		host = sc.next();
		
		try {
			InetAddress ia = InetAddress.getByName(host);
			System.out.println("Ip Address: " + ia.getHostAddress());//ip �ּ�
			System.out.println("Host: " + ia.getHostName());//ȣ��Ʈ
			
			//IP �ּҰ�  32bit : Inet4Address.Inet4Address
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}