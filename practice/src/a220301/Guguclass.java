package a220301;

public class Guguclass {
	public static void main(String[] args) {
		for (int i = 0; i < 72; i++) {
			System.out.printf("%d * %d = %d %n", i/9+2, i%9+1, (i/9+2) * (i%9+1) );
		}
	}
}
