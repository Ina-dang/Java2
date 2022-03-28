package a220128;

public class HashCode {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		//중복체크 = 해시코드랑 이퀄스 두개있음
	}
}
