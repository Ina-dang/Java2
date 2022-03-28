package a220307;

public class TimeTest {
	public static void main(String[] args) {
		Time time = new Time(12, 35, 30);
		System.out.println(time);
//		time.hour = 13; //error 접근자 private
		time.setHour(13);
		System.out.println(time);
		time.setHour(time.getHour()+2);
		System.out.println(time);
	}
}

class Time{
	private int hour, minute, second;
	Time(int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public int getHour() {return hour;}
	public void setHour(int hour) {
		if (hour < 0 || hour > 23) return;
		this.hour = hour;
	}

	public int getMinute() {return minute;}
	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) return;
		this.minute = minute;
	}

	public int getSecond() {return second;}
	public void setSecond(int second) {
		if (second < 0 || second > 59) return;
		this.second = second;
	}

	@Override
	public String toString() {
		return "Time is " + hour + ":" + minute + ":" + second ;
	}
	
	
	
	
}
