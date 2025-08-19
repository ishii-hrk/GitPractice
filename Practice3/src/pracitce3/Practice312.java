package pracitce3;

import java.util.ArrayList;

public class Practice312 {
	 public static void main(String[] args) {
	        // ホテルがオープン
	        Hotel hotel = new Hotel("ホテルドルフィン");
	        
	        // ホテルに3人の従業員が出勤
	        hotel.enter(new Staff("坂本", "清掃"));
	        hotel.enter(new Staff("長野", "調理"));
	        hotel.enter(new Staff("井ノ原", "接客"));
	        System.out.println();
	        
	        // 3人のお客様がチェックイン（1人が所持金不足で泊まれず）
	        hotel.enter(new Customer("岡田", 500000), Hotel.RoomRank.SUITE);
	        hotel.enter(new Customer("三宅", 40000), Hotel.RoomRank.NORMAL);
	        hotel.enter(new Customer("森田", 4000), Hotel.RoomRank.ECONOMY);
	        System.out.println();
	        
	        // ホテルを運営
	        hotel.manage();
	        System.out.println();
	        
	        // お客様情報の確認
	        hotel.showCustomerInfo();
	        System.out.println();
	        
	        // ホテル情報の確認
	        hotel.showHotelInfo();
	    }
}

//ここにホテルクラスを作成してください
class Hotel{
	private String name;
	private long profits;
	private ArrayList<Staff> staffs;
	private ArrayList<Customer> customers;
	
	//部屋ランクの列挙型
	public enum RoomRank{
		SUITE("スイートルーム",100000),
		NORMAL("通常ルーム",20000),
		ECONOMY("格安ルーム",5000);
		
		private final String roomRankName;
		private final int price;
		
		private RoomRank(final String name,final int price) {
			this.roomRankName = name;
			this.price = price;
		}
		
		public int getPrice() {
			return this.price;
		}
		
		@Override
		public String toString() {
			return roomRankName;
		}
	}
	
	public Hotel(String name) {
		this.name = name;
		System.out.println( name + "がオープンしました");
		
		staffs = new ArrayList<>();
		customers = new ArrayList<>();
	}
	
	public void enter(Staff staff) {
		System.out.println(staff.getName() + "が" + name + "に出勤しました");
		staffs.add(staff);
	}
	
	public void enter(Customer customer, RoomRank rank) {
		try {
			profits += customer.pay(rank.getPrice());
			System.out.println(customer.getName() + "様が" + name + "の" + rank + "にお泊りになります");
			customers.add(customer);
		}catch(ShortFallException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void manage() {
		for(Staff staff : staffs) {
			staff.work();
		}
	}
	
	public void showCustomerInfo() {
		System.out.println("お客様情報");
		for(Customer c : customers) {
			System.out.println(c);
		}
	}
	
	public void showHotelInfo() {
		System.out.println(name + "の現在の状況");
		System.out.println("現在働いている従業員数：" + staffs.size() + "名");
		System.out.println("現在お泊まりのお客様数：" + customers.size() + "名");
		System.out.println("現在の利益" + profits + "円");
	}
}

//人抽象クラス
abstract class Person {

// 氏名
 protected String name;
 
 // 名前取得メソッド
 public String getName() {
     return name;
 }
}
//労働可能インタフェース
interface Workable {

// 働く抽象メソッド
 void work();
}
//ここに従業員クラスを作成してください
class Staff extends Person implements Workable{
	//職種フィールド
	String jobType;
	
	public Staff(String name,String jobType) {
		this.name = name;
		this.jobType = jobType;
	}
	
	public void work() {
		System.out.println(name + "が" + jobType + "を行いました");
	}
}
//ここに顧客クラスを作成してください
class Customer extends Person{
	//所持金
	int money;
	
	public Customer(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public int pay(int money) throws ShortFallException{
		 if(this.money < money) {
			 throw new ShortFallException(name + "は所持金不足です");
		 }else {
			 this.money -= money;
			 return money;
		 }
	}
	
	@Override
	public String toString() {
		return name + "様" + "　所持金：" + money + "円";
	}
}

//所持金不足例外クラス
class ShortFallException extends Exception {
 public ShortFallException(String message) {
     super(message);
 }
}