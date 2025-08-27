package drill07;

import java.util.ArrayList;
import java.util.List;

public class Drill0717 {
	public static void main(String[] args) {
		Product product1 = new Product("アイス",250,50);
		Product product2 = new Product("ラーメン",750,30);
		
		Shop shop1 = new Shop();
		shop1.addProduct(product1);
		shop1.addProduct(product2);
		
		shop1.displayAllProducts();
		
		shop1.removeProduct(product1);
		shop1.displayAllProducts();
		
	}

}

class Shop{
	
	List<Product> products = new ArrayList<>();
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public void removeProduct(Product product) {
		if(!products.remove(product)) {
			System.out.println(product.getProductName() + "を削除しました");
		}else {
			System.out.println("この商品はこの店にはありません");
		}
	}
	
	public void displayAllProducts() {
		if(products.isEmpty()) {
			System.out.println("この店には在庫がありません");
		}else {
			products.forEach(p -> p.displayProductInfo());
		}
		
	}
}

class Product{
	
	private String productName;
	private int price;
	private int stock;
	
	public Product(String productName, int price,int stock) {
		this.productName = productName;
		this.price = price;
		this.stock = stock;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void displayProductInfo() {
		System.out.println("商品名:" + productName);
		System.out.println("価格:" + price);
		System.out.println("在庫:" + stock);
	}
	
}
