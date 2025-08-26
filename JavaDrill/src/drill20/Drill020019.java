package drill20;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Drill020019 {
	public static void main(String[] args) {
		//Mapの作成
		Map<String, Integer> stringIntMap = new HashMap<>();
        stringIntMap.put("One", 1);
        stringIntMap.put("Two", 2);
        stringIntMap.put("Three", 3);
        
        //特定のキーを持つエントリを削除
        Map<String,Integer> removeMap =
        		stringIntMap.entrySet().stream()
        		.filter(m -> m.getKey().contains("T"))
        		.collect(Collectors.toMap(
        				Map.Entry::getKey,
        				Map.Entry::getValue
        				));
        System.out.println(removeMap);
	}

}
