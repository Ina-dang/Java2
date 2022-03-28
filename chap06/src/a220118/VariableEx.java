package a220118;
public class VariableEx {
	
	public VariableEx(){ //생성자 라고 부름
		// 매개변수
		// 리턴없다
		// 생성자 이름은 클래스이름과 같아야한다
	}
	
	static int i = 100; //클래스 변수 i 
//	int i = 1000; 여기서는 안되는데
	public static void main(String[] args) { //오버로딩은 메서드 내에서만
		int i =1000; //여기서는 지역변수
//		멤버변수 지역변수 이름 같을 수 있는데 그럴 경우에는 메서드 내에 지역변수쓴다
		System.out.println(i);
		System.out.println(VariableEx.i);
		System.out.println("=================");
//		void run() {
//		
//		} 메ㅔ서드 내에서는 메서드 선언안됨. 클래스에서만 됨
		
		Integer[] arr = {5, 10, 15};
		System.out.println(add(arr));
		
		//이건 Integer...a
		System.out.println(add(1,2,3,4));
		System.out.println(add(10, 20, 30));
		
		// 생성자 : 인스턴스가 생성될 때 호출되는 '인스턴스 초기화 메서드'
		// new 클래스명() ==> 인스턴스 호출
		// 메서드명() ==>메서드호출
		// 연산자 new가 인스턴스를 생성하는 것이지 생성자가 인스턴스를 생성하는 것이 아니다.
		
		
	}
	
	void run() {
		
	}
	
	//가변인자 활용
	
//	static int add(Integer[] a) { //이러면 진짜 배열 말고 add(숫자)한건 못씀
//		//래퍼클래스 
//		int sum = 0;
//		for (int i = 0; i < a.length; i++) {
//			sum += a[i];
//		}
//		return sum;
//	}
	
	//가변인자 메서드 주의사항
//	static int add(String str, Integer... a) { //이것도 가능하긴한데
		//래퍼클래스 항상 마지막에 와야함. 추가 파라미터 오면 문제생김 
	static int add(Integer... a) { //매개변수 넣기
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
}
