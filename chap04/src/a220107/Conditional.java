package a220107;

public class Conditional { //조건문
	public static void main(String[] args) {
		/*
		 * 제어문(control statement) : pg의 흐름(flow)를 바꾸는 역할을 하는 문장들
		 *  
		 * - 조건문(conditional statement) = if, switch
		 * {} 블럭이라 부름 . 주건식의 연산결과에 따라 실행할 문장이 달라져서 pg의 flow를 변경 가능
		 * 주로 if 많이사용 
		 * 처리 수가 많을때는 switch가 더 좋지만 제약이 많다
		 * 
		 * - if문 참일때만 수행하는게 if
		 * [if의 구성방식]
		 * if(조건식) {
		 * 		문장(조건식이 true일 때 수행될 문장들을 적는다)
		 * }
		 * 
		 */
		int score = 0;
		if  (score >= 60) {
			System.out.println("합격입니다");
			System.out.println("축하합니다");
		} 
		else {
			System.out.println("불합격입니다");
			System.out.println("다음 기회를 도전하세요");
		}
	}
}
