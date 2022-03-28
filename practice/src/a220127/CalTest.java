package a220127;

import java.text.SimpleDateFormat;
import java.util.Calendar;

//달력만들기
//1씩증가하다가 특정주기에 바꿈 
public class CalTest {
	public static void main(String[] args) {
		showCalender(2020, 12);
	}
	
	static void showCalender(int year, int month) {
		String[] days = {"일", "월", "화", "수", "목", "금", "토"};
		Calendar cal = Calendar.getInstance(); //현재
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		int startDay = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(new SimpleDateFormat("yyyy년 MM의 달력").format(cal.getTime()));
		
		
		
		cal.add(Calendar.MONTH, 1);
		cal.set(Calendar.DATE, -1);
		int lastDate = cal.get(Calendar.DATE);
		
		for (int i = 0; i < days.length; i++) {	
			System.out.printf("%5s ", days[i]);
		}
		System.out.println();
		
		System.out.println("=====================================================");
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
		}
	}
}
