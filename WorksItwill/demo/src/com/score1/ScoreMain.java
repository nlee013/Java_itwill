package com.score1;

public class ScoreMain {

	public static void main(String[] args) {

		Score ob = new Score();
		
		ob.set();
		//ob.inwon = 4;-> 이렇게 쓰면 error남. 나중에 안뜨게 배울 예정.
		ob.input();
		//ob.ranking(); -> private 했기 때문
		ob.print();
	}
	
}
