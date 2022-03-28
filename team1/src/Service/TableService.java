package Service;

import Domain.Cart;
import Domain.Order;
import Domain.Table;

import static util.ScannerUtil.nextInt;
import static util.ScannerUtil.nextLine;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import Domain.Order;
import Domain.Table;

public class TableService {
	private ProductService productService = ProductService.getInstance();
	
	private static TableService tableService = new TableService();
	private TableService() {}
	public static TableService getInstance() {
		return tableService;
	}

	private List<Table> tables = new ArrayList<Table>(); // 매장 내 모든 테이블
	private Table table; // 현재 선택중인 테이블(현재 로그인 중인 유저)
	{
		for(int i = 0 ; i < 6 ; i++)
			tables.add(new Table(i+1));
		table = tables.get(0);
	}

	public Table getTable() {
		return table;
	}
	public void setTable(Table table) {
		this.table = table;
	}
	
	
	public List<Table> getTables() {
		return tables;
	}
	
	public Table findBy(int tableNo) {
		for(Table t : tables) {
			if(t.getTableNo() == tableNo) return t;
		}
		return null;
	}
	
	
	public void displayTables() {
		displayTables(true);
	}
	
	public void displayTables(boolean b) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < tables.size() ; i+=2) {
			
			sb.append("　¤━━━━━━━━━━━━━━━━━━━━━━━━━━━¤ 　  ¤━━━━━━━━━━━━━━━━━━━━━━━━━¤\r\n");
			sb.append(String.format("       %10d                 %15d \r\n", i+1, i+2));
			sb.append("　 ━━━━━━━━━━━━━━━━━━━━━━━━━━━ 　   ━━━━━━━━━━━━━━━━━━━━━━━━━━━\r\n");
			if(b) {
				sb.append(String.format(" 　　　　 주문갯수 : %d개 　　　　　　　     주문갯수 : %d개  \r\n", tables.get(i).getOrders().size(), tables.get(i+1).getOrders().size()));
				sb.append(String.format("  　　　　총액 : %d원 　　　　　　　　　     총액 : %d원\r\n", tables.get(i).getOrders().stream().mapToInt(Order::sum).sum(), tables.get(i+1).getOrders().stream().mapToInt(Order::sum).sum()));
			}
			else {
				if(tables.get(i).getOrders().size() == 0) {
					sb.append("　　　　　　착석 가능　　　　　　　      ");
				}
				else {
					sb.append("　　　　　　착석 불가　　　　　　　      ");
				}
				if(tables.get(i+1).getOrders().size() == 0) {
					sb.append("   착석 가능");
				}
				else {
					sb.append("   착석 불가");
				}
				sb.append("\r\n");
				
			}
			sb.append("\r\n");
			sb.append("\r\n");
			sb.append("　¤━━━━━━━━━━━━━━━━━━━━━━━━━━━¤ 　  ¤━━━━━━━━━━━━━━━━━━━━━━━━━¤\r\n");
		}
		System.out.println(sb);
	}	
	
	public void tableOrderList(int index) {
//		   
//		   System.out.println("*******************************");
//		   System.out.println("**                           **");
//		   System.out.println("**        [주문 내역]        **");
//		   System.out.println("**                           **");
//		   System.out.println("*******************************");
//			
//		   int num = 0;
//		   System.out.println(tmpTable.getOrders().size());
//		   for (int i = 0; i < tmpTable.getOrders().size(); i++){
//			   System.out.println("===================================================================");
//			   System.out.println("====== 주문내역 >> [주문번호=" + (i + 1) + ", 주문시간=" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(tmpTable.getOrders().get(i).getTime()) + "]" + "======");
//			   System.out.println("===================================================================");
//				
//			   for(Cart c : tmpTable.getOrders().get(i).getCarts()) {
//				   System.out.println("[상품순서=" + c.getCartNo() + ", 상품명=" + productService.findBy(c.getProductNo()).getName() + ", 수량=" + c.getAmount() + ", 주문금액=" + c.sum() + "]");
//			   }
////			   System.out.println("총 " + tableService.getTable().getOrders().get(i).sum() + "원 입니다.");
//			   num += tmpTable.getOrders().get(i).sum();
//		   }
//		   
//		   System.out.println("===================================================================");
//		   System.out.println("                          총 " + num + "원 입니다.");
//		   System.out.println("===================================================================");
			
		   
		   System.out.println();
		   System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		   System.out.println("┃　　　　　　　　　　　　　　　　　　 　　　　　　　　　　 　　　┃");
		   System.out.println("┃　　　　　               [주문 내역]                  　　　 　 ┃");
		   System.out.println("┃　　　　　　　　　　　　　　　　　　　　　　　　　 　　　　　　 ┃");
		   System.out.println(index);
			
		   int num = 0;

		   for (int i = 0; i < findBy(index).getOrders().size(); i++){
			   System.out.println("┠━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
			   System.out.println("┃　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　┃");
			   System.out.println("┃　　 주문내역 >> [주문번호=" + (i + 1) + ", 주문시간=" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(findBy(index).getOrders().get(i).getTime()) + "]" + " 　　┃");
			   System.out.println("┃　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　┃");
			   System.out.println("┠━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
			   System.out.println("┃　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　┃");
			   
			   for(Cart c : findBy(index).getOrders().get(i).getCarts()) {
				   System.out.printf("┃　상품순서=%2d,\t상품명=%6s\t수량=%2d\t주문금액=%7s ┃\n", c.getCartNo(), productService.findBy(c.getProductNo()).getName(), c.getAmount(), OrderService.getInstance().decimal.format(c.sum()));
			   }
			   System.out.println("┃　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　┃");
			   System.out.printf("┃　　　　　　　 　　 총 %12s원 입니다. 　　　　　　　　　┃\n", OrderService.getInstance().decimal.format(findBy(index).getOrders().get(i).sum()));
			   num += findBy(index).getOrders().get(i).sum();
		   }
		   System.out.println("┠━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
		   System.out.println("┃　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　┃");
		   System.out.printf("┃　　　　　　　 　　 총 %12s원 입니다. 　　　　　　　　　┃\n", OrderService.getInstance().decimal.format(num));
		   System.out.println("┃　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　┃");
		   System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		   System.out.println();
	}

	// 테이블 결제(카드 or 현금 or 카드 + 현금 or 더치페이)
	public void tablePay(int index) { // 몇번째 테이블인지
		tableOrderList(index);
		boolean pay = true;
		while(pay) {
			switch(nextInt("1. 카드 2. 현금")) {
				case 1:
					System.out.println("카드를 넣어주세요");
					System.out.println("뚜");
					try {
						Thread.sleep(200); // .2초 대기
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.printf(".");
					try {
						Thread.sleep(200); // .2초 대기
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.printf(".");
					try {
						Thread.sleep(200); // .2초 대기
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.printf(".");
					try {
						Thread.sleep(200); // .2초 대기
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.printf(".");
					try {
						Thread.sleep(200); // .2초 대기
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.printf(".");
					try {
						Thread.sleep(400); // .2초 대기
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("계산 완료되었습니다.");
					pay = false;
					break;
				case 2:
					System.out.println("현금 계산중입니다.");
					System.out.println("뚜");
					try {
						Thread.sleep(200); // .2초 대기
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.printf(".");
					try {
						Thread.sleep(200); // .2초 대기
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.printf(".");
					try {
						Thread.sleep(200); // .2초 대기
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.printf(".");
					try {
						Thread.sleep(200); // .2초 대기
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.printf(".");
					try {
						Thread.sleep(200); // .2초 대기
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.printf(".");
					try {
						Thread.sleep(400); // .2초 대기
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("계산 완료되었습니다.");
					pay = false;
					break;
				default:
					System.out.println("다시 입력해주세요");
					break;
			}
		}
		
		tableInit(index);
	}

	// 테이블 이동
	public void tableMove(int startIndex, int endIndex) { // 직원이 안하고 사용자가 하게끔
		if(findBy(endIndex).getOrders().size() == 0) {
			tables.set(tables.indexOf(findBy(endIndex)), findBy(startIndex));
			tables.set(tables.indexOf(findBy(startIndex)), new Table(startIndex));		
		}
		else {
			System.out.println(" 사용중인 테이블입니다.");
		}
	}

	// 테이블 하나만 초기화
	public void tableInit(int index) { // 몇번째 테이블인지
		tables.remove(findBy(index));
		tables.add(new Table(index));
	}
	
	public void settingTable() {
		while(true) {
			int tableNo = nextInt("　* * * 몇번째 테이블 입니까? >> ");
			if(tableNo > 0 && tableNo <= 6 && findBy(tableNo).getOrders().size() == 0) {
				tableService.setTable(tableService.findBy(tableNo));	
				break;
			}
			else {
				UserService.getInstance().fail();
				System.out.println(" 없는 테이블 번호 혹은 사용중인 테이블입니다.");
			}
		}
	}
}