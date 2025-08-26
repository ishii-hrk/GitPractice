package drill20;

import java.util.Arrays;
import java.util.List;

public class Drill020003 {
	public static void main(String[] args) {
		//リストの作成
		List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Grapes", "Kiwi", "Mango");
	
		//“Orange”が存在するか検索し、あれば“Peach”に変更
		if(fruits.contains("Orange")) {
			fruits.set(fruits.indexOf("Orange"), "Peach");
		}
		System.out.println(fruits);
		
	
	}

}
