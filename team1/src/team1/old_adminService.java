package team1;

import java.util.Scanner;

public class old_adminService {
	static Scanner sc = new Scanner(System.in);
	
	// super_admin과 관련된 로그인은 따로 메서드 선언이 좋을 것 같아요 >_0
	private static int super_admin_password = 2222;
	
	// 1. 테이블 관리
	public void table_service() {
		System.out.println("테이블 관리 창입니다 >_0");
	}
	
	// 2. 영업 관리
	public void sales_management() {
		System.out.println("1. 마감 정산 \t 2. 준비금 등록 \t 3. 뒤로가기");
		
		System.out.print("번호를 입력해주세요. > ");
		int select = sc.nextInt();
		switch(select) {
			case 1:
				// 마감 정산
				break;
			case 2:
				// 준비금 등록
				break;
			default:
				break;
		}
	}
	
	// 3. 매출 현황
	public void sales_currentState() {
		super_login(); // 로그인
		System.out.println("1. 전일 매출 \t 2. 현 매출 \t 3. 취소");
	}
		
	// 4. 환경 설정
	public void settings() {
		super_login(); // 로그인
		System.out.println("1. 공지사항 \t 2. 직원관리 \t 3. 매출분석");
	}
	
	// 5. 종료 << 이거는 구지 따로 빼야할까 싶은 생각
	public void ending() {
		System.out.println("시스템 종료 \t 2. 다시 시작");
	}
	
	static void super_login() {
		System.out.print("비밀번호를 입력해주세요 > ");
		int tmp_admin_pw = sc.nextInt(); // 초기값 0000
		if(tmp_admin_pw == super_admin_password) {
			System.out.println("super_admin 확인되었습니다.");
			
		}
		else {
			System.out.println("올바른 비밀번호가 아닙니다.");

		}
	}
}