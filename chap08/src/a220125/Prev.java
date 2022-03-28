package a220125;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//폭탄돌리기에서 폭탄터질때 예외 상황
//폭탄을 던지고 throw throws , 폭탄을 받고 catch

public class Prev { //예외처리
	public static void main(String[] args) throws IOException {
		//8장의 키워드 try, catch, finally, throw, throws
		
		//RuntimeException     : unchecked Exception ==> 컴파일러가 무시
		//non-RuntimeException : checked Exception   ==> 컴파일러가 체크
		
		FileInputStream fis = new FileInputStream("text.txt"); //오류떠서 위에 throws 를 추가해줌
		//이대로 실행은 가능해지는데 막상 실행해보면 오류뜸
		//근데 chap08에 text.txt만들면 오류 안뜸
		int b = 0;
		while ((b = fis.read()) != -1) {
			System.out.print(b + "::" + (char)b);
		};
		fis.close();
		System.out.println((int)'\r');
		System.out.println((int)'\n');
	}
}
