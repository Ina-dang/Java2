package a220106;

public class OperatorEx22 {
	public static void main(String[] args) {
		float  f  = .1f;
		double d  = .1;
		double d2 = (double)f;
		double d3 = .1f;
		
//자바 자꾸 똑같은거 왜하냬서 주석처리함		
//		System.out.printf("10.0==10.0f %b%n", 10.0==10.0f);
		System.out.printf("0.1==0.1f %b%n", .1==.1f);
		System.out.printf("f  = %19.17f%n", f); //19.17 == 19자리 출력하고 17번째자리까지 소수점
		System.out.printf("d  = %19.17f%n", d);
		System.out.printf("d2 = %19.17f%n", d2);
		System.out.printf("d3 = %19.17f%n", d3);
		System.out.printf("d==f  %b%n", d==f);
		System.out.printf("d==d2 %b%n", d==d2);
		System.out.printf("d2==f %b%n", d2==f);
		System.out.printf("(float)d==f %b%n", (float)d==f);
		
		// 나는 클래스 만들었는데 파일확장명은 .java
		
		
		
	}
}
