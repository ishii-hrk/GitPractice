package drill20;

import java.util.HashSet;
import java.util.Set;

public class Drill020012 {
	public static void main(String[] args) {
		//Setの作成
		Set<String> setP = new HashSet<>(Set.of("Apple", "Banana", "Orange"));
        Set<String> setQ = new HashSet<>(Set.of("Orange", "Banana", "Apple"));
	
        //Setのサイズを比較
        if(setP.size() != setQ.size()) {
        	System.out.println("違うセットです");
        }
        
        //Setの内容を比較
        if(setP.equals(setQ)) {
        	System.out.println("内容が同じです");
        }
        
	}

}
