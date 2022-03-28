package Domain;

import Service.ProductService;

public class Cart { 
	
	private int cartNo; //주문번호 카트번호
	private int productNo; //상품번호
	private int amount; //카트에 들어갈 상품의 수량 (재고랑 다름)
	
	public Cart() {}
		
	
	
	public Cart(int productNo, int amount) {
		this.productNo = productNo;
		this.amount = amount;
	}



	public Cart(int cartNo, int productNo, int amount) {
		this.cartNo = cartNo;
		this.productNo = productNo;
		this.amount = amount;
	}
	

	public int getCartNo() {return cartNo;}

	public void setNo(int cartNo) {
		this.cartNo = cartNo;
	}

	public int getProductNo() {return productNo;}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public int getAmount() {return amount;}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int sum() { 
		return ProductService.getInstance().findBy(getProductNo()).getPrice() * getAmount(); 
	}
	
	@Override
	public String toString() {
		return "장바구니 >> " + "[상품순서=" + cartNo + ", 상품번호=" + ProductService.getInstance().findBy(getProductNo()).getName() + ", 수량=" + amount + ", 주문금액=" + sum() + "]";
	} //Customer 화면에서는 상품번호말고 상품이름뜨게
}

