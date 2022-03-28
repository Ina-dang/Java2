package a220209;

import java.util.ArrayList;
import java.util.List;

public class PracticeFor {
	public static void main(String[] args) {
		
		//예제
		String[] arr = {"1-1", "1-2", "1-3", "1-4", "1-5"};
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		String[][] arr1 = {{"1-1,", "1-2,", "1-3,", "1-4,", "1-5,"}, {"2-1,", "2-2,", "2-3,", "2-4,", "2-5", "\n"}};
		
		for(String[] s1 : arr1) {
			for (String s2 : s1) {
				System.out.print(s2);
			}
		}
		
		List<String> list = new ArrayList<String>();
		list.add("1-1,");
		list.add("1-2,");
		list.add("1-3,");
		list.add("1-4,");
		list.add("1-5,");
		list.add("1-6,");
		list.add("1-7,");
		list.add("1-8,");
		list.add("1-9,");
		list.add("2-1");
		
		for(String s3 : list) {
			System.out.print("ArrayList : " + s3 + "\n");
		}
		
		List<String> list1 = new ArrayList<String>();
		int count = 0;
		list1.add("happy");
		list1.add("Hacking");
		for(String ss3 : list1) {
			System.out.println( count + "번째 메세지는 " + ss3);
			count++;
		}
	}
}
