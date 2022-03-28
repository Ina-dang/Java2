package Domain;

import java.util.ArrayList;
import java.util.List;

public class Table { // TableService
	// 여기서 무엇들을 관리하느냐
	// Order 관리
	// Orders (테이블 하나당 주문이 여러개 발생할거니까)
	private int tableNo;
	private List<Order> orders = new ArrayList<Order>(); // tables 안에 orders가 들어감돠

	// 싱글턴 : 같은 인스턴스 주소가 필요할 때 사용 ==> 서비스에 나와야함
	// 지금은 서로 다른 테이블이 나와야하니까 안나옴
		   
	public Table() {}
		   
	public Table(int tableNo) {
		this.tableNo = tableNo;
	}
	
	//서비스에서 합계구하자
		   
	// 합계, 주문내역
	// 인원수 = 현재 테이블에 앉을 수 있나없나
	// 테이블 착석, 현황도 콘솔로 봐야함 (착석 가능한테이블 == orders.size)
		   
	// ============== getter setter   
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public int getTableNo() {
		return tableNo;
	}

	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
	}

	@Override
	public String toString() {
		return String.format("Table [tableNo=%s, orders=%s]", tableNo, orders);
	}
	
}