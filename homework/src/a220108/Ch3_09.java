package a220108;

public class Ch3_09 { 
	/*
	 * 문자형 변수 ch가 영문자 이거나 숫자일 때만 변수 b의 값이 true가 되도록 하는 코드
	 */
	public static void main(String[] args) {
		char ch = 65 ;
		boolean b = ( (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'a') || (ch >= '0' && ch <= '9') );
				
		System.out.println(b);
	}
}
