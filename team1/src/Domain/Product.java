package Domain;

public class Product implements Comparable<Product> {

	@Override
	public int compareTo(Product o) {
		return code - o.code;
	}

	private int code;
	private String name;
	private int price;
	private int stock = 20; //수량 amount로 고치자아 재고는 stock도 씀 
	// 재고 20개로 기본 값 함
	
	//OrderService void cart에 사용중! (나현쓰가 만듦)
	public Product(int code, String name) { //stock 지움
		this.code = code;
		this.name = name;
	
	};
		
	public Product(int code, String name, int price) { //경 보쓰 할거
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	} 



	public Product(int code, String name, int price, int stock) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return String.format("%d %s %d %d",code,name,price,stock);
		
	}
	
	
}

////탕류
//		Product product = new Product(101,"김치찌개",13000,20);
//		Product product1 = new Product(102,"부대찌개",14000,20);
//		Product product2 = new Product(103,"어묵탕",12000,20);
//		Product product3 = new Product(104,"해물탕",17000,20);
//		Product product4 = new Product(105,"번데기탕",8000,20);
//		
//		// 볶음류 
//		Product product5 = new Product(201,"오돌뼈",13000,20);
//		Product product6 = new Product(202,"닭똥집",12000,20);
//		Product product7 = new Product(203,"찜닭",13000,20);
//		Product product8 = new Product(204,"매운찜닭",14000,20);
//		Product product9 = new Product(205,"계란말이",12000,20);
//		Product product10 = new Product(206,"스팸계란",11000,20);
//		
//		// 튀김
//		Product product11 = new Product(301,"감자튀김",12000,20);
//		Product product12 = new Product(302,"치킨",14000,20);
//		Product product13 = new Product(303,"양념치킨",15000,20);
//		Product product14 = new Product(304,"수제소세지",12000,20);
//		Product product15 = new Product(305,"콘치즈",11000,20);
//		
//		// 주류
//		Product product16 = new Product(401,"참이슬",4000,20);
//		Product product17 = new Product(402,"진로",4000,20);
//		Product product18 = new Product(403,"좋은데이",4000,20);
//		Product product19 = new Product(404,"대선",4000,20);
//		
//		Product product20 = new Product(405,"카스",4000,20);
//		Product product21 = new Product(406,"하이트",4000,20);
//		Product product22 = new Product(407,"테라",4000,20);
//		
//		//음료
//		Product product23 = new Product(501,"콜라",2000,20);
//		Product product24 = new Product(502,"사이다",2000,20);
//		Product product25 = new Product(503,"환타",2000,20);
//		
//		// 기타
//		Product product26 = new Product(601,"날치주먹밥",3000,20);
//		Product product27 = new Product(602,"볶음밥",2000,20);
//		Product product28 = new Product(603,"치킨무",2000,20);
//		
//		Product[] tangs = new Product[] {product,product1,product2,product3,product4};
//		Product[] stirFrys = new Product[] {product5,product6,product7,product8,product9,product10};
//		Product[] fried = new Product[] {product11,product12,product13,product14,product15};
//		Product[] alcohols = new Product[] {product16, product17,product18,product19,product20,product21,product22};
//		Product[] drinks = new Product[] {product23,product24,product25};
//		Product[] etc = new Product[] {product26,product27,product28};
