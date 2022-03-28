package a220114;

public class Ex13String0xToBin { //16진수를 2진수로
	public static void main(String[] args) { //메서드 = 기능
		char[] hex = { 'C', 'A', 'F', 'E', }; // 16진수 12, 10, 16, 15
		
		String[] binary = { "0000", "0001", "0010", "0011", 
							"0100", "0101", "0110", "0111", 
							"1000", "1001",	 //'0' ~ '9'
							"1010", "1011",	"1100", "1101", "1110", "1111", }; //'A' ~ 'F'
		
		String result = "";
		
		for (int i = 0; i < hex.length; i++) {
			if (hex[i] >= '0' && hex[i] <= '9') { //'0' 부터 '9'까지 숫자의 범위인지 물어봄
				result += binary[hex[i]-'0'];		// '8'-'0'의 결과는 8이다.
				//숫자는 그냥 여기서 '0'빼면 됨
			} else { 	// A~F이면
				result += binary[hex[i]-'A'+10];						
			}					// 문자일경우 'A' - 'A' + 10 , 'C' - 'A'의 결과는 2
		}
									// String(char[] value)
		System.out.println("hex:" + new String(hex));
		System.out.println(hex); //println 중 (char)써진거는 주소안나오고 문자열로 출력
		System.out.println("hex:" + hex); //이건 주소나옴
		System.out.println("binary:" + result);
		
//		문자열 : 문자를 연이어 늘어놓은 것 (String types)
//			== 문자배열인 char배열과 같은 말
//		그러나 다른점이 있는데
//		String객체(문자열)는 읽을수만 있을 뿐 내용을 변경할 수 없다
		
		String str2 = "ab" + "cd"; //ab , cd, abcd가 존재하게됨
//		문자열은 변경할 수 없으므로 새로운 내용의 문자열이 생성된다
//		예시
		String str3 = "Java";
		str3 = str3 + "8";			//"Java8"이라는 새로운 문자열이 str에 저장된다
		System.out.println(str3);	// "Java8" 이 출력되지만 "Java", "8", "Java8"이 저장된다
		
		String str = "CAFE";
		String r   = str.substring(2); //2번째 까지 잘라주세요
		System.out.println(r); // CAFE중 CA잘린 FE만 출력 

		String str1 = "https://www.naver.com";
		String r2   = str1.substring(12); //12번째 까지 잘라주세요
		System.out.println(r2); // naver.com 출력
		System.out.println(str1.substring(12, 17)); // 12번부터 17번까지만 출력해주세요 naver만 출력
//														 이상     미만(17은 출력안함) 이라는 뜻
		
				
	}
}
