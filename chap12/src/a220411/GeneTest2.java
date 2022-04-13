package a220411;

import java.util.Hashtable;
import java.util.Properties;

public class GeneTest2 {
	public static void main(String[] args) {
		
		// Generics 쓰는애들
		
		//ArrayList, LinkedList, Vector
		// HashSet, TreeSet
		// HashMap, TreeMap, HashTable
		
		//Enumeration, Iterator, ListIterator 
		
		// Property > Hash테이블의 자손클래스
		Hashtable<String, Object> hashtable = new Hashtable<String, Object>();
		hashtable.put("A", 10);
		hashtable.put("B", 20);
		hashtable.put("C", 30);
		
		System.out.println(hashtable);
		
		Properties properties = new Properties();
		properties.put("가", 10);
		properties.setProperty("나", "02");
		System.out.println(properties);
		String result = properties.getProperty("가");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     	}
}
