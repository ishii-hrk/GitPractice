package drill20;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Drill020004 {
	public static void main(String[] args) {
		//リストの作成
		List<String> colors = Arrays.asList("Red", "Green", "Blue", "Yellow", "Orange");
		
		//イテレータで要素を順に表示
		Iterator<String> colIterator = colors.iterator();
		while(colIterator.hasNext()) {
			String color = colIterator.next();
			System.out.println(color);
		}
		
		boolean isContain = 
				colors.stream()
					  .map(String::toUpperCase)
					  .anyMatch(c -> c.contains("A"));
		System.out.println(isContain);
	}
}
