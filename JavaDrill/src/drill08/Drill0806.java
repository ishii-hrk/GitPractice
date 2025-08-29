package drill08;

public class Drill0806 {

	public static void main(String[] args) {
		Car3 myCar = new Car3();
		myCar.start();
		myCar.stop();

	}
}

class Car3{
	public void start() {
		System.out.println("車が発進しました");
	}
	
	public void stop() {
		System.out.println("車が停止しました");
	}
}
