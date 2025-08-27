package drill20;

import java.util.HashMap;
import java.util.Map;

public class Drill020022 {
	public static void main(String[] args) {
		//Map作成
		 Map<String, Integer> priceMap = new HashMap<>();
	        priceMap.put("Apple", 120);
	        priceMap.put("Banana", 80);
	        priceMap.put("Orange", 150);
	        priceMap.put("Grapes", 200);
	        
	    //最大の値をもつエントリを探す
	    priceMap.entrySet().stream()
	    		.max(Map.Entry.comparingByValue())
	    		.ifPresent(System.out::println);
	}

}
