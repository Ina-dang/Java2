package a220112;

public class Ch4_09 {

	//숫자로 이루어진 문자열 이 있을 때 각 자리의 합을 더한 결과를 출력하는 str코드를 완성하라
	//만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되
	//어야 한다. (1)에 알맞은 코드를 넣으시오
	//string 클래스 charAt(int i) 사용
	public static void main(String[] args) {
		System.out.println((int)"1".charAt(0)); //인트로남음
		System.out.println("1".charAt(0)); //인트로남음
		
		System.out.println("================");
		
		char c = "1".charAt(0);
		System.out.println(c);
		int i1 = "1".charAt(0);
		System.out.println(i1);
		
		System.out.println("================");
		
		String str = "12345";
		int sum = 0; 	
		for(int i = 0 ; i < str.length() ; i++) {
			System.out.println(str.charAt(i));
			sum += str.charAt(i) - '0' ;
			// char 타입일 때 '1'은 정수 49로 출력되어서 48을 빼줘야 1이 됩니다
			// 인덱스 0,1,2,3,4
			// 스트링 1,2,3,4,5
			
		} 
		System.out.println("result :: " + sum);

//		char[] chs = str.toCharArray(); //이것도 비슷한거
//		System.out.println(chs[2]);
	}
}
