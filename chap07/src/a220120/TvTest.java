package a220120;

import java.util.Scanner;

class Tv {
								
	private String color;						// 색상					==> null 			 (구조체)
	private boolean power;						// 전원상태(on/off)		==> false		=====각각의 저장공간
	private int channel;						// 채널					==> 0
	
	// Tv의 기능(메서드)
	public void setPower() {power = !power;}		// TV를 켜거나 끄는 기능을 하는 메서드
	void channelUp() {++channel;}		// TV의 채널을 높이는 기능을 하는 메서드
	void channelDown() {--channel;}		// TV의 채널을 낮추는 기능을 하는 메서드
	
	public void  setColor(String color) {
		this.color = color;
	}

	public String getColor(){
		return color;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public boolean isPower() {
		return power;
	}
	
	
} 

public class TvTest { //↓메인 메서드가 있는녀석으로 제목 해야 정상작동 
	public static void main(String[] args) {
		int[] arr = new int[3];
		Scanner scanner = new Scanner(System.in);
		Tv t = new Tv();					// TV인스턴스 생성
		
		System.out.println(t); //주소출력
		// . ~의
//		t.channel = 7;	
		t.setChannel(7);
		t.channelUp();				// TV인스턴스의 메서드 channelDown()을 호출한다
		System.out.println("현재 채널은 " + t.getChannel() + " 입니다.");
		
	}
}
