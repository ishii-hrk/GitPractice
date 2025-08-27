package drill07;

public class Drill0711 {
	public static void main(String[] args) {
		Calculator calc = new Calculator(25,14);
		
		int sum = calc.sum();
		System.out.println(sum);
		int sub = calc.sub();
		System.out.println(sub);
	}
}

class Calculator{
	private int x;
	private int y;
	
	public Calculator(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int sum() {
		return x + y;
	}
	
	public int sub() {
		return x - y;
	}
}
