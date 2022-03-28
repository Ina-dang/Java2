package a220112;

public class Ch4_13r {
	// CharAt을 사용해 문자열이 숫자인지아닌지판단 
	// o는 소문자o임
	public static void main(String[] args) {
		{
			String value = "12o34";
			char ch = ' ';
			boolean isNumber = true; //소수때 썼던 flag랑 같다고 생각하면된다
			
			// 반복문과 charAt(int i)를 이용해서 문자열의 문자를 하나씩 읽어서 검사
			for ( int i= 0; i<value.length() ;i++) {
				// 코드
				if (!(ch >= '0' && ch<='9')) {
				ch = value.charAt(i); //외않되
				break;
				}
			}
			if (!isNumber) {
				System.out.println(value +"는 숫자입니다" );
			} else {
				System.out.println(value + "는 숫자가 아닙니다");
			}
		}//결과 12o34는 숫자가 아닙니다
	}
}
