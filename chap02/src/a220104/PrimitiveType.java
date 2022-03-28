package a220104;

public class PrimitiveType {//기본형 의 세부타입 들여다 볼 생각
	public static void main(String[] args) {
		

	/*
	 * 기본형(primitive type) : 실제 값(data)를 저장 
	 * - 논리형(boolean) : 1byte. true와 false 중 하나를 값으로 가짐, 조건식&논리적 계산에 사용 
	 * - 문자형(char) : 2byte. 문자를 저장하는데 사용, 변수에 하나의 문자만 저장 가능
	 * - 정수형(1-byte, 2-short, 4-int, 8-long) : 정수저장, 주로 int사용. byte는 2진데이터, short는 C언어 호환을 위해 추가
	 * - 실수형(4-float, 8-double) : 실수저장, 주로 double사용.
	 * **_(underbar)를 통해서 숫자 구분 가능 1,000(x), 1_000(o)
	 */

	/*
	 * boolean : false가 default (기계처음 사면 꺼져있으니까)
	 * 			 대답 (yes/no), 스위치(on/off)등의 논리구현에 주로 사용
	 * 
	 * char    : ex) char  ch = 'A'; 문자 'A'를 char타입의 변수 ch에 저장
	 * 			 위의 문장은 변수에 문자가 저장되는 것 같지만 사실은 문자x 유니코드(정수) 저장
	 * 			 문자'A'의 유니코느 65가 저장 (char ch = 65; 같은결과나옴)
	 * 			 
	 * 			 어떤 문자의 유니코드를 알고 싶으면, char형 변수에 저장값을 int로 변환하면 됨
	 * 			 ex) int code = (int)ch; ch에 저장된 값을 int타입으로 변환하여 저장한다
	 */
		
	/*
	 * [아스키(ASCII) 128]
	 * 정보교환을 위한 미국 표준 코드 
	 * 
	 * [확장아스키(Extended ASCII)와 한글 255]
	 * 	ISO 8859-1(서유럽어 포함) : 대표적으로 사용 1byte로 표현할 수 있는 글자의 서유럽어까지 지원
	 * 							   (ISO Latin 1)이라고도 함
	 * 
	 * 	확장아스키로도 255개라 한글 표현엔 부족해서 조합형/완성형 두개가 생김
	 * 	근데 지금은 조합형 아예안씀
	 * 
	 * 	KSC 5601 - 2000년대 초 사용
	 * 	한글 윈도우에서 작성된 문서는 기본적으로 CP949(확장 완성형)로 인코딩되어 저장된다.
	 * 
	 * [코드페이지]
	 * 	PC사용 지역에 따라 여러버젼의 확장아스키가 필요해서 CP xxx같은 형식으로 이름 붙임
	 * 
	 * --------------------여기까지 1바이트로 쓰려는 노력
	 * 
	 * 인터넷이 발면되면서 서로 다른 지역의 다른 언어를 사용하는 컴퓨터간의 문서교환이 활발해지기
	 * 시작하자 서로 다른 문자 인코딩을 사용하는 문서교환에 어려움을 겪게되었다.
	 * 이 어려움을 해소하고자 모든 문자를 하나의 통일된 문자집합으로 표현하려 함
	 * 그 결과가 
	 * [유니코드]
	 * 	유니코드는 처음엔 2바이트(16비트) 하려했으나 부족해서 21비트로 확장
	 * 	확장한 새문자들을 보충문자(supplementary character)라고 함
	 * 	
	 * 16보다 8이 가볍고 효율성 좋아서 UTF-8 인코딩 많음
	 */
		
	/*
	 * [정수형 - byte short int long]
	 * 			  1     2    4   8
	 * 정수의 표현형식과 범위
	 * 
	 * S n-1 bit
	 * S : 부호비트(양수는 0, 음수는 1)
	 * n : 타입의 크기(단위:bit)
	 * 
	 * [정수형의 선택기준]
	 * byte 인코딩시 가끔사용
	 * short 진짜안씀
	 * int 주로 씀 
	 * long 64비트는 이게 더나음 8바이트라 근데 연습이니까 int
	 * 
	 * long타입의 범위를 벗어나는 값을 다룰때는 실수형 타입이나 Biginteger클래스 사용
	 * 
	 */

		//클래스의 첫글자 대문자
		System.out.println("==============");
		System.out.println(Byte.MAX_VALUE); //.을 '의'로 해석하면 이해쉬움
		System.out.println(Byte.MIN_VALUE); // ex)Byte의 최소값을 시스템의 아웃값으로 프린팅
		System.out.println("==============");
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println("==============");
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println("==============");
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		
	 /* JVM(Java Virtual Machine), 자바가상머신
	 *  - 메모리 자동 해제 << 가장 강력한 기능
	 *  
	 *  변수를 선언한다 = 메모리에 값을 저장한다 = OS한테 명령
	 *  
	 *  메모리의 주체 = 운영체제(OS) 
	 *  
	 *  사용이후의 데이터는 os한테 다시 반납 -> 생성자가 해야함
	 *  근데 JVM은 얘가 대신 자기가 판단해서 잘 안쓰는거 알아서 해줌
	 */	
		
	 /* [정수형의 오버플로우]
	  * overflow : 해당 타입이 표현할 수 있는 값의 범위를 넘어서는 것
	  * 			  발생했다고 에러가 뜨진 않음 다만 결과를 얻지 못함
	  * 	생활속  : 자동차 주행표시기(odometer), 계수기(counter)에서도 발견가능
	  * 			  → 최대값 9999다음엔 0000으로 되는거 / 0000에서 1빼면 9999 (회전개념)
	 */
		System.out.println("==============");
		System.out.println("int 의 최대값 : " + Integer.MAX_VALUE);
		// 0 1111111 11111111 11111111 11111111 [2] 32자리필요, 맨 앞은 부호비트, 나머지는 수치값
		System.out.println("int 의 최대값 + 1 : " + (Integer.MAX_VALUE + 1)); //최소값이되버림
		// 1 0000000 00000000 00000000 00000000 [2] 올림올림 하다가 음수 최소값으로 되어버림
		System.out.println("int 최소값의 2진수 : " + Integer.toBinaryString(Integer.MIN_VALUE));
		System.out.println("==============");
		System.out.println("-1의 2진수 \t: " + Integer.toBinaryString(-1));
		System.out.println("-1의 2진수 + 1  : " + Integer.toBinaryString(-1 + 1));
	
		
	 /* [실수형 float, double]
	  * float 정밀도 : 7자리  32bit 4byte
	  * double 		 : 15자리 64bit 8byte
	  * 
	  * 실수형은 얼마나 큰 값을 표현할 수 있는가 뿐 아니라
	  * 얼마나 0에 가깝게 표현할 수 있는가도 중요하다
	  * 
	  * [실수형의 overflow]
	  * 정수형과 달리 실수형이 자기범위 벗어나면 infinity가 됩니다
	  * 
	  * 	정수형에는 없는 underflow : 실수형으로 표현할 수 없는 아주 작은 값
	  * 								양의 최소값보다 작은 값이 되는 경우
	  * 								이 때 변수의 값은 0이 된다
	  * 
	  * - Java에서 실수형 잘 안쓰니까 있다는 것 정도만 알아두자
	  * 
	  * [실수형의 저장형식]
	  * 부동소수점(floating-point) (IEEE754 표현방식 따름) 
	  * S 부호(Sign bit) : 0이면 양수, 1이면 음수
	  * E 지수(Exponent) : 부호있는 정수, 지수범위 -127 ~ 128(f), -1023 ~ 1024(d)
	  * M 가수(Mantissa) : 실제값을 저장하는 부분
	  * 				   10진수로 7자리(f), 15자리(d)의 정밀도로 저장 가능
	  * 
	  * 60.625[10]
	  * = 6.0625 * 10^1
	  * 111000.101[2] > 저장하기위해 정규화 과정 거침 (2진소수점을 1.XXXXXX스타일로 만듦)
	  * = 1.11000101 * 2^5 >> 소수점을 왼쪽방향으로 5번 옮김 
	  *   1. >> 고정값 2^ >> 고정값
	  *   			   2^101
	  * float 중간값 : 127 + 5 = 132 >> 128[10](10000100[2]\)
	  *  
	  * 0 10000100 1100010100000000000 뭐 대충 이런값이 나온다고 함
	  *
	  * 저장방식이 정수와는 다르다 정도만 알아두기
	  */
	
	}
}
