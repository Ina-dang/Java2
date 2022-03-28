package a220117;

public class TvTest4 {
	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3]; //길이가 3인 Tv객체 배열 생성 >> tv인스턴스가 들어갈 수 있는 3개의 공간
		
		//Tv 객체를 생성해서 Tv 객체 배열의 각 요소에 인스턴스 생성 후 대입
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv(); //인덱스 0,1,2
			tvArr[i].channel = i+10; // tvArr[i]의 channel에 i+10을 저장
								//10, 11, 12 값으로 각 각 초기화
		}
		
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp(); //tvArr[i]의 메서드를 호출. 채널이 1증가
			System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
		}
		
		for(Tv t : tvArr) {
			System.out.printf("tvArr.channel : %d%n", t.channel);
		}
		String str = "abcde";
		System.out.println(str.substring(2, 4)); //3`번부터 4번까지
		//cde 출력
		
		
		
	}
}
// 아래 class Tv 더 적혀있는데 이미 나는 프로젝트에 class Tv가 있어서 안적음

