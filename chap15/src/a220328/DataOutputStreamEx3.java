package a220328;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamEx3 {
	public static void main(String[] args) throws Exception {
		DataOutputStream dos = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream("result3.dat")));
		dos.writeChars("a가"); //4
		dos.writeChar('a'); //2
		dos.writeChar('ㅁ'); //2
		dos.writeUTF("a가"); //6
		dos.write("a가".getBytes("ms949")); //3
		
		dos.close();
		
		int value = 0xB0A1;
		System.out.println(value);
	}
}
