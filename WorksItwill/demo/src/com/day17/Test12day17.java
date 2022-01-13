package com.day17;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import com.day8.Data;

//File class:파일 자체 삭제 가능. 경로 생성 등
//File 및 폴더를 관리 할 수 있도록 기능을 제공해주는 class
//File의 복사 또는 이름 변경 등의 조작을 할 경우에만 사용될 뿐
//File의 내용을 입출력 하기 위한 method를 제공하지 않는다

public class Test12day17 {

	public static void main(String[] args) throws IOException {

		 File f = new File("d:\\doc\\test.txt");
		 
		 System.out.println("File name: " + f.getName());
		 System.out.println("File length: " + f.length());//파일개수
		 System.out.println("File path: " + f.getAbsolutePath());
		 System.out.println("표준 path: " + f.getCanonicalPath());
		 System.out.println("Crreated date: "  + new Date(f.lastModified()));//new Date라는 class 사용(연산 불가.날짜만 보여줌)
		 System.out.println("File 저장 path: " + f.getParent());//부모 class까지만 -> d:\\doc
		 System.out.println("읽기 속성: " + f.canRead());//더블 클릭해서 열 수 있느냐
		 System.out.println("쓰기 속성: " + f.canWrite());//저장 할 수 있느냐
		 
	}

}
