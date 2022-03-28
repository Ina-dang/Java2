package a220119;

public class BlockTest {//static 정리작업 
	//blockTest가 로드되면 내가해야할 static 에대한 초기화 작업을 하게됨
	static { //클래스 초기화
		System.out.println("static {  }");
	}
	
	//얘 둘은 new에 의해서 인스턴스 생성될 때 초기화 함
	public BlockTest () {//생성자
		System.out.println("생성자}");
	} //둘의 언급 순서가 달라져도 언제나 초기화 블럭이 먼저임 생성자 그담
	
	{ //인스턴스 초기화
		System.out.print(" {");

	}
	
	
	
	//명시적 초기화, 초기화블럭은 먼저 쓴 애가 나옴
	int i = 10;
	{
		i = 100;
	} //100
	
	{
		j = 100;
	}
	int j = 10; //10의 값이 나옴
	
	
	public static void main(String[] args) { //그래서 저 안에 주석해도 클래스는 한번 초기화 함
		System.out.println("BlockTest bt = new BlockTest(); ");
		BlockTest bt = new BlockTest(); //인스턴수 관계된것들 정리작업함
		
		System.out.println("BlockTest bt2 = new BlockTest(); ");
		BlockTest bt2 = new BlockTest(); //인스턴스 생성될 때마다 수행
		
		System.out.println("==========================");
		System.out.println(new BlockTest().i); //100 값
		System.out.println(new BlockTest().j); //10 값
	}
}
