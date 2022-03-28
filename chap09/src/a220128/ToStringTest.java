package a220128;

import java.util.Calendar;
import java.util.Date;

public class ToStringTest {
	public static void main(String[] args) {
		//날짜는 Date, Calendar를 많이사용
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(date);
		System.out.println(date.toString());
		System.out.println(date.toLocaleString());
		System.out.println(calendar);
		System.out.println(calendar.toString());
	}
}
