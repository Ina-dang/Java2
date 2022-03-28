package a220203;

public class StringIndexOfEx {
	public static void main(String[] args) {
		
		String sub = "자바 프로그래밍";
		
		int location = sub.indexOf("프로그래밍");
		System.out.println(location);
		
		if (sub.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}

		if (sub.contains("C")) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}
	}
}
