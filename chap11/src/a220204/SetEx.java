package a220204;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		//Set 
		
		// 집합의 연산
		// 교집합, 합집합, 차집합
		
		Set<String> set1 = new HashSet<String>();
		set1.add("사과");
		set1.add("바나나");
		set1.add("복숭아");

		Set<String> set2 = new HashSet<String>();
		set2.add("포도");
		set2.add("바나나");
		set2.add("딸기");

		System.out.println("set1 : " + set1);
		System.out.println("set2 : " + set2);
		
		Set<String> result = new HashSet<String>(set1); // clone ==> set1의 복사본 (셋에는 클론없어서 이렇게)
//		System.out.println(result); 
		
		//교집합
		result.retainAll(set2);
		System.out.println("교집합 : " + result);
		
		result = new HashSet<String>(set1); //초기화
		//합집합
		result.addAll(set2);
		System.out.println("합집합 : " + result);
		
		result = new HashSet<String>(set1);
		//차집합
		result.removeAll(set2);
		System.out.println("차집합 : " + result);
		
		
	}
}
