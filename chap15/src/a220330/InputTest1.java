package a220330;

import java.io.IOException;
import java.io.InputStream;

public class InputTest1 {
	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		int a = inputStream.read();
		System.out.println(a);
		System.out.println((char)a);
	}
}
