package a220103;

public class Digit2 {
	public static void main(String[] args) {
		// 음수의 2진 표현
		/*
		 *   8비트
		 *   
		 *   0000_0000 최소값 .. 0
		 *   1111_1111 최대값 .. 255 = 2^8 - 1 
		 *   
		 *   양수
		 *   
		 *   음수 --> 부호를 담당하게 묶어야함 (주로 맨 앞을)
		 *   28[10]
		 *   = 0001_1100[2]
		 *   ↓
		 *   맨 앞에 있는 걸 부호비트로 구분 (MSB, most significant bit)
		 *   0 001_1100
		 *   - 28
		 *   
		 *   1 001_1100
		 *   
		 *   1 000_0000 >> -0
		 *   
		 *   55 + -55 = 0
		 *   ALU 누산기
		 *   IR  명령 레지스터 
		 *   IR내에 '가산기'가 있다
		 *   
		 *   예시
		 *   5 + (-5) = 
		 *   0 101
		 * + 1 101
		 * -------
		 * 	10 010
		 * but, 올림인 1 버림
		 * ..0 010
		 * 
		 * 근데 이렇게 하면 답이 달라져버려서 보수체계 라는게 있음
		 * 
		 * 2의 보수법
		 *  
		 *  0 001 1100 >> 28
		 *  -28은 어떻게 써야할까
		 *  
		 *  0이었던걸 1로바꾸고 1이었던걸 0으로 바꿔보자
		 *  1 110 0011 
		 *  여기다가 1을 더하자
		 *  1 110 0110
		 *  
		 *  
		 *  머라는지 모르겠으니 4비트로 가자
		 *  
		 *  0 111  7
		 *  1 011 -5
		 * ------
		 *  0 010  2
		 *      
		 *  
		 *         
		 * 
		 */
		
		System.out.print("0000000000");
		System.out.print("0000000000");
		System.out.print("0000000");
		System.out.println(Integer.toBinaryString(28));
		System.out.println(Integer.toBinaryString(-28));
		
		// 3 + 5 = 8
		// 연산자 +, =
		// 피연산자 3, 5, 8
		
	}
}
