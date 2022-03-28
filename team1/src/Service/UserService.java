package Service;

import static util.ScannerUtil.nextInt;
import static util.ScannerUtil.nextLine;

import Domain.User;
import Service.ProductService;
public class UserService {
	private static UserService userService = new UserService();
	private UserService() {}
	public static UserService getInstance() {
		return userService;
	}
	
	public void login() {
		for(boolean a = true ; a ;) { // 로그인 메서드
		String password = nextLine("　* * * 비밀번호를 입력해주세요 >> ");
		if (password.equals(User.getInstance().getPassword())) {
			System.out.println("　* * * 로그인 성공");
			a = false;
		} else{
			System.out.println("　* * * =͟͟͞͞(꒪ᗜ꒪ ‧̣̥̇) 엥??? 비밀번호가 틀려요! ");
			a = true;
		}
			
		}
	}
	public void passwordModify() { // 관리자 비밀번호 변경 메서드
		for(boolean a = true ; a ;) { 
			String password = nextLine("　* * * 기존비밀번호를 입력해주세요 >> ");
			if (password.equals(User.getInstance().getPassword())) {
				System.out.println("　* * * 비밀번호가 확인되었습니다. ");
				User.getInstance().setPassword(nextLine("　* * * 변경하실 비밀번호를 입력하세요 >> "));
				System.out.println("　* * * 변경 되었습니다. ");
				a = false;
				} else{
				System.out.println("　* * * =͟͟͞͞(꒪ᗜ꒪ ‧̣̥̇) 엥??? 비밀번호가 틀려요! 다시 입력해주세요 >> ");
				a = true;
				
			}
		}
	}
			
		
	
	public void configuration() { // 관리자 상품관리 메서드
		for(boolean b = true ; b ;) { try {
			
			
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　┃");
			System.out.println("┃　　 1.  상품 조회            2.  상품 등록              3. 상품 수정 　  　┃");
			System.out.println("┃　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　┃");
			System.out.println("┃　　 4.  상품 삭제            5. 비밀번호 변경           6. 뒤로 가기   　　┃");
			System.out.println("┃　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		int config = nextInt("　* * * 번호를 입력해주세요. >> ");
		switch (config) {
		case 1:
			ProductService.getInstance().productsList();
			break;
		case 2:
			ProductService.getInstance().productRegister();
			
			break;
			
		case 3:
			ProductService.getInstance().productModify();
			break;
			
		case 4:
			ProductService.getInstance().productRemove();
			System.out.println("　* * * 삭제 되었습니다. ");
			break;
			
		case 5:
			getInstance().passwordModify();
			break;
			
		case 6:
			return;
			
		
		default:
			System.out.println("　* * * 1 ~ 6까지의 번호를 입력해주세요.");
			break;
		}
		
		} catch (NumberFormatException e) {
			System.out.println("　* * * 1 ~ 6 까지의 [숫자]로 입력해주세요.");
		}
		}
	}
		
	
	
	public void neonSign() {
		try {
			Thread.sleep(200); // .3초 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("  ___  ___  ___  ___  _____ ______   ________  ________       ________  ___  ___  ________     ");
		try {
			Thread.sleep(200); // .3초 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" |\\  \\|\\  \\|\\  \\|\\  \\|\\   _ \\  _   \\|\\   __  \\|\\   ___  \\    |\\   __  \\|\\  \\|\\  \\|\\   __  \\    ");
		try {
			Thread.sleep(200); // .3초 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" \\ \\  \\\\\\  \\ \\  \\\\\\  \\ \\  \\\\\\__\\ \\  \\ \\  \\|\\  \\ \\  \\\\ \\  \\   \\ \\  \\|\\  \\ \\  \\\\\\  \\ \\  \\|\\ /_   ");
		try {
			Thread.sleep(200); // .3초 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("  \\ \\   __  \\ \\  \\\\\\  \\ \\  \\\\|__| \\  \\ \\   __  \\ \\  \\\\ \\  \\   \\ \\   ____\\ \\  \\\\\\  \\ \\   __  \\  ");
		try {
			Thread.sleep(200); // .3초 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("   \\ \\  \\ \\  \\ \\  \\\\\\  \\ \\  \\    \\ \\  \\ \\  \\ \\  \\ \\  \\\\ \\  \\   \\ \\  \\___|\\ \\  \\\\\\  \\ \\  \\|\\  \\ ");
		try {
			Thread.sleep(200); // .3초 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("    \\ \\__\\ \\__\\ \\_______\\ \\__\\    \\ \\__\\ \\__\\ \\__\\ \\__\\\\ \\__\\   \\ \\__\\    \\ \\_______\\ \\_______\\");
		try {
			Thread.sleep(200); // .3초 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("     \\|__|\\|__|\\|_______|\\|__|     \\|__|\\|__|\\|__|\\|__| \\|__|    \\|__|     \\|_______|\\|_______|");
		try {
			Thread.sleep(200); // .3초 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();
	}
	
	public void neonSignCat() {
		System.out.println("⊂_ヽ");		
		System.out.println("　 ＼＼ Λ＿Λ");		
		System.out.println("　　 ＼( ‘ㅅ’ ) 두둠칫");		
		System.out.println("　　　 >　⌒ヽ");		
		System.out.println("　　　/ 　 へ＼");		
		System.out.println("　　 /　　/　＼＼");		
		System.out.println("　　 ﾚ　ノ　　 ヽ_つ");		
		System.out.println("　　/　/두둠칫");		
		System.out.println("　 /　/|");		
		System.out.println("　(　(ヽ");		
		System.out.println("　|　|、＼");		
		System.out.println("　| 丿 ＼ ⌒)");		
		System.out.println("　| |　　) /");		
		System.out.println("`ノ )　　Lﾉ");		
	}
	
	public void fail() {
		System.out.println("　　　　　▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
		System.out.println("　　　　　████▌▄▌▄▐▐▌█████");
		System.out.println("　　　　　████▌▄▌▄▐▐▌▀████");
		System.out.println("　　　　　▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
	}
}