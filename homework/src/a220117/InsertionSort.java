package a220117;
//n^2 정렬들은 다 이거같다
//바깥쪽 반복문 회차
//안쪽 반복문 비교의 대상
//안쪽부터 만들길 권유함

import java.util.Arrays;

public class InsertionSort {//삽입정렬 - 갯수가 길어질수록 효율성 급감
	public static void main(String[] args) {
		int[] arr = {8, 5, 6, 2, 4};
		
//		if(arr[1] < arr[0]) { //5가 8보다 작으면 자리교체
//			int tmp = arr[0];
//			arr[0] = arr[1] ;
//			arr[1] = tmp;  //이렇게 하면 1회차 끝난다고함
//		}
//		
//		System.out.println(Arrays.toString(arr));
//		
//		if(arr[2] < arr[0]) { //5가 8보다 작으면 자리교체
//			int tmp = arr[0];
//			arr[0] = arr[2] ;
//			arr[2] = tmp;  //이렇게 하면 1회차 끝난다고함
//		}
//
//		if(arr[2] < arr[1]) { //5가 8보다 작으면 자리교체
//			int tmp = arr[1];
//			arr[1] = arr[2] ;
//			arr[2] = tmp;  //이렇게 하면 1회차 끝난다고함
//		}
		
		for (int i = 1; i < arr.length ; i++) {
			for (int j = 0; j < i; j++) {
				if(arr[i] < arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[i] ;
					arr[i] = tmp; 
				}
			} System.out.println(Arrays.toString(arr));
		}
	}
}
