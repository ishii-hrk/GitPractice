package drill08;

public class Drill0813 {
	public static void main(String[] args) {
		double triangleArea = calculateTriangleArea(5.0,12.0);
		System.out.println(triangleArea);
	}
	
	public static double calculateTriangleArea(double base, double height) {
		return base * height * 0.5;
	}

}
