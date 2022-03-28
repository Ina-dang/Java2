package a220111;

import java.util.Scanner;

public class FlowEx25 {
	public static void main(String[] args) {
		int num = 0, sum = 0;
		System.out.print("숫자를 입력하세요. (예:12345)>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp); //입력받은 문자열tmp을 num으로 변환
		
		while(num != 0) { //num이 0이 아닐때까지 반복문 내에서 반복할거다
			// num을 10으로 나눈 나머지를 sum에 더함
			sum += num % 10; 
			// sum = sum + num % 10 
			//        0  + 12345 % 10
			System.out.printf("sum =%3d num %d%n", sum, num);
//			System.out.println(num%10);
			num /= 10; // num = num / 10; num을 10으로 나눈 값을 다시 num에 저장
		}
				System.out.println("각 자리수의 합:" + sum);
				scanner.close();
	}
}
