package drill20;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Drill020008 {
	public static void main(String[] args) {
		//リスト作成
		List<Integer> values = Arrays.asList(10, 20, 30, 40, 50);
	
		//イテレータ取得
		Iterator<Integer> iterator = values.iterator();
		
		//イテレータを使用してリスト内の合計を取得
		int sum = 0;
		while(iterator.hasNext()) {
			int value = iterator.next();
			sum += value;
		}
		
		System.out.println(sum);
	}

}
