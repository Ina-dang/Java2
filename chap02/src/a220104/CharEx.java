package a220104;

public class CharEx {
	public static void main(String[] args) {
		char ch = 'A'; 		//char ch = 65;
		int code = (int)ch; //ch에 저장된 값을 int 타입으로 변환하여 저장한다.
		
		System.out.printf("%c=%d(%#X) %n", ch, code, code);
							// char=10진(#16진수), 엔터
		char hch = '힣'; 	// char hch = 0xAc00;
		System.out.printf("%c=%d(%#X) %n", hch, (int)hch, (int)hch) ;
		
		//char 의 크기 2byte
		// 2^16 = 65536 개 0~65535
		
		//escape char 특문 
		
		/* 영문자 이외 tab이나 backspace 등의 특수문자를 저장하는 방법
		 * 
		 *  ex) tab
		 * 		char tab = '\t'; // 변수 tab에 탭 문자를 저장
		 * 		
		 * 		tab = \t
		 * 		backspace = \b
		 * 		form feed = \f
		 * 		new line = \n
		 * 		carriage return = \r
		 * 		역슬래쉬 = \\
		 * 		작은따옴표 = \'
		 * 		큰따옴표 = \"
		 * 		유니코드(16진수)문자 = \ u + 유니코드 (예: char a='\u0041')
		 * 		
		 */
		System.out.println("\"따옴표출력\"");
		System.out.println('\"');
		System.out.println("가\t나\t다\t"); //\t 없으면[    ]이렇게 띄어쓰기 해야함
		System.out.println('\u0041');
		System.out.println("\t가\r나\n다\f\f\f\f\f\f\fAAB");
		
		char ch1 = 'A';
		short s = 65;
		
		System.out.println(ch1);
		System.out.println(s);
		
		// 컴퓨터는 둘다 2진법 65로 받아들이지만 출력결과는 다르다
		// 컴퓨터는 숫자밖에 모르기때문에.. (기준은 유니코드)
		
		/*		인코딩 : 우리가 보는걸 컴퓨터가 이해하도록 코드화 시킴 
		 * 'A' ---------> 65
		 *     <---------
		 *      디코딩 : 컴퓨터가 이해한걸 다시 우리식으로 부호화(복호화) 시킴
		 *      
		 * codec : coder + decode 의 합성어 
		 * modem : modulator + demodulator 의 합성어
		 * 
		 */		
	}
}
