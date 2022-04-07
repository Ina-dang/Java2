package a220406;


public class ThreadEx2 {
	public static void main(String[] args) {
		new ThreadEx2_1().start();
//		new ThreadEx2_1().run();
	}
	
}

class ThreadEx2_1 extends Thread {

	public void run() {
		throwException();
	}

	public void throwException() {
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

