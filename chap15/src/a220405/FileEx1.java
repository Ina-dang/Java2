package a220405;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileEx1 {
	public static void main(String[] args) throws IOException {
		//파일업로드 비동기시 사용 ==> 잔여 쓰레기 파일들 생길 때 쿼츠같은 배치프로그램을 사용해 제거하는데 그때 필요한 필터
		FilenameFilter ff = new FilenameFilter() {
			//참거짓여부반환 프리디케이트 람다형식으로 처리 , 일치여부 땡겨옴
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		File f = new File("src/a220405/FileEx1.java");
		String fileName = f.getName();
		int pos = fileName.lastIndexOf(".");
		
		System.out.println("경로를 제외한 파일 이름 : " + fileName);
		System.out.println("확장자를 제외한 파일 이름 : " + fileName.substring(0, pos));
		System.out.println("확장자 - " + fileName.substring(pos) + 1);
		
		System.out.println("경로를 포함한 파일 이름 : " + f.getPath());
		System.out.println("경로를 포함한 파일 이름 : " + f);
		System.out.println("파일의 절대 경로 : " + f.getAbsolutePath());
		System.out.println("파일의 정규 경로 : " + f.getCanonicalPath());
		System.out.println("파일이 속해있는 디렉토리 : " + f.getPath());
		
		System.out.println(f.exists());
	}
}
