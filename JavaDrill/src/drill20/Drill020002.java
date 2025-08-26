package drill20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Drill020002 {
	public static void main(String[] args) {
		//リストの作成
		ArrayList<String> colorsArrayList = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
		LinkedList<String> colorsLinkedList = new LinkedList<>(Arrays.asList("Red", "Green", "Blue"));
	
		//ArrayListのほうに要素を追加→表示
		colorsArrayList.add(0,"Cherry");
		System.out.println(colorsArrayList);
		
		//LinkedListのほうに要素を追加→表示
		colorsLinkedList.addFirst("Cherry");
		System.out.println(colorsLinkedList);
	}
}
