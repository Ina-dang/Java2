package a220108;

public class Ch3_08 {
	/*
	 * 아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오
	 */
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b); // (int)a,b를 byte로 형변환 해야 오류사라짐
		
		char ch = 'A';
		ch = (char)(ch + 2) ; // int를 char로 형변환 해야 오류 사라짐
		
		float f = 3 / 2f ; // f 적어주어야 소수점 뒤에 나옴
		long l = 3000 * 3000 * 3000l; //l적어주어야 int오버플로우 사라짐
		
		float f2 = 0.1f;
		double d = 0.1; //여기 형변환해두됨
		
		boolean result = d!=f2; //두개는 다르기때문
		
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
		
		
	}
}
