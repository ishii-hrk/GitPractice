package drill20;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Drill020028 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(7, 3, 1, 9, 5, 2, 8, 4, 6);

        // ここにソートのコードを追加
		Collections.sort(numbers);

        // ソート後のリストを表示
        System.out.println(numbers);
	}

}
