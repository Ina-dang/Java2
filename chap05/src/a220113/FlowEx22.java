package a220113;

import java.util.Arrays;

import a220112.Array;

public class FlowEx22 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr [i] = i+1;
			System.out.printf("%d ", arr[i]);
		}	
		   System.out.println(); //줄바꿈
		
		for (int tmp : arr) { //배열 arr을 나는 tmp로 호출할거다
			tmp = 10;
			System.out.printf("%d ", tmp);
			sum += tmp;			
		} //값에 대한 순수한 호출을 할 때는 많이 씀 (읽기전용)
		System.out.println(); //줄바꿈
		System.out.println(Arrays.toString(arr));
		
		System.out.println(); //50까지 출력 후 다시 줄바꿈
		System.out.println("sum=" + sum);
		

	}
}
