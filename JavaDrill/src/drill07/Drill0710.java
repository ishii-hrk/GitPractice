package drill07;

public class Drill0710 {
	public static void main(String[] args) {
		Owner carOwner = new Owner("David","Tokyo",0000000000);
		
		CarVer2 car = new CarVer2(
				"ポルシェ",
				"black",
				carOwner
				);
		
		car.displayInfo();
	}
}

class CarVer2{
	private String model;
	private String color;
	private int speed;
	private Owner ownerName;
	
	public CarVer2(String model, String color,Owner ownerName) {
		this.model = model;
		this.color = color;
		this.speed = 0;
		this.ownerName = ownerName;
	}
	
	public void displayInfo() {
		System.out.println("Model:" + model);
		System.out.println("Color:" + color);
		
		if(ownerName != null) {
			System.out.println("\nOwner infomation");
			ownerName.displayInfo();
	}
}

}

class Owner{
	private String ownerName;
	private String address;
	private int tell;
	
	public Owner(String name, String address, int tell) {
		this.ownerName = name;
		this.address = address;
		this.tell = tell;
	}
	
	public void displayInfo() {
		System.out.println("OwnerName:" + ownerName);
		System.out.println("Address" + address);
		System.out.println("Tell" + tell);
		
	
		}
	}
