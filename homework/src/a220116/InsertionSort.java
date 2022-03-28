package a220116;

import java.util.Arrays;

//public class InsertionSort {
//	public static void main(String[] args) {
//		
//		int[] arr = {40, 50, 30, 10, 20};
//		int min = arr[0]; // 배열의 첫 번째 값으로 최소값을 초기화 한다.
//		int idx = 0; 
//		
//		for (int i = 1; i < arr.length; i++) {
//			if (min > arr[i] ) { //min이 arr보다 클경우
//				min = arr[i];
//				idx = i;
//			}
//		}
//			System.out.println("최소값 :" + min);
//			System.out.println(idx); //몇 번 인덱스가 최소값인지 나옴
//		//40의 값과 10의 값 교환
//		int tmp = arr[0]; 
//		arr[0] = arr[idx];
//		arr[idx] = tmp;
//		
//		System.out.println(Arrays.toString(arr));
//	}
//}

// 위의 값에서 더 간단하게 줄이기

public class InsertionSort {
	public static void main(String[] args) {

		int[] arr = {40, 50, 30, 10, 20};
		
		int idx = 0; 
		
		for (int i = 1; i < arr.length; i++) {
			if ( arr[idx] > arr[i] ) { // arr보다 클경우
				idx = i; //인덱스 번째를 기록
			}
		}
		System.out.println(arr[idx]); //몇 번 인덱스가 최소값인지 나옴
			System.out.println(idx); //몇 번 인덱스가 최소값인지 나옴
		//40의 값과 10의 값 교환
		int tmp = arr[0]; 
		arr[0] = arr[idx];
		arr[idx] = tmp;
		
		System.out.println(Arrays.toString(arr));
	}
}