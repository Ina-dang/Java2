package a220127;

public class ChainedExceptionEx {
	public static void main(String[] args) {
		try {
			install();
		} catch (InstallException e) {
			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
		}
	} //메인의 끝
	
	
	//detail보다 좀너 넓은 area
	static void install() throws InstallException{
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException | MemoryException e) {
			InstallException ie = new InstallException("설치 중 예외발생");
			ie.initCause(e);
			throw ie;
		} finally {
			deletdTemFiles();
		}
	}
	
	//detail
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) { //공간이 없으면
			throw new SpaceException("설치할 공간이 부족합니다.");
		}
		if(!enoughMemory()) { //메모리가 없으면
//			throw new MemoryException("메모리가 부족합니다");
			throw new RuntimeException(new MemoryException("메모리가 부족합니다.")); //ckecked랑 unchecked구별용
		}
	}
	
	
	static void copyFiles() {
		System.out.println("파일 복사중");
	} //파일복사코드입력
	static void deletdTemFiles() {
		System.out.println("임시파일 제거중");
	} //파일삭제코드입력
	static boolean enoughSpace() { //파일 공간이 있는지 확인하는 코드입력
		return false;
	}
	static boolean enoughMemory() { //파일 메모리 공간이 있는지 확인하는 코드입력
		return true;
	}
}// ExceptionTest 클래스 끝


// Exception 을 상속받는 예외처리 클래스들
class InstallException extends Exception { //설치예외
	public InstallException(String msg) {
		super(msg);
	}
}
class SpaceException extends Exception { //공간예외
	public SpaceException(String msg) {
		super(msg);
	}
}
class MemoryException extends Exception { //메모리예외
	public MemoryException(String msg) {
		super(msg);
	}
}
