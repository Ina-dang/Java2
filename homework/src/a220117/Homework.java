package a220117;

public class Homework {
// 기능 담당 클래스
	//MVC Model View Controller
	/*
	 * 스프링 MVC 이해
	 * 
	 * Model
	 * 
	 * 브라우저를 통해 들어온걸
	 * 요청처리 컨트롤러로 하고
	 * DB처리 모델처리후 
	 * 뷰를통해 보여줌
	 * 
	 * 서비스 = business logic
	 */
	//객체배열 인스턴스변수 
	Student[] students = new Student[10]; //학생들 관리
	//학생 데이터 여기에 들어갈 예정
	
//	CRUD Create Read U? Delete
	// 1. 조회
	//모든 메서드는 void로 해서 리턴안함
	void list() {
		//위에 들어간 학생데이터로
		//조회기능 구현
		System.out.println("조회 기능 구현");
	}
	
	// 2. 등록
	void register() {
		System.out.println("등록 기능 구현");
		//등록기능 구현
	}
	
	// 3. 수정
 
	
	// 4. 삭제
	
}