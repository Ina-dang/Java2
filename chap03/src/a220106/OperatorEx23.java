package a220106;

public class OperatorEx23 {
	public static void main(String[] args) {
		String str1 = new String("abc"); //참조자료형 아주 특이해서 리터럴(문자형)도 가질 수 있음
		String str2 = new String("abc"); //new 적힌게 정식문법
//		참조자료형은 주소를 비교한다
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc"); // "" 따옴표 사이에 " 넣으려면 \" 로 입력 해야한다
		System.out.printf(" str1==\"abc\" ? %b%n",    str1== "abc");
		System.out.printf(" str1==\"abc\" ? %b%n",    str2== "abc");
//		System.out.printf(" str2==\"abc\" ? %b%n",    str2 = new String("abc")); //new string 이랑 객체가 다름 
		System.out.printf(" str1.equals(\"abc\") ? %b%n",    str1.equals("abc"));
		System.out.printf(" str2.equals(\"abc\") ? %b%n",    str2.equals("abc"));
		System.out.printf(" str2.equals(\"abc\") ? %b%n",    str2.equals("ABC")); //equals()는 객체가 달라도 내용만 같으면 true해줌
		System.out.printf(" str2.equalsIgnoreCase(\"ABC\") ? %b%n",    str2.equalsIgnoreCase("ABC"));
		
		System.out.println("\"가나다\""); //따옴표 넣어서 출력하는 법
	}
}
