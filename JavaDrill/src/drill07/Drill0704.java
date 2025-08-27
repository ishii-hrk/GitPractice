package drill07;

public class Drill0704 {

	public static void main(String[] args) {
		Car car = new Car("ポルシェ","赤",60);
		car.accelerate(10.0);
		car.displaySpeed();
		
		car.decelerate(70.0);
	}
}

class Car{
	
	private String model;
	private String color;
	private double speed;
	
	public Car(String model,String color, double speed) {
		this.setModel(model);
		this.setColor(color);
		this.setSpeed(speed);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public void accelerate(double speed) {
		this.speed += speed;
	} 
	
	public void decelerate(double speed) {
		this.speed -= speed;
		if(this.speed <= 0) {
			System.out.println("停止しました");
		}else {
			this.speed -= speed;
		}
		
	}
	
	public void displaySpeed() {
		System.out.println("今のスピードは" + this.speed + "kmです");
	}
}
