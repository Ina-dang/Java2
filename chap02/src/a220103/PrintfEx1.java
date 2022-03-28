package a220103;

public class PrintfEx1 {
	public static void main(String[] args) {
	/*
	 * println >> 사용하기엔 편하지만 변수의 값을 그대로 출력하므로
	 * 			  값을 변환하지 않고는 다른 형식으로 출력할 수 없다
	 * prinf >> 포맷 .. 같은 값이라도 다른 형식으로 출력하고 싶을 때 사용
	 * 			ex) 정수를 16진수나 8진수로 출력한다던가
	 *			
	 *'지시자(specifier)'를 통해 변수의 값을 여러 가지 형식으로 변환하여 출력하는 기능
	 * specifier >> 값을 어떻게 출력할 것인지 지정해주는 역할
	 * 
	 * printf() specifier 중 자주 사용하는 것
	 * 	 %b     - boolean 형식으로 출력
	 * 	 %d     - decimal(10진) 정수형식으로 출력
	 * 	 %o     - octal(8진) 정수형식으로 출력
	 * 	 %x, %X - hexa-decimal(16진) 정수형식으로 출력
	 *   %f 	- floating-point(부동 소수점) 형식으로 출력
	 *   %e, %E - exponent(지수) 표현식의 형식으로 출력
	 *   %c 	- character(문자)로 출력
	 *   %s		- string(문자열)로 출력 
	 *   
	 *   |참고| 지시자의 전체 목록을 보려면, Java API에서 Formatter클래스 (java,utill패키지를 찾으면 된다)
	 *  
	 */
	byte b = 1;
	short s = 2;
	char c = 'A';
	
	int finger = 10;
	long big = 100_000_000_000L; // long big =100000000000L;
	long hex = 0xFFFF_FFFF_FFFF_FFFFL ; //int 가용범위를 넘어서 long사용 (int 가용범위 21억)
	
	int octNum = 010;		//  0  = 8진수 10, 10진수로는 8
	int hexNum = 0x10;		//  0x = 16진수 10, 10진수로는 16
	int binNum = 0b10; 		//  0b = 2진수 10, 10진수로는 2
	
	//지시자(specifier)는 %로 표현
	//정수형의 값을 출력할때 %d사용
	System.out.printf("b=%d%n", b); 
	System.out.printf("s+%d%n", s);
	System.out.printf("c=%c, %d %n", c, (int)c); 
	/*
	 * //("c=%c, %d %n", c, (int)c)
	 * (int)c = char 타입을 int로 변환하겠다. 형변환
	 */	
	System.out.printf("finger=[%5d]%n", finger);
	// 출력공간을 5칸 확보하겠다 [%5d]
	System.out.printf("finger=[%-5d]%n", finger);
	// 좌측 정렬 후 5칸을 확보하겠다 [%-5d]
	System.out.printf("finger=[%05d]%n", finger);
	// 비어있는공간을 0으로 채우겠다 [%05d]
	System.out.printf("big=%d%n", big);
	// 빅에대한것을 10진수로 출력하겠다
	System.out.printf("hex=%#x%n", hex); // '#'은 접두사(16진수) 0x, 8진수 0)
	// 헧에대한것을 16진수로 출력하겠다
	System.out.printf("octNum=%o, %d%n", octNum, octNum);
	System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
	System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
	// %b가 없어서 Integer.toBinaryString같은 문자열로 출력해야함
	
	//%n 대신 \n을 사용해도 되지만, OS마다 줄바꿈 문자가 다를 수 있기 때문에 %n을 사용하는 것이 안전
	
	String str = "12345678901234567890"; 
	
	System.out.printf("[%s]%n", str);
	System.out.printf("[%30s]%n", str);
	System.out.printf("[%-30s]%n", str);
	System.out.printf("[%.5s]%n", str); // 5번째까지만 출력 후 절삭
	
	}
}
