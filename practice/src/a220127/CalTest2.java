package a220127;

import java.text.SimpleDateFormat;
import java.util.Calendar;

//달력만들기
public class CalTest2 {
//1씩증가하다가 특정주기에 바꿈 
	public static void main(String[] args) {
		String[] days = {"일", "월", "화", "수", "목", "금", "토"};
		Calendar cal = Calendar.getInstance(); //현재
//		System.out.println(cal.get(Calendar.DATE));
		cal.set(Calendar.MONTH, 0);
		cal.set(Calendar.DATE, 1);
//		System.out.println(new Date()); //현재시간
		int startDay = cal.get(Calendar.DAY_OF_WEEK);
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //요일정보가 숫자로 떨어짐 
		System.out.println(new SimpleDateFormat("yyyy년 MM의 달력").format(cal.getTime()));
		
		//자주쓸테니 변수로
		
		
		cal.add(Calendar.MONTH, 1);
		cal.set(Calendar.DATE, -1);
		int lastDate = cal.get(Calendar.DATE);
		
		//date는 
		for (int i = 0; i < days.length; i++) {	
			System.out.printf("%6s ", days[i]);
		}
		
		//1일의 요일
		//해당 달의 마지막 날짜
		System.out.println();
		System.out.println("===================================================");
		for (int i = 1; i <= lastDate + startDay; i++) {
			int dpDate = i - (startDay - 1);
			if(dpDate >= 1) {
				System.out.printf("%7d", i-(startDay -1 ));
			} else {
				System.out.printf("%7c", ' ');
			}
			if(i % 7 == 0) {
				System.out.println();
				System.out.println();
			}
//			if(dpDate == lastDate) {
//				break;
//			}
		}
	}
}
