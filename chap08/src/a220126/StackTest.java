package a220126;
//스택구조 예외상황 만들기
//예외상황 - 폭탄돌리기
//예외가 m2에서 발생헀지만 트라이캐치가 없어서 m2에서 예외처리못하고 m1으로 올라감 근데 m1도 없어서 메인까지감
//그래도 없어서 jvm한테까지 던져서 에러출력
public class StackTest {
	public static void main(String[] args) throws InterruptedException  {
		m1();
		System.out.println("정상 종료");
		
		//Runtime계열 : unchecked & Non-Runtime계열 : checked by compiler
		try {
			throw new Exception();
		} 
		catch (Exception e) {
			System.out.println("예외처리됨");
		}
		
		new StackTest().wait();
	}
	
	static void m1() {
		try {
			m2();
//		} catch (Exception e) {
//		} catch (Exception e | NullpointException) { // 이러면 안됨. 관계가 동등해야함
		} catch (Exception e) {
			System.out.println("m1 예외처리");
			System.out.println(e.getClass().getName());
			System.out.println(e.getMessage());
			System.out.println(e); 
		}
	}
	
	static void m2() {
//		System.out.println(0/0); 
		try {
			throw new NullPointerException(); //널포인트익셉션 인스턴스 던짐 ==> 예외발생
			//트라이 구문안에 예외상황이 있는지 먼저 확인하고, 오류가 이거랑 맞는지 확인 후 호출 메서드로 보냄
//			System.out.println(0/0);
//			System.out.println(4);//얘 처리 안함 이미 널포인트 던져져서 거기서 중단하고 예외받으러다님
		} catch (NullPointerException e) { //이렇게 하면 이거는 산술오류라 null에서는 그냥 지나가고 m1예외처리 뜸
			System.out.println("m2 예외처리");
		}
//		return;
		System.out.println("aa");
	}
}
