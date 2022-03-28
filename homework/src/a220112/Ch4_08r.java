package a220112;

public class Ch4_08r {
 //방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y의 정수이고 각각의 범위는
 // 0<=x<=10, 0<=y<=10이다. 정답처럼 문장 출력되게
	public static void main(String[] args) {
		//방정식 : 미지수가 포함된 등호가 있는 식
		for (int i = 0 ; i <= 10 ; i++) { //11번수행
			for (int j = 0; j <= 10 ; j++) { // 11*11 = 총 121회 수행
				if( 2 * i + 4 * j == 10) {
					System.out.println(i + "," + j);
				}
			}
		}
	}
}
