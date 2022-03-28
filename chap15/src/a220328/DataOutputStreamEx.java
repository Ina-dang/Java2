package a220328;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamEx {
	public static void main(String[] args) throws Exception {
		DataOutputStream dos = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream("result.dat")));
		dos.writeBoolean(true);
		dos.writeLong(10L);
		dos.writeFloat(0);
		
		dos.close();
	}
}
