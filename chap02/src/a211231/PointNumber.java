package a211231;

public class PointNumber {
	public static void main(String[] args) {
		double val1 = 3.14;
		
		double result = val1 + 1;
		// 소수점 15자리까지 정밀도(precision)
		System.out.println(val1);
		System.out.println(result);
		System.out.println(val1 + result);
		
		float val2 = 3.14f; // 뒤에 f를 붙여줘야 오류가 안뜸
		
		float result2 = val2 + 1;
		// 소수점 7자리까지 정밀도(precision)
		System.out.println(val2);
		System.out.println(result2);
	}
}
