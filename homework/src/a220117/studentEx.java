package a220117;

import java.util.Scanner;

public class studentEx { 
/*
 * ﻿
오늘 과제


[조건]
클래스파일 2개 생성
Student.java
학생 데이터(학번, 이름, 국어, 영어, 수학 점수기록) >> 필드 (멤버변수)
국영수 기반으로 계산된 총점, 평균 >> 메서드


StudentEx.java (얘가 메인)
main 메서드 제작
메인메서드로 무엇을 하는가
학생 인스턴스 안만들어두 되는데 직접 만드는게 아니라

얘로
1. 학생 목록 조회
2. 학생 등록
3. 학생 정보 수정
4. 학생 삭제
5. 종료


학생정보를 입력했을때 저 순서대로 진행되어야함
ex) 1번 입력하고 엔터했을때 >>> 목록 조회 메뉴입니다. 라고 결과가 나오면 됨


그리고 이걸 출력 후 다시
상단의 메뉴가 재 출력 되어야함


(프로그램이 계속 동작하고 입력대기상태)
이거 그 업다운.. 응용해보기


1 입력하면 목록조회메뉴입니다
2학생등록어쩌구
3어쩌구...﻿
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] menu = {"","1.목록조회", "2.학생등록", "3.학생정보수정", "4.학생삭제"};
		boolean flag = true; // while 조건식 변수
		
		System.out.printf("출력을 원하는 숫자를 입력하세요. %n%n1.목록조회 2.학생등록 3.학생정보수정 4.학생삭제 5.종료");
		
		while (flag) { //flag 값이 true 이므로 조건식은 참 
			
			System.out.print(" >>");
			
			int num; //출력 번호
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
		
			if(num > 0 && num < 5 ) { 
				if (num == 1) {
					System.out.println(); //학생인스턴스 생성
				}
				if (num == 2) {
					
				}
				if (num == 3) {
					
				}
				if (num == 4) {
					
				}
				System.out.println(menu[num]);
				
			} else {				
				flag = false; //num이 0이면 flag가 false됨
			}
		}
		System.out.println("종료되었습니다");
	}
}