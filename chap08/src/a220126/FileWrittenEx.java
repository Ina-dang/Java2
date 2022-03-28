package a220126;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWrittenEx {
	public static void main(String[] args) {
		PrintWriter pw = null; 
		try {
			pw = new PrintWriter("abc.txt");
			pw.println("안녕하세요");
			pw.println(Math.PI);
			pw.println("abcd");
			pw.println("1234");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			pw.close(); //몇몇close는 예외를 요구하는 경우가 있다
		}
	}
}
