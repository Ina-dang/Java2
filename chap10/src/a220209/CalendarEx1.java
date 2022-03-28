package a220209;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarEx1 {
	public static void main(String[] args) throws ParseException {
//		Calendar cal = new GregorianCalendar(); // 태국은 BuddhistCalendar 써야해서
		Calendar cal = Calendar.getInstance();  // getInstance() 추천
		
		Date date = new Date();
		
		// epoch : 1970 01 01 00:00:00 에서 부터 경과된 ms
		// long = ms 단위
		// int = s 단위 로 눈칫밥쓰
		
		System.out.println(cal.getTimeInMillis());
		System.out.println(date.getTime());
		System.out.println(System.currentTimeMillis()); //호출시간
		
		Date date2 = cal.getTime();
		System.out.println(date2.getTime()); // cal.getTimeInMills();랑 같은 값나옴 이유: date2가 cal받아쓴거라
		
		System.out.println(new Date(70, 0, 1).getTime());
		System.out.println(32400 / 60);
		System.out.println(32400 / 60 / 60);
		
		// 날짜 간격 계산
		
//		cal.get
//		set : 지정 get : 호출
		
		System.out.println(cal.get(1) + "년");
		System.out.println(cal.get(2) + 1 + "월");
		System.out.println(cal.get(5) + "일");
		//이거 잘안씀
		
		cal.set(Calendar.YEAR, 2000);
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DATE, 25);
		
		
		System.out.println(cal.get(1) + "년");
		System.out.println(cal.get(2) + 1 + "월");
		System.out.println(cal.get(5) + "일");
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		System.out.println(dateFormat.format(System.currentTimeMillis()));
		
		//문자열 시간정보 바꿔오기
		
		String str = "1998-12-25 16:41:38";
		
		long result = dateFormat.parse(str).getTime();
		
		System.out.println(result);
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(result));
		System.out.println(sdf.parse(sdf.format(result)).getTime());
		long past = new Date().getTime() - sdf.parse(sdf.format(result)).getTime();
		System.out.println(past / 1000 / 60 / 60 / 24 / 365d);
		
		Calendar birth = Calendar.getInstance();
		birth.set(1983, 4, 9, 0, 0, 0);
		
		past = System.currentTimeMillis() - birth.getTimeInMillis();
		System.out.println(past);
	}
}
