package com.day14;

import java.util.Hashtable;
import java.util.Iterator;

//Map이라는 Interface : Hashtable class, HashMap class
//Hashtable : Vector와 동일
//HashMap : ArrayList와 동일

//Map<key, value>
//Key: 중복값을 가질 수 없음.태생이 중복값 인정 X.
//Key에 해당되는 애는 interface에 해당되고 그 자료형이 set임
//set이 중복값을 허용 X 그러므로 key가 중복값 허용 X
//(이름이 같다는 경우 처럼) 만약에 Key가 중복되면 마지막 값이 저장됨

//Map은 Interator가 없다(있긴 함. Map의 친척 set이 있음)
//Map에 사용되는 key 값이 set이고 set은 iterator가 있어서 그걸 빌려서 씀
//그러므로 Map은 set의 도움으로(우회도로) iterator를 사용할 수 있음
//put(key, 값) : 추가
//get(key, 값) :  data를 읽기. key를 먼저 읽고 값을 읽음

//Value: 
public class Test2day14 {
//여기서 tel이 key이다
	public static final String[] tel = {"111-111", "222-222", "333-333", "444-444", "555-555"};
	
	//value
	public static final String[] name = {"Suzi", "Inna", "Inseon", "Angellina", "Inah"};
	
	public static void main(String[] args) {

		//Hashtable<K, V> -> Key의 자료형 String, Value의 자료형 String을 각각 써주면 됨
		Hashtable<String, String> h = new Hashtable<>();
		
		for(int i = 0; i < name.length; i++) {
			h.put(tel[i], name[i]); //data를 집어넣기.
			//Key와 Value가 저장하는 공간이 각각 있으므로 그 공간이 서로 다름.
		}
		System.out.println(h);
		
		String str;
		
		str = h.get("111-111");//key값을 주면 value값 get으로 가져오기
		
		//if(str == null || str.equals(""))로 나중에 비교많이함
		if(str == null || str.equals("")){
		//str은 string이고 비교는 equals를 사용하지만,null일 때만 ==로 사용가능.
			System.out.println("No data!!");
		}else{
			System.out.println(str);
		}
		
		//key값이 존재하는지 검사
		if(h.contains("222-222")) {
			System.out.println("222-222가 DATA 확인 완료");	
		}
		
		//Value값이 존재하는지 검사
		if(h.contains("Inna")) {
			System.out.println("Inna는 현재 존재하는 인물입니다.");	
		}
		
		//삭제
		h.remove("222-222");
		if(h.contains("222-222")) {
			System.out.println("222-222가 DATA 확인 완료");	
		}else {
			System.out.println("222-222가 DATA 확인 불가!!");
		}
		//의 자료형은 String.
		Iterator<String> it = h.keySet().iterator();
		
		while(it.hasNext()) {
			
			String key = it.next();//보통은 hight bar 다 읽어오지만, it.next();는 key만 읽어옴.
			String value = h.get(key);//value 값을 가져온다.(value값을 읽어옴)
			
			System.out.println(key + ":" + value);
			
		}
	}
}
