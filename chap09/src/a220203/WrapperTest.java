package a220203;

import java.util.ArrayList;
import java.util.List;

public class WrapperTest {
	public static void main(String[] args) {
		int i = 10;
		Integer integer = new Integer(20);
		
		System.out.println(i + integer);
		
//		i. 기본자료형이라 호출안됨 (멤버를 가질 수 없음)
//		integer. 멤버(호출가능한 변수, 메서드) 호출 가능
		
		System.out.println(Integer.toBinaryString(-1));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		Integer i2 = 20; //auto boxing
		Integer i3 = new Integer(i2);
		
		
		System.out.println(i2.equals(i3));
		System.out.println(i2 == i3);
		
		
//		long to String 
		long l = 10;
		String s = l + "";
		l = Long.parseLong(s);
		char c = (char)Integer.parseInt(s);
		System.out.println(c);
		
		int[] arr;
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
	}
}
