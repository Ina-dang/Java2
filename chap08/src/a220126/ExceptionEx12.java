package a220126;

public class ExceptionEx12 {
	public static void main(String[] args) { //얘도 뜨로우하면 jvm이 받음
		try {
			m1(); 
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("오류를 잡아버렸다아");
		}
	}
	
	static void m1() throws Exception{ //얘도 폭탄돌림22
		m2(); //Unhandled exception type Exception
		//처리방법 2가지 (내가하는거 트라이캐치) / 시키는거(쓰로우)
	}
	
	static void m2() throws Exception{ //폭탄돌림1
		throw new Exception(); //checked exception
		//처리방법 2가지 (내가하는거 트라이캐치) / 시키는거(쓰로우)
//		throw new ArithmeticException(); //unchecked exception
	}
}