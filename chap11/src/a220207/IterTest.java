package a220207;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class IterTest {
	public static void main(String[] args) {
		Integer[] arr = {10, 20, 30, 40};
		List<Integer> integers = new ArrayList<Integer>(Arrays.asList(arr));
		Set<Integer> integers2 = new HashSet<Integer>(integers);
		
		System.out.println(integers);
		System.out.println(integers2);
		
		// ~er, ~or, ~~하는사람 ~~자 >> 인스턴스 생성 목적의 인터페이스
		// ~able ~~가 가능한 >> 클래스에 implements 키워드를 통한 구현 목적의 인터페이스
		Iterator<Integer> iter1 = integers.iterator(); //list
		Iterator<Integer> iter2 = integers2.iterator(); //set
											//iterator메서트를 Iterator타입으로 호출해서 다 iterator화 시켜줌
		
		//iterator화 돼서 hasNext(), next() 호출 가능
//		System.out.println(iter1.next());
//		System.out.println(iter1.next());
//		System.out.println(iter1.next());
//		System.out.println(iter1.next()); //단방향
//		System.out.println(iter1.next()); //한번더 호출하면 NoSuchElimentException 뜸
		//보통 직접 호출보다 반복문으로 조합 많이함
		while (iter1.hasNext()) {
			Integer integer = iter1.next();
			System.out.println(integer);
		}
		
		ListIterator<Integer> listIterator = integers.listIterator(); 
		//listIterator()는 list에서만 돼서 set인 integers2에서는 안나옴
		System.out.println("===================listIterator");
//		System.out.println(listIterator.next());
//		System.out.println(listIterator.next());
//		System.out.println(listIterator.previous());
//		System.out.println(listIterator.hasPrevious());
		
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		System.out.println("===================잘안씀쓰");
		
		
		while (iter2.hasNext()) {
			Integer integer = iter2.next();
			System.out.println(integer);
		}
//		System.out.println(iter2.next());
//		System.out.println(iter2.next());
//		System.out.println(iter2.next());
//		System.out.println(iter2.next());
	}
}
