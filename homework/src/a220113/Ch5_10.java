package a220113;

public class Ch5_10 {
	public static void main(String[] args) {
		char[] abcCode = //26개. 알파벳임
			{ '`','~','!','@','#','$','%','^','&','*','(',')','-','_','+','=','|','[',']','{','}',';',':',',','.','/'};
	
						//  0   1   2   3   4   5   6   7   8   9
//		System.out.println(abcCode.length); // 몇개인가 확인

		char[] numCode = { 'q','w','e','r','t','y','u','i','o','p'}; //10
		
		String src = "abc123";
		String result = ""; //`~!wer
		
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for (int i = 0; i < src.length(); i++) { //0부터 src 길이까지 1씩 추가
			char ch = src.charAt(i);

//			if (ch >= '0' && ch <= '9') {
//				//숫자
//				// '0' - '0' >> 0
//				// '1' - '0' >> 1
//				result += numCode[ ch - '0' ];
//			} else {
//				//영문자
//				// 'a' - 'a' >>0
//				// 'b' - 'a' >>1
//				result += abcCode[ch - 'a']; //abc코드의 0번째
//			}
//			
//			↓ 간단하게도 바꿔보자
//			
			result += ch >= '0' && ch <= '9' ? numCode[ ch - '0' ] : abcCode[ch - 'a'];
			
		}
		System.out.println("src:" + src);
		System.out.println("result:" + result);
	}
}
