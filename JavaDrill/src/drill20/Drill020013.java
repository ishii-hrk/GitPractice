package drill20;

import java.util.HashSet;
import java.util.Set;

public class Drill020013 {
	public static void main(String[] args) {
		//Setを作成
		Set<Integer> setNumbers = new HashSet<>(Set.of(1, 2, 3, 4, 5));
		
		//要素を合計
		int sum = setNumbers.stream()
							.mapToInt(Integer::intValue)
							.sum();
		System.out.println(sum);	
	}
}
