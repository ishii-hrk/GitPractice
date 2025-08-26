package drill20;

import java.util.HashMap;
import java.util.Map;

public class Drill020015 {
	public static void main(String[] args) {
		//Map作成
		Map<String, String> stringMap = new HashMap<>();
        stringMap.put("apple", "fruit");
        stringMap.put("banana", "fruit");
        stringMap.put("orange", "fruit");
        stringMap.put("carrot", "vegetable");
        stringMap.put("broccoli", "vegetable");
        stringMap.put("apple", "fruit"); 
        
        //value="fruit"だけ取り出す
        stringMap.values().stream()
        		.filter(value -> value.equals("fruit") )
        		.forEach(System.out::println);
	}

}
