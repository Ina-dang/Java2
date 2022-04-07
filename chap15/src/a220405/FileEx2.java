package a220405;

import java.io.File;

public class FileEx2 {
	public static void main(String[] args) {
		
		//인스턴스 생성시
		System.out.println(File.separator);
		System.out.println(File.pathSeparator);		
		
		//소스코드 안에 값이 정의되어있음
		System.out.println(Math.PI);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(System.getProperties());
		System.out.println(Test.const2);
		
	}
}

class Test {
	static final String const2; //비초기화 상수 => 카멜표기
	static {
		const2 = System.getProperty("os.name").toLowerCase().contains("window") ? "\\" : "/";
	}
	public Test() {
//		이때 기능 지정
//		const2 = System.getProperty("os.name").toLowerCase().contains("window") ? "\\" : "/";
	}
	
	
	static final String CONST = "const";
}
