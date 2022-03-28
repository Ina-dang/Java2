package Service;

import static util.ScannerUtil.nextInt;
import static util.ScannerUtil.nextLine;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Domain.Product;;

public class ProductService implements Comparator<Product> {
	public final static DecimalFormat decimal = new DecimalFormat("###,###,###");
	private List<Product> products = new ArrayList<Product>();
	
	public ProductService() {
		products.add(new Product(101, "김치찌개", 13000));
		products.add(new Product(102, "부대찌개", 14000));
		products.add(new Product(103, "어묵탕", 12000));
		products.add(new Product(104, "해물탕", 17000));
		products.add(new Product(105, "번데기탕", 8000));
		products.add(new Product(106, "감자탕", 15000));
		products.add(new Product(107, "꽃게탕", 16000));
		products.add(new Product(108, "서더리탕", 5000));
		products.add(new Product(109, "스지탕", 8000));
		products.add(new Product(110, "닭볶음탕", 15000));
		products.add(new Product(201, "오돌뼈", 13000));
		products.add(new Product(202, "닭똥집", 12000));
		products.add(new Product(203, "찜닭", 13000));
		products.add(new Product(204, "매운찜닭", 14000));
		products.add(new Product(205, "계란말이", 12000));
		products.add(new Product(206, "스팸계란", 11000));
		products.add(new Product(207, "갈비찜", 15000));
		products.add(new Product(208, "코다리찜", 13000));
		products.add(new Product(301, "감자튀김", 12000));
		products.add(new Product(302, "후라이드치킨", 14000));
		products.add(new Product(303, "양념치킨", 15000));
		products.add(new Product(304, "수제소세지", 12000));
		products.add(new Product(305, "콘치즈", 8000));
		products.add(new Product(306, "돈까스", 12000));
		products.add(new Product(307, "새우튀김", 15000));
		products.add(new Product(308, "빙어튀김", 13000));
		products.add(new Product(401, "참이슬", 4000));
		products.add(new Product(402, "진로", 4000));
		products.add(new Product(403, "좋은데이", 4000));
		products.add(new Product(404, "대선", 4000));
		products.add(new Product(405, "카스", 4000));
		products.add(new Product(406, "하이트", 4000));
		products.add(new Product(407, "테라", 4000));
		products.add(new Product(501, "콜라", 2000));
		products.add(new Product(502, "사이다", 2000));
		products.add(new Product(503, "환타", 2000));
		products.add(new Product(601, "날치주먹밥", 3000));
		products.add(new Product(602, "볶음밥", 2000));
		products.add(new Product(603, "치킨무", 0));
		products.add(new Product(999, "종업원 호출", 0));
	}
	private static ProductService productService = new ProductService();
	public static ProductService getInstance() {
		return productService;
	}
	
	@Override
	public int compare(Product o1, Product o2) {
		return o1.getCode() - o2.getCode();  
	}
	
