package a220105;

public class OperatorEx19 { //나머지연산자 %
	public static void main(String[] args) {
		// 나머지 연산자는 주로 짝수, 홀수, 또는 배수 검사 등에 주로 사용된다.
		// pg에서는 0도 짝수로 이해, 2로 나눴을때 나머지가 0이기 때문, 2로 나눴을때 0이 아니면 홀수
		
		int i = 2; //짝수인지 홀수인지 판단하게 만들어보자
		System.out.println(i % 2 == 0); //i 값이 짝수면 true 
		// 등가비교 연산자  
		
				int i1 = 3;
		System.out.println(i1 % 2 ==0); //i 값이 홀수면 false 
		
		//이거 응용해서 조건판단 만들거임
	}
}
