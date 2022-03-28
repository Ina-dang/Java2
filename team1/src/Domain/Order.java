package Domain;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Order { //OrderService 
	
	private int no;    // 주문번호
	private long time; // 주문시간

	public List<Cart> carts = new ArrayList<Cart>(); //주문한번에 몇개가 들어갈지 모름 그때그때 다름
	
	public Order() {}
	
	public Order(int no, long time) {
		this.no = no;
		this.time = time;
	}
	
	public Order(long time, List<Cart> carts) {
		this.time = time;
		this.carts = carts;
	}

	public Order(int no, long time, List<Cart> carts) {
		this.no = no;
		this.time = time;
		this.carts = carts;
	}

	public int getNo() {return no;}
	
	public void setNo(int no) {
		this.no = no;
	}

	public long getTime() {return time;}
	
	public void setTime(long time) {
	}
	
	public int sum() {
		int i = 0;
		for (int j = 0; j < carts.size(); j++) {
			i += carts.get(j).sum();
		}
		return i;
	}

	//
	
	@Override
	public String toString(){ 
		return "===== 주문내역 >> [주문번호=" + no + ", 주문시간=" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(time) + "]" + "====="
				+ "\n" + carts + "\n" +  "총 주문금액은 " + sum() + "원 입니다.";
	}

	public List<Cart> getCarts() {
		return carts;
	}

	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}
}
