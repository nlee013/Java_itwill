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
			
			//Dom Document ��ü�� �����ϱ� ���� Factory ����
			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();//��ü ����
			DocumentBuilder parser = f.newDocumentBuilder();
			
			//DOM parser�� ���� �Է¹��� ������ �Ľ���
			Document  xmlDoc = null; //w3c��
			
			String url = "Book.xml";
			
			if(url.indexOf("http://") != -1) {//������(�ܺο� ������ �ִٸ�)
				
				URL u = new URL(url);//�ּҸ� �޾Ƴ���.
				InputStream is = u.openStream();//�ܺο��� ���� �о��
				xmlDoc = parser.parse(is);
				
				//Element : xml ������ ��Ҹ� ǥ���ϱ� ���� ���
				Element root = xmlDoc.getDocumentElement();
				System.out.println(root.getTagName());
				
				//ù��° Book
				//Node: �� ��ҵ��� �б� ���� �����.
				//�� <price>�� ���� �ϳ� �ϳ��� Node��
				Node book1 = root.getElementsByTagName("book").item(0);
				System.out.println(((Element)book1).getAttribute("kind"));
				
				Node title = book1.getFirstChild();
				//System.out.println(title);
				
				Node title1 = title.getNextSibling();
				System.out.println(title1.getNodeName());
				
				Node title2 = title1.getFirstChild();
				System.out.println(title2.getNodeValue());
				
			}else {//������(���� ����ǻ�Ϳ� ������)
				xmlDoc = parser.parse(url);
			}
		} catch (Exception e) {
			
		}
	}

}