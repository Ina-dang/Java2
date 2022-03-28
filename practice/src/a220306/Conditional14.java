package a220306;

import java.util.Scanner;

public class Conditional14 {
/*
 * 다음은 숫자맞추기 게임을 작성한 것이다. 1과 100사이의 값을 반복적으로 입력
해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다. 사용자가 값을 입력하면, 컴퓨터는 자
신이 생각한 값과 비교해서 결과를 알려준다. 사용자가 컴퓨터가 생각한 숫자를 맞추면
게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다. (1)~(2)에 알맞은 코드를 넣어 프
로그램을 완성하시오.
 */
	public static void main(String[] args) {
		//1~100사이의 임의값을 얻어서 answer에 저장
		int answer = (int)(Math.random()*100) + 1;
		int input = 0;
		int count = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 :");
			input = scanner.nextInt();
			if(answer < input) {
				System.out.println("좀 더 작은수를 입력하세요");
			} else if(answer > input ){
				System.out.println("더 큰 수를 입력하세요");
			} else {
				System.out.printf("맞췄습니다. %n 시도횟수는 %d번 입니다", count);
				break;
			}
		} while(true);
	}
}
