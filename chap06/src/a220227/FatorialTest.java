package a220227;

public class FatorialTest {
	public static void main(String[] args) {
		int result = factorial(4);
		System.out.println(result);
	}
	static int factorial(int n) {
		int result = 0;
		if (n <= 0 || n > 12) {return -1;}
		if (n == 1) {
			result = 1;
		} else {
			result = n * factorial (n-1); //재귀호출
		}
		return result;
	}
}
