package day06;
import day06.Ishop;
public class ShopLauncher {

	public static void main(String[] args) {
		Ishop shop = new MyShop();
		shop.setTitle("MyShop");
		shop.genUser();
		shop.genProduct();
		shop.start();

	}

}
