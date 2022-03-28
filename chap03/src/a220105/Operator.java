package a220105;

public class Operator { //연산자 ~ 부호연산자 ~p96

//연산자 파트에서는 이게 무슨의미로 사용되는 기호인지 이해하자
	public static void main(String[] args) {
		// 연산자(operator) : 연산을 수행하는 기호
		/*
		 * operator : 연산을 수행하는 기호
		 * operand  : 피연산자, 연산자의 작업대상(변수, 상수, 리터럴, 수식)
		 * 
		 * +,-,*,/  : 이항연산자
		 * 
		 * operator는 operand로 연산을 수행하고 나면 항상 결과값을 반환한다.
		 * 예를들어 x의 값이 5일 때 덧셈연산 'x+3'의 결과값은 8이 된다.
		 * 
		 */
		
		/*
		 * 수식(expression) : 약어(exp 또는 expr) : 연산자와 피연산자를 조합하여 계산하고자하는 바를 표현한 것
		 * 평가(evaluation) : 약어(eva), 식을 계산하여 결과를 얻는 것
		 * 작성한 식을 프로그램에 포함시키려면 식의 끝에 ';'를 붙여서 문장으로 만들어야 한다
		 * 
		 *  4 * x + 3
		 *  4 * x + 3; // statement(문장)
		 *  = 23;	   // 결과를 얻었지만 쓰이지 않고 사라진다
		 *  그렇기 때문에 아래와 같이 대입연산자 = 를 사용해서 변수와 같이 값을 저장할 수 있는 공간에 결과를 저장해야 한다
		 *  
		 *  y = 4 * x + 3;
		 *  
		 *  만일 식의 평과결과를 출력하기만 원할 뿐, 이 값을 다른곳에 사용하지 않을 것이라면 println()안에 직접써도 된다
		 *  System.out.println(4 * x + 3);
		 *  
		 */
		
		/*
		 * operator type (연산자의 종류) p87확인
		 * 
		 * 산술연산자 : +, -, *, /, %, <<, >>, >>> | 사칙연산, 나머지연산(%), >>들은 shift(변환)으로 비트에대한 자릿수변환 근데잘안씀
		 * 비교연산자 : >, <, >=, <=, ==, != 	   | pg에서는 == 같다 != 다르다 임 (=,≠안씀)
		 * 				
		 * 				(><의 약어는 외워두면 좋다!)
		 * 				< : lt		a < b 		a lesser than b
		 * 				> : gt		a > b 		a greater than n
		 * 
		 * 논리연산자 : &&, ||, !, &, |, ^, ~	   | &and |or !not ^caret ~
		 * 대입연산자 : =						   | 우변의 값을 좌변에 저장
		 * 기타		  : (type), ?:, instanceof 	   | 형변환연산자(casting operator), 삼항연산자, instanceof연산자
		 * 
		 */
		
		/*
		 * 단항연산자 	: 피연산자의 개수가 하나. 여기에 있는 +,-는 부호연산자 : (-3)의 -음수표시 같은 경우
		 * 이항연산자 	: 대부분 ope가 여기 포함
		 * 삼항연산자 	: ?: only
		 * 형변환연산자 : (type)
		 */
		
		System.out.println(5 - 2 > 1 + 1); //3 operators, 5 operands
		
		/*
		 * 연산자 종류 정리
		 * 
		 * 산술 > 비교 > 논리 > 대입. 대입은 제일 마지막에 수행된다.
		 * 단항 > 이항 > 삼항. 		  단항 연산자의 우선순위가 이항연산자보다 높다.
		 * 단항 연산자와 대입 연산자를 제외한 모든 연산의 진행방향은 왼쪽에서 오른쪽이다
		 * 
		 */
		
		/* p91 식정리
		 * 이항 연산자는 두 피연산자의 타입이 일치해야 연산 가능
		 * 대부분 더 큰타입으로 일치됨 (작은 타입으로 하면 data loss 위험)
		 * 
		 * int   i = 10;
		 * float f = 20.0f;
		 * 
		 * float result = f + (float)i; // 형변환으로 두 피연산자의 타입을 일치
		 * 
		 * float result = f + i; 	 	// 큰 타입으로 형변환시, 형변환연산자 생략가능
		 * 
		 * 
		 * p92
		 * 1. 두 피연산자의 타입을 같게 일치시킨다 (보다 큰 타입으로 일치)
		 *  - long   + int   -> long   + long   -> long 
		 *  - float  + int   -> float  + float  -> float
		 *  - double + float -> double + double -> double
		 * 
		 * 2. 피연산자의 타입이 int보다 작은 타입이면 int로 변환
		 *  - byte + short -> int + int -> int
		 *  - char + short -> int + int -> int
		 * 
		 * 
		 * 모든 연산에서 '산술변환'이 일어나지만, 쉬프트연산자(<<,>>), 증감연산자(++,--)는 예외
		 * 
		 * ※ 연산결과의 타입은 피연산자의 타입과 일치한다. 
		 *   예를들어 int / int 결과는 int이다. float double과 같은 실수형이 아니기 때문에 소수점 이하는 버려진다.
		 *   
		 * 5 / 2 -> 2 (2.5가 아닌 2가된다)
		 *   
		 * 2.5의 결과값을 원하면
		 *   
		 * float result = 5 / 2; // 결과 2.0 (둘다 int형으로 result에 저장되어 float로 출력)
		 * float result = 5 / 2f; // 결과 2.5 (하나가 float)
		 *  
		 * ※ 산술변환이란? 연산 수행 직전에 발생하는 피연산자의 자동형변환
		 *   - 두 피연산자의 타입을 같게 일치시킨다(보다 큰 타입으로 일치)
		 *   - 피연산자의 타입이 int보다 작은 타입이면 int로 변환된다
		 *     
		 */
		
		char ch1 = 97;
		char ch2 = (char)(ch1 + 1);
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		ch2 = (char)(ch2 + 1);
		
		System.out.println(ch2);
		
		ch2++; //후위형 -> 변수의 값을 먼저 읽어온(참조) 후에 값을 증가시킨다
		System.out.println(ch2);		
		
		++ch2; //전위형 -> 변수(피연산자)의 값을 먼저 증가시킨 후에 변수의 값을 읽어옴
		System.out.println(ch2);
		
		//========================= e
		
		System.out.println(ch2++); // 값을 먼저 읽고 증가했고 결과를 저장만 해서 출력에는 값만 나옴
		System.out.println(ch2);   // 저장된 값
		System.out.println(++ch2);
		
		
		
		//예시문제
		/*
		int i = 5;
		
		i = i++ + ++i;
		// = ++ + ++ 5 + 7
		
		System.out.println(i);
		*/
		
		int i=5, j=0;
		
		j = i++;
		System.out.println("j=i++; 실행후, i=" + i +", j=" + j);
		
		i=5;			// 결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
		j=0;
		
		j = ++i;
		System.out.println("j=++i; 실행후, i=" + i + ", j=" + j);
		
		//
		System.out.println("============overflow응용"); //pg 는 1 증감을 자주씀
		
		byte b = Byte.MAX_VALUE;
		b++;
		
		System.out.println(b);
		
		i = 0;
		System.out.println(-i); //출력값 0
		
		
				
	}
}
