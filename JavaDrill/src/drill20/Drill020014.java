package drill20;

import java.util.HashMap;
import java.util.Map;

public class Drill020014 {
	public static void main(String[] args) {
		//Mapの作成
		Map<String, Integer> numberMap = new HashMap<>();
        numberMap.put("One", 1);
        numberMap.put("Two", 2);
        numberMap.put("Three", 3);
        numberMap.put("Four", 4);
        numberMap.put("Five", 5);
        
        //合計を計算し、出力
        int sum = numberMap.entrySet().stream()
        					.mapToInt(Map.Entry::getValue)
        					.sum();
        System.out.println(sum);
	}
}
