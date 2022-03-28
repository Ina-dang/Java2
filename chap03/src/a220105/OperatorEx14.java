package a220105;

public class OperatorEx14 {
	public static void main(String[] args) {
		char c = 'a';
		for(int i=0; i<26; i++); {
			System.out.print(c++);
		}	
		System.out.println();
			
		c = 'A';
		for(int i=0; i<26; i++);{
			System.out.print(c++);
		}	
		System.out.println();
		
		c = '0';
		for(int i=0; i<10; i++);{
			System.out.print(c++);
		}	
		System.out.println();	
		
		//↑본문 예시 
		//아래는 선생님이 응용한것같읍니다
		
		System.out.println('힣' - '가' + 1);
		
		System.out.println(11172 / 19f);
		
		for(int i = '가'; i < '까'; i++) {
			System.out.print((char)i);
		}
		
		System.out.println('a' - 'A');
		
	}
}
