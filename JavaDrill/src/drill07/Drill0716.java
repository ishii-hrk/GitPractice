package drill07;

public class Drill0716 {
	public static void main(String[] args) {
		Car3 myCar = new Car3("ポルシェ","Red");
		Owner2 owner = new Owner2("Paul","+1234567");
		
		myCar.setOwner(owner);
		
		myCar.diaplayCarInfo();
	}
}

class Car3{
	
	private String model;
	private String color;
	private Owner2 owner;
	
	public Car3(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public void setOwner(Owner2 owner) {
		this.owner = owner;
	}
	
	public void diaplayCarInfo() {
		System.out.println("Car model:" + model);
		System.out.println("Car color:" + color);
		if( owner != null) {
			System.out.println("Owner:" + owner.getName());
		}
	}
}

class Owner2{
	
	private String name;
	private String contact;
	
	public Owner2(String name, String contact) {
		this.name = name;
		this.contact = contact;
	}
	
	public String getName() {
		return name;
	}
}
