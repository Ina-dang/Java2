package a220127;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class TimeTest {
	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		System.out.println(now);
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(format.format(now));
		
		//희망 진료일을 입력하세요
		Scanner scanner = new Scanner(System.in);
		System.out.println("희망 진료년도를 입력하세요");
//		String year = scanner.nextLine();
		String year = "2020";
		System.out.println("희망 진료월을 입력하세요");
//		String month = scanner.nextLine();
		String month = "2";
//		System.out.println("희망 진료일을 입력하세요");
//		String day = scanner.nextLine();
		
		//선생님을 이거 한꺼번에 년월일 
//		System.out.println(year + month + day);
		System.out.println(year + month);
		
		Calendar calendar = Calendar.getInstance(); //현재시간
		
		//현재시간 바꿔야댐
		calendar.set(Calendar.YEAR, Integer.parseInt(year));
		calendar.set(Calendar.MONTH, Integer.parseInt(month)-1); //월은 0부터 씀 1월이 0
//		calendar.set(Calendar., Integer.parseInt(day)); //월은 0부터 씀 1월이 0
		//달을 하나 더하고 일을 하나 뺀 날짜가 마지막날??????
		// 현재 입력받은 데이터를 기반
		// 일 정보를 1로 초기화 > 1개월을 더하고 > 하루를 뺌
		calendar.set(Calendar.DATE, 1);
		calendar.add(Calendar.MONTH, 1);
		calendar.set(Calendar.DATE, -1);
		
		System.out.println(format.format(calendar.getTime()));
		
		//일의 인트값만 빼오기
		System.out.println(calendar.get(Calendar.DATE));
		
		//달력만들기
	}
}

//등록하는 순간에 커런트타임밀 저장
//출력할때 심플데이터포맷부르면 됨