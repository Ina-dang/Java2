package a220112;

public class HwResult { // 20자리의 영대문자, 숫자의 조합을 하고 있는 문자열 제작
	public static void main(String[] args) {
	/*
	 * 영대문자 26개
	 * 숫자 10개
	 * 총 36 >> 0~35 랜덤값 중에 하나면 됨
	 * 0부터9까지는 정수하면되고
	 * 10부터는 문자열해주자
	 * 
	 * result + 55하면 10+55하니까 65
	 */
		//방법 1
//		int result = (int)(Math.random() * 36);
//		
//		System.out.println(result < 10? result : (char)(result + 55));
////							0,1,2,3,4,5,6,7,8,9
										
		
		//방법2
		String str = "";
		for(int i = 0; i < 20; ++i) {
			//26 영대문자 범위, 26 영소문자 범위, 10 숫자범위
			int result = (int)(Math.random() * (26 + 26 + 10));
			
				//숫자조건
				if(result <10) {
					str += result;
				}
				//영소문자조건
				else if (result > 36){
					str += (char)(result + 61);
				}
				//영대문자조건
				else {
					str += (char)(result + 55);
				}
				// - 구분자 추가
				if (i % 5 == 4 && i != 19) {
					str += "-";
				}
		}System.out.println(str);
	}
}
