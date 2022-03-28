package review;

import java.util.ArrayList;
import java.util.List;

public class ReplyService {
	List<Reply> replies = new ArrayList<Reply>();
	Reply reply = new Reply();
	Utils utils = new Utils();
	
	{
		// 기존 리뷰내용 입력
		replies.add(new Reply("사장님이 맛있고 음식이 친절해요", "2022-01-05", "방배맨", 5));
		replies.add(new Reply("음식이 많아서 5천명을 먹이고 12광주리가 남았습니다", "2022-01-21", "예수", 5));
		replies.add(new Reply("왈왈왈왈왈왈왈왈왈왈왈왈왈왈왈왈왈왈왈왈", "2022-02-02", "맛있으면 짖는 개", 5));
		replies.add(new Reply("양좀 낭낭히 주세요. 맘이 팍 상해부렀으", "2022-02-01", "재연맘", 2));
		
	}
	
	public void list() {
		System.out.print(Utils.format("리뷰내용", 60));
		System.out.print(Utils.format("날짜", 12));
		System.out.print(Utils.format("작성자", 20));
		System.out.println(Utils.format("별점", 6));
		System.out.println("========================================================================================================");
		for(Reply r : replies) {
			// 리뷰내용 출력
			System.out.println(replies);
		}
		System.out.println("========================================================================================================");
	}
	
	public void register() {
		/*
		 * List 추가, 날짜는 Utils 사용해서 가져오기
		 */
		replies.add(new Reply(utils.nextLine("리뷰내용 입력 > "), utils.getToday(), 
				utils.nextLine("리뷰어 입력 > "), utils.nextInt("별점입력 >")));
	}
	
	public void score() {
//		double d = 0;
		/*
		 * 소수점 둘째자리까지 내림 출력
		 */
		
//		double d = ((int)(reply.getScore() * 100 - 0.5) / 100);
		double d = (double)reply.getScore();
		
		d /= replies.size();
		System.out.println("이 매장의 별점은 " + d + "점 입니다");
	}
	
	
	
}
