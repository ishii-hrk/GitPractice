package drill13;

public class Drill1304 {
	public static void main(String[] args) {
		// 2つの文字列
        String str1 = "Hello";
        String str2 = "Hello";
        
        //文字列が等しいかを調べる
        if(str1.equals(str2)) {
        	System.out.println("等しいです");
        }else {
        	System.out.println("異なります");
        }
        
        //ある文字列が別の文字列に含まれているかどうかを検査
        String mainString = "Hello, World!";
        String subString = "World";
        
        String result =
        		mainString.contains(subString) ? "含まれています" : "含まれていません";
        System.out.println(result);
	}

}
