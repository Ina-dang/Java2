package a220117;

import java.util.Arrays;

public class SellectionSort { //최소값구해서 선택정렬
	public static void main(String[] args) {
		
		int[] arr = {50, 20, 30, 10, 40};
		//여기에 int idx = 0을 넣으면 중복숫자는 정렬이 안됨 ==> 꼭 아래 반복문에 넣어야함 0값으로 하면 계속 최소값이랑만 비교함
		for (int j = 0; j < arr.length - 1 ; j++) {
			int idx = j; //꼭 여기에 idx = j 를 해야함
			for (int i = j + 1; i < arr.length; i++) {
				if ( arr[idx] > arr[i]) {
					idx = i;
				}
			}
			
			int tmp = arr[j];
			arr [j] = arr[idx];
			arr [idx] = tmp;
			
			System.out.println(Arrays.toString(arr)); // 최소값 구한 후 정렬
		}
	}
}
