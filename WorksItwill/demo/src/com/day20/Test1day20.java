package com.day20;

import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class Test1day20 {

	public static void main(String[] args) {

		try {
			
			//Dom Document 객체를 생성하기 위해 Factory 생성
			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();//객체 생성
			DocumentBuilder parser = f.newDocumentBuilder();
			
			//DOM parser로 부터 입력받은 파일을 파싱함
			Document  xmlDoc = null; //w3c꺼
			
			String url = "Book.xml";
			
			if(url.indexOf("http://") != -1) {//있으면(외부에 파일이 있다면)
				
				URL u = new URL(url);//주소를 받아내기.
				InputStream is = u.openStream();//외부에서 파일 읽어옴
				xmlDoc = parser.parse(is);
				
				//Element : xml 문서의 요소를 표현하기 위해 사용
				Element root = xmlDoc.getDocumentElement();
				System.out.println(root.getTagName());
				
				//첫번째 Book
				//Node: 각 요소들을 읽기 위해 사용함.
				//각 <price>와 같이 하나 하나가 Node임
				Node book1 = root.getElementsByTagName("book").item(0);
				System.out.println(((Element)book1).getAttribute("kind"));
				
				Node title = book1.getFirstChild();
				//System.out.println(title);
				
				Node title1 = title.getNextSibling();
				System.out.println(title1.getNodeName());
				
				Node title2 = title1.getFirstChild();
				System.out.println(title2.getNodeValue());
				
			}else {//없으면(내부 내컴퓨터에 있으면)
				xmlDoc = parser.parse(url);
			}
		} catch (Exception e) {
			
		}
	}

}
