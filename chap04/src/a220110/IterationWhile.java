package a220110;

public class IterationWhile { //반복문 Loop 
	/*
	 * for, while문에 속한 문장은 조건에 따라 한번도 수행되지 않을 수 있다.
	 * do-while : switch보다 안씀. 이건 무조건 최소한 한 번은 수행될 것이 보장됨
	 * 
	 * 조건문 : 조건에 만족하면 한 번만 함
	 * 반복문 : 조건에 만족하면 계속함
	 */
	
	/*
	 * for : 반복 횟수(기간)를 알고있을 때 사용
	 * while : 구조가 간단하다. if문과 구조가 같지만 while은 조건식이 거짓이 될 때까지 반복
	 */
//	
	public static void main(String[] args) {
//		//반복문 주의사항
//		//infinity loop
//		while(true) {
//			System.out.println("안녕하세요");
//			break;
//		}
//		//조건자체를 탈출할 수 있게하거나 break 해준다
//		System.out.println("흑흑");
		
		int i = 0;
		while(i < 3) { //이런식으로 true 조건 자체에 횟수 제한을 걸어주면됨
			System.out.println("안녕하세요");
			i++;
		}
		System.out.println(i);
	
//		while 주의사항
//		탈출구를 확실하게 만든다
	}
}
