package drill20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Drill020029 {
	public static void main(String[] args) {
        //List作成
		List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        
        // TODO: Collections.reverse メソッドを使用してリスト numbers を逆順にするコードを書いてください。
		Collections.reverse(numbers);
		
        System.out.println("Reversed List: " + numbers);
    }

}
