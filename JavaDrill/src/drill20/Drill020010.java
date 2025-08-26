package drill20;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Drill020010 {
	public static void main(String[] args) {
		 // 与えられた整数型セット setA と setB
        Set<Integer> setA = new HashSet<>();
        setA.add(3);
        setA.add(1);
        setA.add(4);
        setA.add(5);
        
        Set<Integer> setB = new HashSet<>();
        setB.add(2);
        setB.add(6);
        setB.add(5);
        setB.add(3);
        
        //セットを結合し、昇順で表示
        Set<Integer> setC = new TreeSet<>(setA);
        setC.addAll(setB);
        System.out.println(setC);
	}

}
