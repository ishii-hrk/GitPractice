package drill20;

import java.util.HashMap;
import java.util.Map;

public class Drill020017 {
	public static void main(String[] args) {
		//Map作成
		Map<String, Integer> mapA = new HashMap<>();
        mapA.put("Apple", 3);
        mapA.put("Banana", 2);
        mapA.put("Orange", 5);

        Map<String, Integer> mapB = new HashMap<>();
        mapB.put("Apple", 7);
        mapB.put("Banana", 4);
        mapB.put("Grapes", 6);
        
        //新しいMapの作成
        Map<String,Integer> newMap = new HashMap<>(mapA);
        
        //mapBのエントリに対して処理
        for(Map.Entry<String, Integer> entryB : mapB.entrySet()) {
        	String keyB = entryB.getKey();
        	int valueB = entryB.getValue();
        	
        	if(newMap.containsKey(keyB)) {
        		int valueA = newMap.get(keyB);
        		newMap.put(keyB, valueA + valueB);
        	}else {
        		newMap.put(keyB, valueB);
        	}
        }
        
        System.out.println(newMap);
	}

}
