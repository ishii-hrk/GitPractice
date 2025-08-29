package drill08;

public class Drill0805 {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.add(5,4));
		System.out.println(calc.subtract(5,4));
		System.out.println(calc.multiply(5,4));
		System.out.println(calc.divide(5,0));
		
		
	}

}

class Calculator{
	public int add(int x, int y) {
		return x + y;
	}
	
	public int subtract(int x, int y) {
		return x - y;
	}
	
	public int multiply(int x, int y) {
		return x * y;
	}
	
	public int divide(int x, int y) {
		if( y == 0) {
			System.out.println("除数が0です");
			return (int) Float.NaN;
		}else {
			return x / y;
		}
	}
}
