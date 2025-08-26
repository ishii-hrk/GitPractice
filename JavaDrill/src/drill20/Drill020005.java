package drill20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Drill020005 {
	public static void main(String[] args) {
		//リストの作成
		List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange", "Grapes", "Kiwi"));
		
		//イテレータの取得
		Iterator<String> iterator = fruits.iterator();
		
		//イテレータを用いて取得した要素を“Updated”に変更
		while(iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
		
		System.out.println(fruits);
	}

}
