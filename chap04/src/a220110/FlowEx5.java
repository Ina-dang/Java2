package a220110;

import java.util.Scanner;

public class FlowEx5 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.print("점수를 입력해주세요. >>");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); // 화면을 통해 입력받은 점수를 score 에 저장
		
		System.out.printf("당신의 점수는 %d입니다. %n", score);
		
//		if (score >= 90) {
//			grade = 'A';    // 점수가 90점 이상이라면 'A'출력하고
//			if (score >= 98) { //그 A중에 98점 이상인건 opt + 출력
//				opt = '+';
//			} else if (score < 94) { //90점이상인데 94점미만은 - 출력
//				opt = '-';
//			}
//		} else if (score >= 80) {
//			grade = 'B';
//			if (score >= 88) {
//				opt = '+';
//			} else if (score < 84) {
//				opt = '-';
//			}
//		} else {
//			grade = 'C';
//		}
		
		//이렇게 여러번 안주고 옵션을 하나로 줄일 수 있다
		if (score >= 90) {
			grade = 'A';    // 점수가 90점 이상이라면 'A'출력하고
		} else if (score >= 80) {
			grade = 'B';
		} else {
			grade = 'C';
		}
		if (score>=80) {
			if ((score -1) %10 >= 7) {
				opt = '+';
			} else if (score %10 <=4) {
				opt = '-';
			}
		}
		System.out.printf("당신의 학점은 %c%c입니다. %n", grade, opt);
	scanner.close();
	}	
}
