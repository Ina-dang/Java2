package a220126;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class FileDownloadEx {
	public static void main(String[] args) {
		String url = "https://blogfiles.pstatic.net/MjAyMDExMDRfMjg2/MDAxNjA0NDk4Nzg1NzM5.T-9aC4UFixVYhbTdM4VPNOfm2WgXDA26kWDrOR53DwEg.s0nXpuk4429RV1Ykv9aKFgPfPI6Lbccx_wjH56hS27kg.GIF.alsrudrnr93/KakaoTalk_20201101_112110348.gif?type=w3";
		String targetName = "SaeDaeGal.jpg";
		
		try {
			download(url, targetName);
		} catch (IOException e) {
			e.printStackTrace(); //오류 파악하는데 제일 좋음
			System.out.println(e.getMessage());
		}
	}
	
	static void download(String url, String targetName) throws IOException {
		URL u = new URL(url);
		InputStream is = u.openStream();
		FileOutputStream fos = new FileOutputStream(targetName);
		int b = 0;
		while ((b = is.read()) != -1) {
			fos.write(b);
		}
		fos.close();
	}
}
