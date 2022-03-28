package Service;

import static util.ScannerUtil.nextInt;
import static util.ScannerUtil.nextLine;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import Domain.Cart;
import Domain.Order;

public class SalesService { // 전일매출, 현매출, 마감정산 관리
	
	private OrderService orderService = OrderService.getInstance();
	private TableService tableService = TableService.getInstance();
	private ProductService productService = ProductService.getInstance();
	
	private static SalesService salesService = new SalesService();
	private SalesService() {};
	public static SalesService getInstance() {
		return salesService;
	}

	//날짜 데이터 포맷
	private long now = System.currentTimeMillis();
	public final static SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
	public final static SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd"); 
	public final static DecimalFormat decimal = new DecimalFormat("###,###,###");
	
	//Client - 직원용 - 매출현황 메서드
	public void salesCurrentState()  { 
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		String yesterday = format2.format(cal.getTime());
			
		boolean sales1 = true;
		while (sales1) {									//OrderService.orders ==> 종료 (Y/N)
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　 　　┃");
			System.out.println("┃　　 1. 전일 매출     2. 현 매출    3. 마감 정산     4. 뒤로가기 　　┃");
			System.out.println("┃　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　 　┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println();
			int i = nextInt("　* * * 번호를 입력해주세요. >> ");
			try {
				switch (i){
				case 1: 
																	//orders에 미리 전날 데이터를 넣어두면 된다.
					System.out.println(" " + yesterday + " 총 매출은 " + decimal.format(4735000) + "원 입니다." );
					break;
	
				case 2:
					//현 매출 --> 지금까지 매출 누적 끌어오기
					System.out.println(" " + format1.format(now) + "시 까지 총 매출은 " + decimal.format(orderService.getOrders().stream().mapToInt(Order::sum).sum()) + "원 입니다.");
					break;
				
				case 3:
				
					int i1 = 0;
					int num = 0;
			
					while(i1 < orderService.getOrders().size()){
					System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
					System.out.println("┃　　　　　　　　[주문시간=" + format1.format(orderService.getOrders().get(i1).getTime()) + "]" + "　  　　　　　　　┃");
					System.out.println("┠━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
					System.out.println("┃　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　┃");
					   	
					for(Cart c : orderService.getOrders().get(i1).getCarts()) {
						 System.out.printf("┃　상품순서=%2d,\t상품명=%6s\t수량=%2d\t주문금액=%6s　┃\n", c.getCartNo(), productService.findBy(c.getProductNo()).getName(), c.getAmount(), decimal.format(c.sum()));
					}
					num += orderService.getOrders().get(i1).sum();
					i1++;
					} //마감정산 목록을 표시해주는 while문 끝
					   System.out.println("┠━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
					   System.out.println("┃　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　┃");
					   System.out.printf("┃　　　　　　　 　　 총 %12s원 입니다. 　　　　　　　　　┃\n", num);
					   System.out.println("┃　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　┃");
					   System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
				   
					boolean yesNo = true;
					int off = nextInt(" 마감하시겠습니까? 1.네 2.아니요");
				    switch (off) {
					case 1:
						System.out.println(" 마감되었습니다.");
						UserService.getInstance().neonSignCat();
						System.exit(0);
						break;
					case 2:
						System.out.println(" 마감 정산 화면으로 돌아갑니다.");
						yesNo = false;
						break;
			
					default: 
						UserService.getInstance().fail();
						System.out.println("　* * * 올바른 번호를 입력해주세요. \n");
						break;
					}
				    break; 
					//case3 마감정산 끝
						
				case 4: 
					System.out.println(" 이전 화면으로 돌아갑니다.");
					sales1 = false;
					break;
	
				default :
					UserService.getInstance().fail();
					System.out.println("　* * * 올바른 번호를 입력해주세요. \n");
					break;
					}//매출 현황 switch
			}//try 끝
			catch (Exception e) {
				System.out.println(" 매출이 없습니다");
			}//catch 끝
		}//전일매출 현매출 마감정산 while문 끝
	}//매출현황 void 끝
	
	public static SimpleDateFormat getFormat1() {
		return format1;
	}

	public static SimpleDateFormat getFormat2() {
		return format2;
	}
}//class 끝
