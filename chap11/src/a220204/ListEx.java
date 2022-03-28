package a220204;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
		//toArray() : list 를 array로
		//Arrays.asList([]) : array를 list로
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		
		System.out.println(list);
		
		list.add(5);
		
		System.out.println(list);
		
		list.add(2,6);
		
		System.out.println(list);
		
		System.out.println(list.indexOf(1)); //1이 몇번째 인덱스에 있는지
		
		list.addAll(list); //list 전체추가
		
		System.out.println(list); //[1, 2, 6, 3, 4, 5, 1, 2, 6, 3, 4, 5] 0~11까지의 배열
		
		System.out.println(list.indexOf(5));
		System.out.println(list.lastIndexOf(5));
		
		System.out.println("삭제될 2번 인덱스 속 값 >> " + list.remove(2));
		System.out.println(list);
		
		list.set(0, 10);
		System.out.println(list);
		
		list.sort(new Comparator<Integer>() { 
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return -(o1 - o2);
			}
		});
		
		System.out.println(list);
		
		System.out.println(list.subList(3, 5)); //3 이상 5 미만
		
	}
}
