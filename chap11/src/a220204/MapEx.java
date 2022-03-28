package a220204;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("가", "A");
		map.put("나", "B");
		map.put("다", "C");
		map.put("라", "D");
		map.put("마", "E");
		map.put("마", "G"); //key 중복
		map.put("바", "D"); //value 중복
		
		System.out.println(map); //map타입 마 중복 제거 후 출력
		System.out.println(map.size()); //map타입 마 중복 제거 후 출력됨
		System.out.println(map.isEmpty()); //map이 비어있지 않아서 false로 출력
		
		// keySet(), entrySet()  ==> return타입 Set
		// values() 			 ==> return타입 Collection
		Set<String> result1 = map.keySet(); //값을 순서없이 갖고있음 (List랑 차이)
		System.out.println(" Key객체 반환 : " + result1); // Map에 저장되어있는 Key객체 모두 반환
		
		Collection<String> c = map.values(); 
		System.out.println(c); //모든 값 객체 반환. "마" 중복이라 제거돼서 E 안나옴
		
		List<String> l = new ArrayList<String>(c); //라,바 key가 달라서 value D 중복이지만 출력가넝
		Set<String> s = new HashSet<String>(c); // set은 중복값 제거후 출력 D 1개
		
		System.out.println("List  : " + l);
		System.out.println("Set : " + s);
		
		Set<Map.Entry<String, String>> entrySet = map.entrySet(); //Map 의 Entry 내부인터페이스라 부르기 복잡
		System.out.println(entrySet); //이건 왜 list랑 똑같이 나오는겨
		
		for (String str : result1 ) {
			System.out.println(str);
		}
		
		for (Map.Entry<String, String> e : entrySet) {
			System.out.print(e.getKey());
			System.out.print(e.getValue());
			
		}
	}
}
