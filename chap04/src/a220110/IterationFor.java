package a220110;

public class IterationFor {
	public static void main(String[] args) {
//		각 구간을 세미콜론으로 구분
//		for(1초기화;2조건식;4증감식){
//					3문장
//		}
		
		// 수행순서 잘 확인하기 (초기화→조건식→문장→증감식)
		
		for(int i = 1; i <= 2 ; i++) {
			System.out.println("안녕히가세요");
		}
		for(int i = 1; i <= 5 ; i+=2) {
			System.out.println("안녕");
		}
		for(int i = 1; i <= 8 ; i*=2) {
			System.out.println("hi");
		}
		for(int i = 10; i > 0 ; i--) { //i-- == i-=1
			System.out.println(i);
		}
		System.out.println("======================");
		for(int i = 0; i <= 100 ; i+=5) { 
			System.out.println(i);
		}
		System.out.println("======================");
		for(int i = 0; i <= 20 ; i++) { 
			System.out.println(i);
		}
		System.out.println("======================");
		for(int i = 2 ; i <= 9 ; i ++) { //8 
			for(int j = 1 ; j <= 9 ; j++) { //9
				//말하는 감자들은 중첩반복문이 어려울거임
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}	
	}
}
