package com.day19;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Scanner;

public class Test4day19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String host;
		
		System.out.print("Host[www.naver.com]? ");//호스트
		host = sc.next();
		
		try {
			InetAddress ia = InetAddress.getByName(host);//Dns..?
			System.out.println("Ip Address: " + ia.getHostAddress());//ip 주소
			System.out.println("Host: " + ia.getHostName());//호스트

			//IP 주소가  32bit : Inet4Address.Inet4Address
		} catch (Exception e) {
			
		}
	}
}
