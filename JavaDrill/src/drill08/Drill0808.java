package drill08;

public class Drill0808 {
	public static void main(String[] args) {
		ElectronicDevice device = new ElectronicDevice();
		device.turnOn();
		device.turnOff();
	}

}

class ElectronicDevice{
	public void turnOn() {
		System.out.println("電源が入りました");
	}
	
	public void turnOff() {
		System.out.println("電源が落とされました");
	}
}
