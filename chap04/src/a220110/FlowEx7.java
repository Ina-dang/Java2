package a220110;

import java.util.Scanner;

public class FlowEx7 {
	public static void main(String[] args) {
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요. >");
		
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int) (Math.random() * 3 ) + 1;
		//Math.random = 난수 무작위
		// 0.0 <= Math.random() < 1.0 -> 0이상 1미만의 난수가 나온다
		// Math.random()   : 0 ~ 0.999999999999999 (double type) 
		// Math.random()*3 : 0 ~ 2.999999999999999
		// (int)(Math.random() * 3)    : 0, 1, 2
		// (int)(Math.random() * 3) +1 : 1, 2, 3
		
		System.out.println("당신은 " + user + "입니다.");
		System.out.println("당신은 " + com + "입니다.");
		
//		int com = (int) (Math.random() * 3 ) + 1;
//		7~13
//		7 8 9 10 11 12 13
//		(int)(Math.random() * 7) + 7 : 0 1 2 3 4 5 6 7
		
		switch (user-com) {
		case 2: case -1:
			System.out.println("당신이 졌습니다");
			break;
		case 1: case -2:
			System.out.println("당신이 이겼습니다");
			break;
		case 0:
			System.out.println("비겼습니다");
//			break; 마지막 문장이므로 break를 사용할 필요가 없다.
			
			//6면체의 주사위 2번 굴렸을 때 합 (범위 2~12)
//			int com = (int)(Math.random() * 11 ) + 2;
			//이렇게하면 2나 12가 두번씩 나올 확률이 있다 그렇기 때문에
//			int com = (int)(Math.random() * 6 ) + 1 + (int)(Math.random() * 6 ) + 1
					  // 이렇게 주사위 두 개 처럼 두 번 굴려야한다
			
//			윷놀이로 예시
//			0000 : 윷 1/16
//			0111 : 
//			1000 : 걸 4/16
//			1100 : 개 6/16
//			1110 : 도 4/16 = 1/4
//			1111 : 모 1/16
			
//			윷놀이 만들어오셈 ㅜ
		}
		scanner.close();
	}
}
