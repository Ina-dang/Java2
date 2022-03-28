package a220107;

import java.util.Scanner;

public class FlowEx3 { //if else
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자를 입력하세요. >>");
		
		int input = scanner.nextInt();
		
		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다");
		} else { 
			System.out.println("입력하신 숫자는 0이 아닙니다");
		}
//////////////////위의 예시에 겹치는 텍스트를 최대한 줄여보랬다
		
		System.out.print("숫자를 입력하세요. >>");
		
		int input2 = scanner.nextInt();
		
		if(input2==0) {
			System.out.println("==0");
		} else { 
			System.out.println("!=0");
		}
		
		///////내가 쓴 답 ㅋ; 완전 불친절
		
		
		System.out.print("숫자를 입력하세요. >>");
		
		int input1 = scanner.nextInt();
		System.out.print("입력하신 숫자는 0");
		
		if(input1==0) {
			System.out.println("입니다");
		} else { 
			System.out.println("이 아닙니다");
		}
		/////// 선생님이 원했던 답
		// 센스없는 나..
		
		
		
		
		scanner.close();
	}
}
