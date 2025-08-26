package drill20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Drill020001 {
	public static void main(String[] args) {
		//リスト作成
		List<String> animals = new ArrayList<>(
				Arrays.asList("Cat", "Elephant", "Monkey", "Lion"));
		
		//リストに要素を追加
		animals.add("Dog");
		
		//リスト出力
		System.out.println(animals);
	}

}
