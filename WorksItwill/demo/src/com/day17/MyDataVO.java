package com.day17;

import java.io.Serializable;

public class MyDataVO implements Serializable{//implements Serializable을 해줘야 직렬화됌

	private static final long serialVersionUID = 1L;
	private String name;
	private int score;
	
	//생성자를 오버로딩하기
	public MyDataVO(String name, int score) {
		
		this.name = name;
		this.score = score;
	}

	//원래는 항상 getter, setter 해야되지만 이번에는 위에 생성자로 오버로딩해서 만들어서 써보자!
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		
		return name + ":" + score;
	}
}
