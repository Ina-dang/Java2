package app;

import static util.ScannerUtil.nextInt;

import Service.OrderService;
import Service.ProductService;
import Service.SalesService;
import Service.TableService;
import Service.UserService;

public class Client {
	public static void main(String[] args) {
		TableService tableService = TableService.getInstance();
		OrderService orderService = OrderService.getInstance();

		boolean mainCheck = true;

		while (mainCheck) {
			try {
				System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
				System.out.println("┃　　　　　　　　　　　　　　　　　　 　　　　　　　　　　 　　┃");
				System.out.println("┃　　　　　  1. 테이블　 　  2. 직원용 　 　  3. 종료  　　 　 ┃");
				System.out.println("┃　　　　　　　　　　　　　　　　　　　　　　　　　 　　　　　 ┃");
				System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
				System.out.println();
				
				int i = nextInt("　* * * 번호를 입력해주세요. >> "); 
				System.out.println();
				
				switch (i) {// 키오스크 메인
				case 1: // 테이블(손님)
					// 테이블 현황 조회
					tableService.displayTables(false);

					tableService.settingTable();
					
					UserService.getInstance().neonSign();

					boolean customerCheck = true;

					while (customerCheck) {
						try {
							System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
							System.out.println("┃　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　┃");
							System.out.println("┃　　 1. 주문하기     2. 안주추천    3. (계산전)주문내역확인     4. 종료 　　┃");
							System.out.println("┃　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　┃");
							System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
							System.out.println();

							int select1 = nextInt("　* * * 번호를 입력해주세요. >> ");

							switch (select1) {// 1. 주문하기 \t 2. (계산전)주문내역확인 \t 3. 종료
								case 1:// 메뉴선택
									orderService.order();
									break;
								case 2:// 메뉴선택
									ProductService.getInstance().menuRandom();
									break;
								case 3:// (계산전) 주문내역확인
									orderService.orderList();
									break;
								case 4:// 종료
									customerCheck = false;
									break;	
								default:
									UserService.getInstance().fail();
									System.out.println("　* * * 올바른 번호를 입력해주세요. \n");
									break;
							}
						} catch (NumberFormatException e) {
							UserService.getInstance().fail();

							System.out.println("　* * * 숫자형식으로 입력해주세요. \n");
						} // try-catch 끝
					} // while 끝
					break;
					
				// case 1 사용자 화면 끝
				case 2:// 직원,관리자 화면
					
					UserService.getInstance().login();

					boolean adminCheck = true;
					
					while (adminCheck) {
						try {
							System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
							System.out.println("┃　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　┃");
							System.out.println("┃　　 1. 테이블 관리       2. 매출 현황       3. 환경설정       4. 종료  　　┃");
							System.out.println("┃　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　┃");
							System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

							switch (nextInt("　* * * 번호를 입력해주세요. >> ")) {
							case 1:// 테이블관리
								boolean tableCheck = true;

								while (tableCheck) {
									
									System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
									System.out.println("┃　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　┃");
									System.out.println("┃　　 1. 테이블 현황         2. 테이블 주문 취소          3. 테이블 결제 　　┃");
									System.out.println("┃　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　┃");
									System.out.println("┃　　 4. 테이블 이동         5. 테이블 초기화             6. 뒤로가기    　　┃");
									System.out.println("┃　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　┃");
									System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
									
									switch (nextInt("　* * * 번호를 입력해주세요. >> ")) {
										case 1: // 테이블 현황
											tableService.displayTables();
											break;
										case 2: // 테이블 주문 취소
											orderService.removeOrder();
											break;
										case 3: // 테이블 결제
											tableService.tablePay(nextInt("　* * * 몇번째 테이블 입니까? "));
											break;
										case 4: // 테이블 이동
											tableService.tableMove(nextInt("　* * * 시작 테이블 >> "), nextInt("　* * * 이동 테이블 >> "));
											break;
										case 5: // 테이블 초기화
											tableService.tableInit(nextInt("　* * * 몇번째 테이블 입니까? "));
											break;
										case 6: // 뒤로가기
											tableCheck = false;
											break;
										default:
											UserService.getInstance().fail();
											System.out.println("　* * * 올바른 번호를 입력해주세요. \n");
											break;
									} // 테이블관리 switch end
								} // 테이블관리 while end
								break;
							case 2:// 매출현황 ==> 나현
								SalesService.getInstance().salesCurrentState();
								break;
							case 3:// 환경설정
								UserService.getInstance().configuration();
								break;
							case 4:// 종료
								adminCheck = false;
								break;
							default:
								UserService.getInstance().fail();
								System.out.println("　* * * 올바른 번호를 입력해주세요. \n");
								break;
							} // switch end
						} catch (NumberFormatException e) {
							UserService.getInstance().fail();
							System.out.println("　* * * 숫자형식으로 입력해주세요. \n");
						} // try-catch 끝
					} // while end
					break;
					
				// case 2 직원 관리자 화면 끝
				case 3: // 키오스크 종료 화면
					UserService.getInstance().neonSignCat();
					mainCheck = false;
					break;
				default:
					UserService.getInstance().fail();
					System.out.println("　* * * 올바른 번호를 입력해주세요. \n");
					break;
				} // 메인 키오스크 스위치 종료
			} catch (NumberFormatException e) {
				UserService.getInstance().fail();
				System.out.println("　* * * 숫자형식으로 입력해주세요.\n");
			} // catch종료
		} // 테이블,직원,종료 while문 종료
	} // main 종료
} // Client 종료

