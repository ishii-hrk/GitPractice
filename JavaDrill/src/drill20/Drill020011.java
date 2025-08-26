package drill20;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Drill020011 {
	public static void main(String[] args) {
		//Set作成
		List<String> setA = Arrays.asList("Apple", "Banana", "Orange", "Grapes");
		Set<String> setX = new HashSet<>(setA);
		List<String> setB = Arrays.asList("Banana", "Grapes", "Kiwi");
		Set<String> setY = new HashSet<>(setB);
		
		//新しいSetを作成
		Set<String> resultSet = new HashSet<>();
		
		//setXの要素を順番に取り出し、setYに含まれているかを確認
		for(String element : setX) {
			if(!setY.contains(element)) {
				resultSet.add(element);
			}
		}
		
		System.out.println(resultSet);
	}
}
