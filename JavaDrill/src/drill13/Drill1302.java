package drill13;

public class Drill1302 {

	public static void main(String[] args) {
		// 2つの文字列を結合するプログラム
		String text1 = "Hello,";
		String text2 = "Java!";
		System.out.println(text1 + text2);
		
		//カンマで区切られた文字列を取り込み、それを分割して配列に格納するプログラム
		 String input = "apple,orange,banana";
		 String[] parts = input.split(",");
		 for(String t : parts) {
			 System.out.println(t);
		 }

	}

}
