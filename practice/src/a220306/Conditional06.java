package a220306;

public class Conditional06 {
	public static void main(String[] args) {
		for (int i = 1; i <= 6 ; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i+j == 6) {
					System.out.printf("주사위1:%d 주사위2:%d 주사위 합 : %d %n" ,i,j,i+j);
				} 
			}
		}
	}
}
