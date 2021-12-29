package com.day6;

//배열의 배열

public class Test31 {

	public static void main(String[] args) {

		int[][] arr = new int[6][6];//각 열, 행이 0~5 총 6개씩 만듦
		//float[][] arr = new float[6][6]
		int i, j, n;
		
		n = 0;
		
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 5; j++) {
				//System.out.println(i + ":" + j); 확인용
				n++;
				arr[i][j] = n;
				
				//값을 누적시킬 때 +=
				arr[i][5] += n;
				arr[5][j] += n;
				arr[5][5] += n;	
			}
		}
		
		for(i = 0; i < arr.length; i++) {
			for(j = 0; j < arr.length; j++) {
				System.out.printf("%4d", arr[i][j]);
			  //System.out.printf("%4g", arr[i][j]); -> float사용 할 때

			}
			System.out.println();
		}
	}

}
