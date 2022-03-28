package a220209;

import java.util.Comparator;
import java.util.TreeSet;

public class HashSetLotto { //hashSet은 중복값 허용 안함 ==> 로또번호에 중복번호 안나오고 알아서 걸러짐
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		
		
		while (set.size() < 6) {
			set.add((int)(Math.random() * 45) + 1);
		}
		
		System.out.println(set); //random 번호 생성
		
//		List<Integer> list = new LinkedList<Integer>(set);
//		Collections.sort(list);
//		System.out.println(list); //random 번호 정
//		
	}
}
