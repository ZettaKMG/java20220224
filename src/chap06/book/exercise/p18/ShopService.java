package chap06.book.exercise.p18;

public class ShopService {
	// 작성 위치
//	private static ShopService shopService;
	private static ShopService shopService = new ShopService();
	
	private ShopService() {
		
	}
	
	public static ShopService getInstance() {
//		if (shopService == null) {
//			shopService = new ShopService();
//		}
		return shopService;
	}
}
