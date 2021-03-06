package com.score5;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ScoreImpl implements Score {

	private Map<String, ScoreVO> hMap = new TreeMap<>();
	
	Scanner sc = new Scanner(System.in);
	
	String hak;//사용자가 입력하는 학번 값
	
	@Override
	public void input() {
		
		System.out.print("Type your 학번: ");
		hak = sc.next();
		
		if(searchHak(hak)) {
			
			System.out.println("추가를 실패했습니다. 이미 존재하는 학번 입니다.");
			return;//이 밑 코딩은 실핼하지 마라.
		}
		
		ScoreVO vo = new ScoreVO();
		
		System.out.println("Type your name: ");//suzi
		vo.setName(sc.next());
		
		System.out.println("Type your Korean score: ");//50
		vo.setKor(sc.nextInt());
		
		System.out.println("Type your English score: ");//70
		vo.setEng(sc.nextInt());
		
		System.out.println("Type your Mathematics score: ");//30
		vo.setMat(sc.nextInt());
		
		hMap.put(hak, vo);
		
		System.out.println("추가를 성공했습니다!");
	}

	@Override//학번 검사
	public boolean searchHak(String hak) {
		
		if(hMap.containsKey(hak)) {
			return true;//학번이 이미 존재한다는 뜻
		}
		return false;
	}

	@Override
	public void print() {
		
		Iterator<String> it = hMap.keySet().iterator();
		
		while(it.hasNext()) {
			
			String hak = it.next();
			ScoreVO vo = hMap.get(hak);
			
			System.out.println(hak + " " + vo.toString());
		}
	}

	@Override
	public void delete() {//searchHak 비교
		
		System.out.println("Type 학번 you want to delete in here: ");
		String hak = sc.next();
		
		Iterator<String> it = hMap.keySet().iterator();
		
		while(it.hasNext()) {
			
			ScoreVO vo = hMap.get(hak);
		
			if(hMap.containsKey(hak)) {
			
				hMap.remove(hak);
				System.out.println("삭제 성공!!!");
				//break;
			}else{
				System.out.println("삭제 실패!!!");
			}
		}
		
	}

	@Override
	public void update() {//searchHak 비교//학번 국어 영어 수학 수정
		
		System.out.println("First, type your 학번 : ");
		
		String hak = sc.next();
		
		if(!searchHak(hak)){
			System.out.println("수정을 실패 했습니다!!");
			return;			
		}
		
		Iterator<String> it = hMap.keySet().iterator();
		
			ScoreVO vo = hMap.get(hak);
			
			//if(hMap.containsKey(hak)) {
			
				System.out.println("Type your Korean score: ");//50
				vo.setKor(sc.nextInt());
				
				System.out.println("Type your English score: ");//70
				vo.setEng(sc.nextInt());
				
				System.out.println("Type your Mathematics score: ");//30
				vo.setMat(sc.nextInt());
				
				hMap.put(hak, vo);
				
				System.out.println("수정을 성공했습니다!");
			}
	//}

	@Override
	public void findHak() {//searchHak 비교
		
		System.out.println("Type your 학번 want to find in here: ");
		String hak = sc.next();
		
		Iterator<String> it = hMap.keySet().iterator();
		
			/*ScoreVO vo = hMap.get(hak);
		
			if(hMap.containsKey(hak)) {
			
				System.out.println(vo.toString());
			}*/
		
		if(!searchHak(hak)){
			System.out.println("학번이 존재하지 않습니다.검색 실패!!!");
			return;
		}

		ScoreVO vo = hMap.get(hak);
		System.out.println(hak + vo.toString());
		
	}

	@Override
	public void findName() {
		
		System.out.println();
		System.out.println("Type you Name want to find in here: ");
		
		String name = sc.next();
		
		Iterator<String> it = hMap.keySet().iterator();
		
		//이름 검색에 실패할 때 boolean 쓰기
		boolean flag = false;
		
		while(it.hasNext()) {
			
			String hak = it.next();
			ScoreVO vo = hMap.get(hak);
			
			if(vo.getName().equals(name)) {
				
				System.out.println(hak + " " + vo.toString());
				flag = true;
			}
			
		}
		if(!flag) {
			System.out.println("검색에 실패했습니다. 현재 입력하신 이름이 존재하지 않습니다.");
		}else {
			System.out.println("검색에 성공하였습니다!");
		}
	}

}
