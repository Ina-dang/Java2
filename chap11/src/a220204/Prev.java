package a220204;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Prev {
	public static void main(String[] args) {

		//<E>를 컬렉션클래스 부른다
		/* 컬렉션클래스 : <>꺽쇠 들어간애들 ==> 다수의 데이터를 저장할 수 있는 클래스
		 * Vector<E>
		 * Class<T>
		 * List<E>
		 * ArrayList<E>
		 * HashMap<K,V>
		 */

	//interface List
	//인덱스를 통해서 값을 저장한다
	List<String> list = new ArrayList<String>();
	list.add("가");
	list.add("나");
	list.add("가"); //값의 중복 허용
	
	System.out.println(list); //index로 관리
	System.out.println(list.get(2)); //get메서드 있음
	
	//interface Set : 집합
	Set<Integer> set = new HashSet<Integer>();
	set.add(1);
	set.add(2);
	set.add(1); //값의 중복 허용안함
	
	System.out.println(set); //인덱스 없음 ==> get메서드 없음 ==> 중복허용x
	
	
	//interface Map ==> key, value 가진 pair
	//키를 통해서 값을 저장한다
	
	Map<String, Integer> map = new HashMap<String, Integer>();
	map.put("A", 10);
	map.put("B", 5);
	map.put("C", 20);
	map.put("A", 20); //Key는 중복허용 안되지만 value는 됨
	
	System.out.println(map);

	Set<String> set2 = map.keySet();
	System.out.println("map을 set으로 >> " + set2);
	list.addAll(set2);
	System.out.println(list); //list + set2(map to set)
	System.out.println(list.contains("가")); //가 라는 글자가 포함되어있습니까
	System.out.println(list.contains("다")); //다 라는 글자가 포함되어있습니까
	
	Map<String, String> student = new HashMap<String, String>(); 
	student.put("no", "220001");
	student.put("name", "김경보");
	student.put("kor", "90");
	student.put("eng", "80");
	student.put("math", "80");
	
	System.out.println(student);
	//점수도 String으로 들어가서 나중에 parseInt해야해서 스튜던트는 Map보다 나눠져있는게 나음쓰
	
	
	}
}
