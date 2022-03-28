package review;

public class ReplyEx { 
	// 결과 실행 후 본인 이름으로 테스트 수행 결과를 스크린샷하여 소스파일 제출시 제출
	// 제출 파일은 프로젝틑 폴더, 스크린샷파일을 압축하여 본인이름.zip으로 작성 후 제출
	public static void main(String[] args) {
		ReplyService service = new ReplyService();
		service.list();
		service.score();
		
		service.register();
		service.list();
		service.score();
	}
}