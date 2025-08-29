package drill08;

public class Drill0811 {
	public static void main(String[] args) {
		reverseAndUpperCase("Java");
	}
	
	public static String reverseString(String text) {
		//引数textを逆順にする
		StringBuilder sb = new StringBuilder(text);
		sb.reverse();
		String reverseText = sb.toString();
		return reverseText;
	}
	
	public static String toUpperCase(String text) {
		//引数textを大文字にする
		return text.toUpperCase();
		
	}
	
	public static void reverseAndUpperCase(String text) {
		String reverse = reverseString(text);
		String reverseAndUpper = toUpperCase(reverse);
		System.out.println(reverseAndUpper);
	}
}


