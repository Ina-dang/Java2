package a220306;

public class Conditional11 {
	public static void main(String[] args) {
		/*
		 * 다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다. (1)에 알맞
은 코드를 넣어서 프로그램을 완성하시오.
		 */
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		for (int i = 0; i < value.length(); i++) {
			ch = value.charAt(i);
			if (!(ch >= '0' && ch <= '9')) {
				isNumber = false;
				break;
			}
		}
		if (isNumber) {
			System.out.println(value+"는 숫자입니다.");
		}else {
			System.out.println(value+"는 숫자가아닙니다.");
			
		}
	}
}
