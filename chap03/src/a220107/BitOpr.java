package a220107;

public class BitOpr { //비트연산자
	public static void main(String[] args) {
		
	// & | ^ ~ << >> >>>
	// ^  : XOR(exclusive or 배타적 논리합), caret. 피연산자 값의 결과가 달라야만 참 // 두개가 같으면 거짓
	
		System.out.println(8 & 6); 
		System.out.println(8 | 6); 
		System.out.println(8 ^ 6);
		/*
		 *  		 111 : 7
		 * 		 	 101 : 5
		 *  
		 *  &의 결과 101
		 *  |의 결과 111
		 *  ^의 결과 010   
		 */
		/*
		 *  		 1000 : 8
		 * 		 	 0110 : 6
		 *  
		 *  &의 결과 0000
		 *  |의 결과 1111
		 *  ^의 결과 1110  
		 */
		
		//~ (비트부정연산) : boolean 타입을 대상으로 한 부정이 아닌 숫자대상 부정
		System.out.println(7);
		System.out.println(~7);
		
		System.out.print("000000000");
		System.out.print("000000000");
		System.out.print("00000000");
		System.out.println(Integer.toBinaryString(7));
		System.out.println(Integer.toBinaryString(~7));
		
		//ip 0.0.0.0 ~ 255.255.255.255 
				
		
									//2^n곱하기 111[2]
		System.out.println(7 << 3); //0011_1000 : 56
		System.out.println(7 << 2); //0001_1100 : 28
		System.out.println(7 << 1); //0000_1110 : 7		↑ 자릿수가 1개씩 옆으로 감
		System.out.println(7 << 0); //0000_0111
		System.out.println(7 >> 1); //0000_0011
		System.out.println(7 >> 2); //0000_0001
		System.out.println(7 >> 3); //0000_0000
									// <<<는 있지만 >>>는 없다
		System.out.println(Integer.toBinaryString(-1024));
		System.out.println(Integer.toBinaryString(-1024 >> 1)); // /2가 됨
		System.out.println(Integer.toBinaryString(-1024 << 1));
		System.out.println(Integer.toBinaryString(-1024 >>> 1)); //부호 무시 shift 부호를 무시하고 0으로만 채움네
		// x << n 은 x * 2^n의 결과와 같다
		// x >> n 은 x / 2^n의 결과와 같다
	}
}
