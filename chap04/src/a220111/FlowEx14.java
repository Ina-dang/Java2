package a220111;

public class FlowEx14 {
	public static void main(String[] args) {
		for (int i = 1, j = 10; i <=10; i++, j--)  { //2차원 중첩반복문
			System.out.printf("%d \t %d%n", i, j);
		}
		//↑좋은문장은아님 : 변수 여러개하면 가독성 떨어짐
		System.out.println("==================");

		//그래서 아래처럼 변경
		for (int i = 1 ; i <= 10; i++) {
			System.out.printf("%d \t %d%n", i, 11-i);
		}
		for (int i = 1 ; i < 10; i++) { //미만으로 한다면
			System.out.printf("%d \t %d%n", i, 10-i);
			//문장내에서 증감식 사용 x. 가독성떨어짐
		}
	}
}
