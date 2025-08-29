package drill13;

public class Drill1305 {

	public static void main(String[] args) {
		// 文字列フォーマットを使用して、変数を含む文章を生成するプログラム
		String name = "John";
		int age = 25;
		
		String introduce = formatString(name,age);
		System.out.println(introduce);
		
	}
	
	public static String formatString(String name, int age) {
		String intro = String.format("名前は%sで、年齢は%d歳です", name, age);
		return intro;
	}

}
