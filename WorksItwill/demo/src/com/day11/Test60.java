package com.day11;

abstract class SortInt{
	
	private int[] value;//배열 선언만 하기
	
	protected abstract void sorting();//abstract method
	
	public void sort(int[]value) {
		
		this.value = value;//여기서 value는 배열
		//주소를 서로 공유하는 것 call by reference
		
		sorting();//형태만(자식과 같은 이름) 같음.
		//자식 method를 사용한 것이 아님
		
	}
	
	public int length() {//내가 만드는 method
		
		if(value == null) {//data가 없다
			return 0;
		}
		return value.length;//배열의 length에는 0이 없다?
	}
	
	protected final int compare(int i, int j) {

		if(value[i] == value[j])//경우의 수를 보기 위해 써둠
			return 0;
		else if(value[i] > value[j])//이것만 해도 가능
			return 1;
		else
			return -1;
	}
	
	protected final void swap(int i, int j) {
		
		int temp;
		temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
	
	public void print() {//출력 method
		if(value == null)
			return; //멈춰라
		
		for(int su : value) {
			System.out.printf("%4d", su);
		}
	}
}

class SortTest extends SortInt{

	@Override
	protected void sorting() {//부모에 있지만 이름만 sorting()일 뿐
		
		//Selection Sort
		for(int i = 0; i < length() - 1; i++) {
			for(int j = i + 1; j < length(); j++) {
				
				if(compare(i, j) > 0) {
					swap(i, j);
				}
			}
		}
	}
}


public class Test60 {

	public static void main(String[] args) {

		int[] value = {40, 56, 30, 12, 6};
		
		SortTest ob = new SortTest();
		ob.sort(value);
		ob.print();
	}

}
