package a220128;

import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException , InstantiationException, IllegalAccessException{
		Card card = new Card();
		
		Class c1 = card.getClass();
		Class c2 = Card.class;
		Class c3 = Class.forName("a220128.Card");
		
		Card card2 = (Card) c1.newInstance();
		
		System.out.println(c2);
		System.out.println(c2.getSuperclass());
		
		Method[] methods = c3.getDeclaredMethods(); //메서드 타입의 배열
		for (Method m : methods) {
			System.out.println(m.getName()); 
		}
		
		String s1 = "a"; //0x100 char[1] 
		String s2 = "b"; //0x200
		String s3 = "c"; //0x300
		
		String str = s1 + s2 + s3; //0x400
	}
}
