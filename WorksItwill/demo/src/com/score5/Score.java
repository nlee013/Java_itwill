package com.score5;

public interface Score {
	
	public void input();
	public boolean searchHak(String hak);//searchHak을 통해 input()실행 true /실행불가 false
	public void print();
	
	public void delete();
	public void update();
	public void findHak();
	public void findName();
	
}
