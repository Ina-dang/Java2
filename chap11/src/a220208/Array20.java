package a220208;

import java.util.Arrays;

public class Array20 {
	public static void main(String[] args) {
		String[] str1 = {"abc", "def"};
		String[] str2 = {"abc", "def"};
		
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3};
		
		int[][] arr3 = {{1,2}, {3,4}};
		int[][] arr4 = {{1,2}, {3,4}};
		
		//ar3의 type ? int[][] 타입. 길이는 length 2
		
		System.out.println(Arrays.equals(str1, str2));
		System.out.println(Arrays.equals(arr1, arr2));
		
		System.out.println(Arrays.equals(arr3, arr4)); //new 생성이라 값이 같아보여도 다 다른주소라 false
		System.out.println(Arrays.deepEquals(arr3, arr4)); //값만 가지고 비교해서 true 로 나옴
		
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4)); //주소다름쓰

		System.out.println(Arrays.deepToString(arr3));
		System.out.println(Arrays.deepToString(arr4));
		
	}
}
