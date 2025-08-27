package drill20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Drill020032 {
	 public static void main(String[] args) {
	        // 最初のリスト
	        List<String> list1 = new ArrayList<>();
	        list1.add("Apple");
	        list1.add("Banana");
	        list1.add("Cherry");

	        // 二つ目のリスト
	        List<String> list2 = new ArrayList<>();
	        list2.add("Grapes");
	        list2.add("Kiwi");

	        // Collections.addAllメソッドを使用してlist2の要素をlist1に追加してください
	        Collections.addAll(list1,list2.toArray(new String[0]));
	        
	        // 結果を表示
	        System.out.println("Combined List: " + list1);
	    }

}
