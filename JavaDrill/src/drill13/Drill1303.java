package drill13;

public class Drill1303 {

	public static void main(String[] args) {
		 // 入力として与えられた文字列
        String input = "Hello, World!";

        // 検索する部分文字列
        String searchString = "World";
        
        //特定の部分文字列を検索し、その出現位置を返すプログラム
        System.out.println(input.indexOf(searchString));
        
        //指定された部分文字列を別の文字列に置換するプログラム
        //別の文字列
        String replaceText = "Java";
        
        //"World"を"Java"に置換する。
        input.replace(searchString, replaceText);
	}

}
