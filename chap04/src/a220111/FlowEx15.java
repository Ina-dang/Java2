﻿package a220111;

public class FlowEx15 {
	public static void main(String[] args) {
		System.out.println("  i \t 2*i \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3");
		System.out.println("-----------------------------------------------------");
		
		for (int i=1; i<=10; i++)
			System.out.printf("%3d \t %3d \t %3d \t %3d \t %3d \t %3d \t %3d%n",
									i, 2*i, 2*i-1, i*i, 11-i, i%3, i/3);
		// i=1, i<=10, printf, i++ 순으로 계산
		// i=1, i = 1, 계산식, 1증감
		// 첫번째 줄 문장 : 1 , 2*1, 2*1-1, 1*1, 11-1, 1%3, 1/3 후에 1증감
		// 두번째 줄 문장 : 2 , 2*2, 2*2-1, 2*2, 11-2, 2%3, 2/3
		// 줄 별 해석 : 숫자, 짝수, 홀수, 2, 10부터 내려가기, 나머지, 나누기
		// 나머지연산은 0을 포함하고 해당 나머지 숫자의 대상보다 1작은 수로 반복수행
		// 3 나머지를 해서 0,1,2 반복 중 
		// 나누기는 2개가 먼저나오는이유는 1부터 시작해서, 0부터시작하면 나누기 결과값0도 3개나옴
		
//		요일로 하고싶으면 저 i%3을 i%7로 나누어보자
		
	}
}
