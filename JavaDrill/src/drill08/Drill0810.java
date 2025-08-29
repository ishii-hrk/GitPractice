package drill08;

public class Drill0810 {
	public static void main(String[] args) {
		Calculator3 calc = new Calculator3();
		calc.performCalculation(5.0,4.0);
	}
}

class Calculator3{
	public double add(double x, double y) {
		return x + y;
	}
	
	public double subtract(double x, double y) {
		return x - y;
	}
	
	public double multiply(double x, double y) {
		return x * y;
	}
	
	public double divide(double x, double y) {
		if( y == 0) {
			System.out.println("除数が0です");
			return Double.NaN;
		}else {
			return x / y;
		}
	}
	
	public void performCalculation(double x, double y) {
		System.out.println(add(x,y));
		System.out.println(subtract(x,y));
		System.out.println(multiply(x,y));
		System.out.println(divide(x,y));
	}
}
