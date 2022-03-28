package a220111;

public class FlowEx24 {
	public static void main(String[] args) throws InterruptedException {
		int i = 11;
		
		System.out.println("카운트 다운을 시작합니다.");
		
		while(i-- != 0) {
			System.out.println(i);
			Thread.sleep(1000);
		}
			System.out.println("GAME OVER");
	}
}