	public void productsList() { // 메뉴 조회 메서드
		products.sort(productService);
		System.out.println("********************************");
		System.out.println("**                            **");
		System.out.println("**    [휴밤 메뉴판입니다.]    **");
		System.out.println("**                            **");
		System.out.println("********************************");
		System.out.println("================================");
		System.out.printf("%s      %s\t%3s%n","상품코드","메뉴","  가격");
		System.out.println("================================");
		
 		for (Product menus : products) {
 			if (menus.getCode() == 101) {
 				System.out.printf("%17s%n","[탕]");
 				System.out.println(" = = = = = = = = = = = = = = = =");
 			} else if(menus.getCode() == 201) {
 				System.out.println(" = = = = = = = = = = = = = = = =");
 				System.out.println();
 				System.out.printf("%17s%n","[볶음]");
 				System.out.println(" = = = = = = = = = = = = = = = =");
 			} else if(menus.getCode() == 301) {
 				System.out.println(" = = = = = = = = = = = = = = = =");
 				System.out.println();
 				System.out.printf("%17s%n","[튀김]");
 				System.out.println(" = = = = = = = = = = = = = = = =");
 			} else if(menus.getCode() == 401) {
 				System.out.println(" = = = = = = = = = = = = = = = =");
 				System.out.println();
 				System.out.printf("%17s%n","[주류]");
 				System.out.println(" = = = = = = = = = = = = = = = =");
 			} else if(menus.getCode() == 501) {
 				System.out.println(" = = = = = = = = = = = = = = = =");
 				System.out.println();
 				System.out.printf("%17s%n","[음료수]");
 				System.out.println(" = = = = = = = = = = = = = = = =");
 			} else if(menus.getCode() == 601) {
 				System.out.println(" = = = = = = = = = = = = = = = =");
 				System.out.println();
 				System.out.printf("%17s%n","[사이드메뉴]");
 				System.out.println(" = = = = = = = = = = = = = = = =");
 			} else if(menus.getCode() == 999) {
 				System.out.println(" = = = = = = = = = = = = = = = =");
 				System.out.println();
 				System.out.printf("%17s%n","[종업원 호출]");
 				System.out.println(" = = = = = = = = = = = = = = = =");
 			}
 			if(menus.getStock() <= 0) {
 				System.out.printf("%4d\t%8s\t%6s%s",menus.getCode(),menus.getName(),   decimal.format(menus.getPrice()),"원");
 				System.out.println(" <<    * * * [품절] ");
 			} else {
 				System.out.printf("%4d\t%8s\t%6s%s%n",menus.getCode(),menus.getName(),   decimal.format(menus.getPrice()),"원");
 			}
		}
	}
	
	public void productRegister() { // 등록 메서드
		int tmpMenusCode = nextInt("　* * * 등록하실 상품코드를 입력하세요. >> ");;
		
		boolean i = true;
		for(Product menus : products) {
			if (menus.getCode() == tmpMenusCode) {
				UserService.getInstance().fail();
				System.out.println("　* * * 중복코드입니다. 등록에 실패하였습니다.");
				i = false;
				break;
			}				
		}
		if(i) {
			products.add(new Product(tmpMenusCode,nextLine("　* * * 등록하신 코드의 상품명을 입력하세요 >> "),nextInt("　* * * 등록한 상품의 가격을 쓰세요  >> "),nextInt("　* * * 등록하실 상품 재고를 적어주세요  >> ")));
			System.out.println("　* * * 등록 되었습니다.");
		}
	}	
	public void menuRandom() {
		boolean a = true;
		while(a) {
			int code = (int)(Math.random() * 400);
			for(Product menus : products) {
				if(menus.getCode() == code) {
					System.out.println("================================");
					System.out.println("=        휴밤 추천 메뉴        =");
					System.out.println("================================");
					System.out.printf("%s      %s\t%3s%n","상품코드","메뉴","  가격");
					System.out.println("================================");
					System.out.printf("%4d\t%8s\t%6s%s%n",menus.getCode(),menus.getName(),   decimal.format(menus.getPrice()),"원");
					System.out.println();
					
					a = false;
				}
			}
		}
	}
	
	public void productModify() { // 수정 메서드
		int modifyCode = nextInt(" [수정하실 상품코드를 입력하세요] >>");
		
		Product product = findBy(modifyCode);
			if(product == null) {
				System.out.println("　* * * 엥?? 없는 상품이에요!");
				return;
			 
		}
			int a = nextInt("　* * * 상품코드 >");
			boolean c = true;
			for	(Product p : products) {
				if (a <= 100 || a >= 1000) {
					System.out.println("　* * * 101 ~ 999 까지의 코드를 입력하세요");
					c = false;
					break;
				} 
			}
			if (c) {
				product.setCode(a);
				product.setName(nextLine("　* * * 상품명  >"));
				product.setPrice(nextInt("　* * *  상품 가격  >"));
				product.setStock(nextInt("　* * *  상품 제고  >"));
//				products.remove(findBy(modifyCode));
				
			}
			
	}

	public void productRemove() { // 삭제 메서드
		products.remove(findBy(nextInt("　* * * 삭제하실 상품의 코드를 적어주세요 >>")));
	}
	
	public Product findBy(int code) {
		Product product = null;
		for( Product p : products ) { //배열 사이즈만큼만 순회
			if(p.getCode() == code) { //p.getCode랑 code같으면 출력
				product = p;
			}
		}
		return product;
	}
		
}
