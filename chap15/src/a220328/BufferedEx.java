package a220328;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferedEx {
	public static void main(String[] args) throws Exception {
			FileInputStream fis = new FileInputStream("C:\\Users\\h\\Desktop\\새 텍스트 문서 (2).txt");
			
			BufferedOutputStream bos = new BufferedOutputStream(
																				//덮어쓰기 or 이어쓰기
					new FileOutputStream("C:\\Users\\h\\Desktop\\새 텍스트 문서2.txt", true), 6);
			int b = 0;
			while ((b = fis.read()) != -1) {
				bos.write(b);
			}
//			bos.flush();
			bos.close();
	}
}
