package com.day20;

import java.io.Serializable;

//Client:file을 읽을 때 fileinputStram file을 저장은 fileoutputStream
//Client --upload-->Server
//class를 만들어서 둘만이 아는 code number, size, data를 적는다

//1.파일을 담을 클래스 만들기
//2.만든 클래스를 전송하기
public class FileInfo implements Serializable{//Serializable 반드시 쓰기

	private static final long serialVersionUID = 1L;

	/*
	code
	100: file 전송(file name 전송)
	110: file 내용 전송
	200: file 전송 종료(file name 전송)
	size: 한번에 보낼 수 있는 file 크기
	data: 전송 data
	*/
	
	private int code;
	private int size;
	private byte[] data = new byte[1024];
	//데이터를 보낼 때 반드시 byte형식으로만 보낼 수 있다
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	
	
}
