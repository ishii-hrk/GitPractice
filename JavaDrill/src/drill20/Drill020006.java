package drill20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Drill020006 {
	public static void main(String[] args) {
		//リストの作成
		List<String> words = new ArrayList<>(Arrays.asList("Cat", "Dog", "Elephant", "Ant", "Lion", "Tiger"));
		
		//イテレータ取得
		Iterator<String> iterator = words.iterator();
		
		//文字列長が３未満であれば要素を削除
		while(iterator.hasNext()) {
			String word = iterator.next();
			if(word.length() < 3) {
				iterator.remove();
			}
		}
		
		System.out.println(words);
	}

}
