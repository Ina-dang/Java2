package a220111;

/*
 * 삼각형 별 구현법
 * *
 * **
 * ***
 * **
 * *
 */
public class FlowEx16 {
	public static void main(String[] args) {
		for(int i= 0; i < 5; i++) {
			for(int j= 0; j < 5; j++) {
						//여기를 제어하는건 좋지않은 습관
				boolean b = i == j ; //if보다 boolean으로 넣으면 나중에 바꾸기 슆다
				if(b) {
					//여기에 하나 더 if를 끼어넣어준다
//					System.out.print("*");
					System.out.printf("[%d,%d]", i, j);
				} else {
//					System.out.print("");
				}
			}
			System.out.println();
			
			
			//5*5마름모 구현법 과제 
			/*
			 *      *
			 *     ***
			 *    *****
			 *     ***
			 *      *
			 */
			
// 티켓팅 배치 2차원 좌표도로 나옴
// 이게 어떤규칙으로 인해 어떤 반복문으로하면 어떻게 배치되는지
// 를 알기위해 필요한 연습이 이 구현법
		}
	}
}
