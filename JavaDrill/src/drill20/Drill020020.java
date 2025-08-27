package drill20;

import java.util.HashMap;
import java.util.Map;
import java.util.OptionalDouble;

public class Drill020020 {
	public static void main(String[] args) {
		//Map作成
		Map<String, Integer> scoreMap = new HashMap<>();
        scoreMap.put("Alice", 80);
        scoreMap.put("Bob", 90);
        scoreMap.put("Charlie", 75);
        scoreMap.put("David", 88);
        scoreMap.put("Eva", 95);
        
        //値の平均を求める
        OptionalDouble scoreAvg = scoreMap.entrySet().stream()
        						.mapToDouble(s -> s.getValue())
        						.average();
        System.out.println(scoreAvg);
	}

}
