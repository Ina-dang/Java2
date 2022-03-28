package a220128;

import java.util.Arrays;

public class ArraysEx01 {
	public static void main(String[] args) {
		String[] arrs = {"aaa", "bbb", "ccc"};
		
		System.out.println(arrs); //==> 주소값만나옴
		System.out.println(Arrays.toString(arrs));
		
		System.out.println("전체----값 치환----");
		Arrays.fill(arrs, "xxx"); 
		System.out.println(Arrays.toString(arrs)); //xxx, xxx, xxx

		System.out.println("부분----값 치환----");
		Arrays.fill(arrs, 0, 2, "yyy"); 
		System.out.println(Arrays.toString(arrs)); //yyy, yyy, xxx
		
		System.out.println("Wn----값 비교----");
		String[] arrs1 = {"aaa", "bbb", "ccc"};
		String[] arrs2 = {"aaa", "bbb", "ccc"};
		System.out.println("참조값 비교 : " + (arrs1 == arrs2)); //주소값이 다름
		System.out.println("값 비교 : " + Arrays.equals(arrs1, arrs2)); //주소값이 다름
		
		System.out.println("Wn---정렬---");
		Integer[] n = { 5, 2, 3, 1, 4};
		System.out.println("정렬 전 : " + Arrays.toString(n));
		Arrays.sort(n);
		System.out.println("정렬 후 : " + Arrays.toString(n));
		
		//배열복사
		Integer[] nCopy = Arrays.copyOf(n, n.length);
		System.out.println("배열복사 : " + Arrays.toString(nCopy));
		
		Integer[] nCopy1 = Arrays.copyOfRange(nCopy, 1, 3);
		System.out.println("부분배열복사1 : " + Arrays.toString(nCopy1));
		
		Integer[] nCopy2 = new Integer[n.length];
		System.arraycopy(n, 0, nCopy2, 0, n.length);
		for (int i = 0; i < nCopy2.length; i++) {
			System.out.println("nCopy2 [" + i + "]= " + nCopy2[i]);
		}
	}
}
