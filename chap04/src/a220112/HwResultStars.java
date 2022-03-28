package a220112;

public class HwResultStars { //별만들기
	public static void main(String[] args) {
		int cnt = 11;

		for(int i = 0 - cnt / 2;  i < cnt - cnt / 2; i++) {
			for(int j = 0 - cnt / 2; j < cnt - cnt / 2; j++) {
				//      0 - 7   /  2     <  7  -  7  / 2
				//          -3			 <	4          = -3 3
				//      0  - 9  /  2     <  9  -  9  / 2
				//      0  - 4           <  9  -  4    = -4 5
				if(Math.abs(i) + Math.abs(j) <= cnt/2) {
				//      i*j > -4 && i*j <4 
					System.out.printf("[%2d,%2d]", i , j);
				}
				else {
					System.out.printf("%7c", ' ');
				}
			}
			System.out.println();
		}		
	}
}