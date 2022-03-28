package a220111;

public class FlowEx18 { //구구단
	public static void main(String[] args) {
		for(int i=2; i<=3; i++) { //1
			for(int j=1; j<=9;j++) {//8
				System.out.printf("%d x %d = %d%n", i , j , i*j);
			}//이해가 어려우면 단차를 좀 줄여서 숫자 줄여서 작게보고 다음에 점점 큰숫자넣기
		}	 //구구단 : 두 정수간의 곱셈 연산 
	}
}
