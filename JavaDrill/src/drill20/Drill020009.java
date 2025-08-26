package drill20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Drill020009 {
	public static void main(String[] args) {
		//リストの作成
		List<Integer> originalList = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 7, 8, 9, 5);
	
		//HashSetを作成し、オリジナルの重複を削除
		ArrayList<Integer> changeList = new ArrayList<Integer>(new HashSet<>(originalList));
		
		//重複を削除したリストを出力
		System.out.println(changeList);
	}

}
