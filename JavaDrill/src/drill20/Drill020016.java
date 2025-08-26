package drill20;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Drill020016 {
	public static void main(String[] args) {
		//Map作成
		Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 25);
        ageMap.put("David", 40);
        ageMap.put("Eva", 30);
        
        //特定の値を持つエントリ（30未満）を削除
        Map<String,Integer> newMap 
        			= ageMap.entrySet().stream()
        				.filter(e -> e.getValue() >= 30)
        				.collect(Collectors.toMap(
        				Map.Entry::getKey,Map.Entry::getValue
        				));
        System.out.println(newMap);
	}

}
