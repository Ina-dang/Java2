package a220211;

public class ProductTest {
	public static void main(String[] args) {
		Product product = new Product();
		Product product2 = new Product();
		Product product3 = new Product();
		
		System.out.println("p1의 제품번호(serialNo)는 " + product.serialNo);
		System.out.println("p2의 제품번호(serialNo)는 " + product2.serialNo);
		System.out.println("p3의 제품번호(serialNo)는 " + product3.serialNo);
	
		System.out.println("생산된 제품의 수는 " + Product.count);
	}
}

class Product {
	static int count = 0;
	int serialNo;
	
	{ //모든 생성자에서 공통적으로 수행될 코드
		++count;
		serialNo = count;
	}
	
	public Product() {}
	
}