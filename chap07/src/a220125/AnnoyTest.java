package a220125;

//지역변수 선언위치 : 메서드 안
//지역클래스 : 메서드 안 . 값리턴해주지 않는이상 외부에서 접근불가
public class AnnoyTest {
	public static void main(String[] args) {
		Runnable runnable1 = getRunnable(); 
		runnable1.run();
		runnable.run();
		Runnable runnable2 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
			}
		};
		
	}	
	static Runnable getRunnable() {
		//다형성해서 이 안에서 지역클래스 만들어볼꺼
		class RunnableImpl implements Runnable { //인스턴스 구현하려면 구현할 구현클래스 찾아야하니까 지역클래스에서 찾아옴
			@Override
			public void run() {
			System.out.println("getRunnable().run()");
			}
		}
		return new RunnableImpl(); //그리고 그 인스턴스 리턴
	}
	
	//익명클래스
	static Runnable runnable = new Runnable() {
		@Override 
		public void run() {	
			System.out.println("runnble.run()");
		}
	}; //new에대한 연장선이라서 세미콜론으로 꼭 닫아야함 (생략불가)
}

interface Runnable {
	void run();
}
