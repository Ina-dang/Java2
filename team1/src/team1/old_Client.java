package team1;

import java.util.Scanner;

public class old_Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		old_tableService table = new old_tableService(); // 테이블 서비스
		old_adminInterphase admin = new old_adminInterphase(); // 어드민 서비스
		
		System.out.println("*******************");
		System.out.println("**     휴 밤     **");
		System.out.println("*******************");
		
		try {
			Thread.sleep(1000); //1초 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // try 종료
		
		System.out.println("1. 테이블 \t 2. 직원용 \t 3. 종료");
		
		System.out.println("번호를 입력해주세요.");
		int i = sc.nextInt();
		
		switch(i) {
			case 1:
				table.table_main(); // 테이블 서비스
				break;
				
			case 2:
				admin.admin_main();
				break;
				
			case 3:
				// 종료용
				break;
				
			default:
				break;
		}
		
		sc.close();
	}

} // Client 종료
