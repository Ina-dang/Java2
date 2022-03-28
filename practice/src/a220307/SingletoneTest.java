package a220307;

public class SingletoneTest {
	public static void main(String[] args) {
//		Singleton singleton = new Singletone(); //private 접근 불가로 에러
		Singleton singleton = Singleton.getInstance();
		
		System.out.println(singleton);
	}
}

final class Singleton{
	private static Singleton s = new Singleton();
	
	private Singleton() {
				
	}
	
	public static Singleton getInstance() {
		if(s==null) {
			s = new Singleton();
		}
		return s;
	}
}
