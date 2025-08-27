package drill20;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Drill020021 {
	public static void main(String[] args) {
		//Map作成
		Map<String, Integer> stringIntMap = new HashMap<>();
        stringIntMap.put("One", 1);
        stringIntMap.put("Two", 2);
        stringIntMap.put("Three", 3);
        
       //新しいMapの作成
        Map<String, String> concatenatedMap = stringIntMap.entrySet()
                .stream()
                .collect(Collectors.toMap(
                    Map.Entry::getKey,
                    entry -> entry.getKey() + entry.getValue()
                ));
        
        System.out.println(concatenatedMap);
        		
	}

}
