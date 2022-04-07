package a220405;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileSplit {
	public static void main(String[] args) throws Exception {
		final int VOLUMN = 1024 * 1; //1000kb씩 자름
		String fileName = "main.png";
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName));
		BufferedOutputStream bos = null;
		
		int data = 0;
		int i = 0;
		int number = 0;
		while ((data = bis.read()) != -1) {
			if(i%VOLUMN == 0 ) {
				if(i != 0) {
					bos.close();
				}
				bos = new BufferedOutputStream(new FileOutputStream(fileName + "_." + ++number));
			}
			bos.write(data);
			i++;
		}
		bis.close();
		bos.close();
	}
}
