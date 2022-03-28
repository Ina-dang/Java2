package a220227;

public class MathEx {
	public static void main(String[] args) {
		MathEx mm = new MathEx();
		MyMath mm2 = new MyMath();
		System.out.println(mm.divide(5, 3));
	}
	float divide (int x, int y) {
		if ( y == 0) {
			System.out.println("0으로 나눌 수 없습니다");
			return 0;
		}
		return x / (float)y;
	}
}
