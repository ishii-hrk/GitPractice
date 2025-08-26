package drill20;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Drill020007 {
	public static void main(String[] args) {
		//リストの作成
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
	
		//イテレータ取得
		ListIterator<Integer> iterator = numbers.listIterator(numbers.size());
		
		//要素を逆順に表示
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}

}
