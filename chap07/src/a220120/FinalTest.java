package a220120;

import java.util.Arrays;

public class FinalTest {
	final int NUMBER;
	
	FinalTest(){ //생성자
		NUMBER = 10; //초기화 시점 뒤로 미루면 에러안뜸
//		NUMBER = 20; //final이라 바꾸려 하면 오류
	}
	public static void main(String[] args) {
		
		final int[] arr = {1, 2, 3 ,4 ,5}; //int배열타입 참조자료형
		arr[2] = 10; 
		System.out.println(Arrays.toString(arr)); //그렇지만 값 변경됨
		//이유 == 배열의 주소값을 바꿀 수 없기 때문
//		arr = new int[3]; //arr의 주소 변경은 에러남
		
		//모든 참조자료형은 똑같음
		
		final FinalTest test = new FinalTest();
//		test = new FinalTest(); //이때도 final 붙으면 오류
	}
}
