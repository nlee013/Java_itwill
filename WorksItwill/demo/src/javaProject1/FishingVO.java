package javaProject1;

import java.io.Serializable;

//직렬화
public class FishingVO implements Serializable{
	
	private String aquaList;
	
	public FishingVO() {
		
	}
	
	//물고기 이름 목록
	public FishingVO (String aquaList) {
		this.aquaList = aquaList;
	}

	public String getAquaList() {
		return aquaList;
	}

	public void setAquaList(String aquaList) {
		this.aquaList = aquaList;
	}
	
	public String toString() {

		String str;
		
		str = String.format("%6s",aquaList);
		
		return str;
	}
	

}
