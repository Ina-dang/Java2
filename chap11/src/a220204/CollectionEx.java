package a220204;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionEx {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("가");
		c.add("A");
		c.add("A");
		c.add("A");
		c.add("B");
		
		System.out.println(c);
		System.out.println(c.remove("A")); //처음에 만났던거 하나만 지움
		System.out.println(c);
		System.out.println(c.removeAll(c));
		
		c.add("가");
		System.out.println(c);

		c.add("A");
		c.add("B");
		c.add("나");
		
		
		Object[] s = c.toArray(); //Object배열 안씀
		System.out.println(Arrays.toString(s));
		//근데 굳이 배열로 바꿀려면 이렇게밖에 안됨
		String[] sArr = new String[c.size()];
		c.toArray(sArr);
		System.out.println(Arrays.toString(sArr));
		
		// .length : 배열
		// .length() : 문자열
		// .size() : 컬렉션
		
	}
}
