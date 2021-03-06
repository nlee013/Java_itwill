package com.score4;
//매우 중요
//Value Object : Data를 저장. DB를 사용하지 않을때 VO
//DTO : Data Transform Object. DB를 사용 할 때 DTO

public class ScoreVO {
	
	private String hak,name;
	private int kor, eng, mat, tot;

	public ScoreVO(){//기본 생성자
		
	}
	
	//우클릭 -> source -> Generate getters and setters..클릭
	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public int getTot() {
		return kor + eng + mat;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	@Override
	public String toString() {//Object의 toString Override.Equals도 가능하지만 같냐? 비교하기 때문에
		//toString을 많이 사용함
		
		if(hak == null || name == null) {
			return null;
		}
		
		String str = String.format("%6s %6s %4d %4d %4d %4d %4d",
				hak,name,kor, eng, mat, getTot(), getTot()/3);
		
		return str;
	}
	
	//생성자로 많이 초기화하는 경우가 거의 없기 때문에 아래처럼 따로 씀
	/*public void setData(String hak, String name, int kor, int eng, int mat) {
		
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}*/
	
	/*//Hak만 초기화 시키고 싶을 때 : method 만들기
	public void setHak(String hak) {
		
		this.hak = hak;
	}
	
	//private로 만든 hak을 우회 도로 만들기
	public String getHak() {
		
		return hak;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	//private로 만든 name을 우회 도로 만들기
	public String getName() {
			
		return name;
	}
		
	public void setKor(int kor) {
		
		this.kor = kor;
	}
	
	//private로 만든 kor을 우회 도로 만들기
	public int getKor() {
			
		return kor;
	}
		
	public void setEng(int eng) {
		
		this.eng = eng;
	}
	
	//private로 만든 eng을 우회 도로 만들기
		public int getEng() {
			
			return eng;
		}
	public void setMat(int mat) {
		
		this.mat = mat;
	}
	//private로 만든 mat을 우회 도로 만들기
		public int getMat() {
			
			return mat;
		}*/
	
	
	
}
