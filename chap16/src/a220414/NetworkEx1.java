package a220414;

import java.net.InetAddress;
import java.util.Arrays;

public class NetworkEx1 {
	public static void main(String[] args) {
		InetAddress ip = null;
		InetAddress[] ipArr = null;
		
		try {
			ip = InetAddress.getByName("www.naver.com");
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress() : " + ip.getHostAddress());
			System.out.println(ip);
			System.out.println("=====================");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			ipArr = InetAddress.getAllByName("www.naver.com");
			System.out.println(Arrays.toString(ipArr));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			ip = InetAddress.getLocalHost();
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress() : " + ip.getHostAddress());
			System.out.println(ip);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
