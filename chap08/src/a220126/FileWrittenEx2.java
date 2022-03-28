package a220126;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWrittenEx2 {
	public static void main(String[] args) {
		try (PrintWriter pw = new PrintWriter("abc.txt")) { //안에들어가면 close메서드가 자동호출됨
			pw.println("안녕하세요");
			pw.println(Math.PI);
			pw.println("abcd");
			pw.println("1234");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	}
}
