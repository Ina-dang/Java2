package a211231;

public class VarEx2 {
	// 두 변수의 값을 교환하고 싶을 때 tmp 라는 임시저장공간을 만들어주기
		/*
		 * 값을 정렬할 때 교환해야 하는 경우 발생
		 */
		public static void main(String[] args) {
			int x = 10, y = 20; 
			int tmp = 0;
			
			System.out.println("x:"+ x + " y:" + y);
			tmp = x;
			x = y;
			y = tmp;
			
			System.out.println("x:" + x + " y:" + y);
			
			int tmp1 = 0;
			tmp = x + 130;
			x = y + 130;
			y = tmp1 + 130;
			
			System.out.println("tmp:" + tmp + " x:" + x + " :y" + y );
			
			/*
			 * 변수 명명규칙
			 * 1. 대소문자 구분
			 * 2. 예약어 사용불가
			 * 3. 숫자로 시작 불가
			 * 4. 특수문자는 _, $만 허용
			 * 		 */
			
			/*
			 * 프로그램 규칙
			 * 1. 클래스 이름의 첫 글자는 항상 대문자로
			 * 	  - 변수와 메서드의 이름의 첫 글자는 항상 소문자 
			 *    - 소문자로 했을경우 F2눌러서 변경 또는 / Class 우클릭 - Refactor - Rename
			 * 2. 여러 단어로 이루어진 이름은 단어의 첫 글자를 대문자로
			 * 	  - lastIndexOf, StringBuffer 
			 * 3. 상수의 이름은 모두 대문자, 여러단어일경우 _로 구분
			 *    - Pl, MAX_NUMBER
			 */

			System.out.println(Math.PI - 3);
			System.out.println(Integer.MAX_VALUE);
			
			// 일반적인 표기 > 카멜표기법(camelCase) : lastIndexOf -> 혹이 있는것처럼 중간 중간 대문자 
			//				   파스칼 표기법 : Total Number ->'C#은 첫글자도 대문자'
			// 상수 > 스네이크(Snake_Case)표기법 : 단어 사이에 언더비 
			
			int 나이 = 30; //유니코드가 가능해서 한글, 한자 다 가능하지만 쓰면 안좋음 -> 인식불가할수도
			
			System.out.println(나이);
			
			// 과제 해올 때 변수이름 성의있게 '의미있는 이름'으로 하기 -> 선생님 킹받는다하심
			
			int curPos = 0; // 현재위치(current position)
			int lastPos = -1; // 마지막위치(last position)
			
			System.out.println(curPos);
			System.out.println(lastPos);					
		}
}
