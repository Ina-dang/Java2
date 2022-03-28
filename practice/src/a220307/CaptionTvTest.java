package a220307;

public class CaptionTvTest {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		
		ctv.caption = true; //캡션 기능을 켠다
		ctv.displayCaption("Hello, world");
	}
}

class Tv {
	boolean power; //전원상태(on/off)  
	int channel; //채널
	
	void power() { power = !power; };
	void channelUp() { ++channel; };
	void channelDown() { --channel; };
}

class CaptionTv extends Tv {
	boolean caption; //캡션상태 on/off
	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}


