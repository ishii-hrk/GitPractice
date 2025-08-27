package drill20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Drill020030 {
	public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        // ここにコードを追加して、リスト numbers をシャッフルしてください。
        Collections.shuffle(numbers);
        
        System.out.println("Shuffled List: " + numbers);
    }

}
