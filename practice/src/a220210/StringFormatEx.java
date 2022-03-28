package a220210;

public class StringFormatEx {
	public static void main(String[] args) {

		String str1 = "abasdfasdfcd";
		String str2 = "가34";
		String str3 = "가나";
		
		System.out.println("123456789012345678901234567890123456789012345678901234567890");
		
		String formatter = String.format("%%%ds%%%ds%%%ds%%n", 10-getKorCnt(str2), 10-getKorCnt(str3), 10-getKorCnt(str1));
	
		System.out.print(convert(str3, 20));
		System.out.print(convert(str2, 20));
		System.out.print(convert(str1, 20));
		System.out.println();

	}
	
	static int getKorCnt(String string){
		int cnt = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) >= '가' && string.charAt(i) <= '힣') {
				cnt++;
			}
		}
		return cnt;
	}
	
	static String convert(String word, int size) {
		
		String formatter =String.format("%%%ds", size - getKorCnt(word));
		return String.format(formatter, word);
	}
}
