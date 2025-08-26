package drill20;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Drill020018 {
	public static void main(String[] args) {
		//Mapを作成
		Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("One", 1);
        originalMap.put("Two", 2);
        originalMap.put("Three", 3);
        
        //新しいMapの作成
        Map<Integer,String> reversedMap = 
        		 originalMap.entrySet().stream()
        		.collect(Collectors.toMap(
        				Map.Entry::getValue,
        				Map.Entry::getKey
        				));
        System.out.println(reversedMap);
        
	}

}
