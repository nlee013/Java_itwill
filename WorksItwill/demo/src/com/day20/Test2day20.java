package com.day20;

import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Test2day20 {

	public static void main(String[] args) {

		
		try {
			
			//Dom Document ��ü�� �����ϱ� ���� Factory ����
			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();//��ü ����
			DocumentBuilder parser = f.newDocumentBuilder();
			
			//DOM parser�� ���� �Է¹��� ������ �Ľ���
			Document xmlDoc = null; //w3c��
			
			String url = "Book.xml";
			
			if(url.indexOf("http://")!=-1) {//������(�ܺο� ������ �ִٸ�)
				
				URL u = new URL(url);//�ּҸ� �޾Ƴ���.
				InputStream is = u.openStream();//�ܺο��� ���� �о��
				xmlDoc = parser.parse(is);
				
			}else {//������(���� ����ǻ�Ϳ� ������)
				
				xmlDoc = parser.parse(url);
			}
			
			Element root = xmlDoc.getDocumentElement();
			
			NodeList books = root.getElementsByTagName("book");
			
			String out = "";
			String str;
			
			for(int i=0;i<books.getLength();i++) {
				
				Node book = books.item(i);
				str = book.getNodeName();
				
				out += "����: " + str;
				
				NamedNodeMap bookMap = book.getAttributes();
				str = bookMap.getNamedItem("kind").getNodeValue();
				
				out += ", kind: " + str;
				
				NodeList elementList = book.getChildNodes();
				
				for(int j = 0;j < elementList.getLength(); j++) {
					
					Node e = elementList.item(j);
					str = "";
					
					if(e.getNodeType() == Node.ELEMENT_NODE) {
						str = ", " + e.getNodeName();
						out += str + ":";
						out += e.getChildNodes().item(0).getNodeValue();
					}
					
				}
				out += "\n";
			}
			
			System.out.println(out+"aaaaa");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}