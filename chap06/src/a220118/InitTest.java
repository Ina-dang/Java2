package a220118;

public class InitTest {
	public static void main(String[] args) { //클래스가 로드될때 클래스는 초기화됨
		
//		System.out.println(Init.si);
//		System.out.println(Init.si);

//		Init init = new Init(); //인스턴스생성
//		//인스턴스를 만든다 = 객체 = 객체설계도는 클래스 ==> 즉 객체를 만들려면 설계도가 있어야함. 초기화 거치게됨
//		System.out.println(init.i);
		
		new Init();
		new Init();
//		new Init();
		Init init = new Init(); //인스턴스생성

//		System.out.println(Init.si); //단 한번 초기화라 언제든 1로 나옴
		

			
	}
}

class Init {
static int cnt = 1; //메서드
static int count() {
	System.out.println("count().cnt :: " + cnt);
	return cnt++;
}

static int si = count(); //카운트 값이 들어감 //s는 InitTest클래스의 멤버

int i = count();
}
