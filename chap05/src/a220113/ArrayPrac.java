package a220113;

import java.util.Arrays;

//앞으로 어레이 패키지는 자바유틸로 부를거에요 라고 선언

public class ArrayPrac {
	public static void main(String[] args) {
		int[] arr = {5, 6, 7, 8}; //{5, 6, 7, 8}
		
		int[] tmp = new int[arr.length * 2 ]; //{0, 0, 0, 0, 0, 0, 0, 0}
		System.arraycopy(arr, 0, tmp, 0, 4);
		/*
		 * src     : 소스 (원시) . 원본파일
		 * srcPos  : 소스포지션 ==> 몇 번 부터
		 * dest    : 타겟. 대상. 도착지
		 * destPos : 목적지위치 를 변경하면 시작점이 바뀜
		 * length  : 길이 를 변경하면 기존 배열의 2개만 데려옴
		 */
		//{5, 6, 7, 0, 0, 0}
		System.out.println(Arrays.toString(tmp));
							//이 Arrays가 속해있는곳은 java.util. 
//		System.out.println(java.util.Arrays.toString(tmp)); 해야하는데 그러면 어레이 부를 때마다 해야함
//		ctrl + shift + o 누르면 위에 실수로 삭제한 자바유틸 불러짐
		
	}	
}
