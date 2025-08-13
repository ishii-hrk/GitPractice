package pracitce3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice304 {
	public static void main(String[] args) {
	//出力文字列の定数化
	final String QUESTION = "人口の多い都道府県ベスト10を当ててください！";
	final String CORRECT = "正解！";
	final String DIFFERENT = "残念・・・";
	final String DIFFERENT_MSG = "はランキングに入っていません・・・";
	final String PERFECT = "おめでとうございます。ベスト10全問正解です！";
	String is = "は";
	String isrank = "位です";
			
	//HashMapクラスの宣言
	Map<String,Integer> rank = new HashMap<>();
			
	//キーと値を追加
	rank.put("東京都", 1);
	rank.put("神奈川県",2);
	rank.put("大阪府", 3);
	rank.put("愛知県", 4);
	rank.put("埼玉県", 5);
	rank.put("千葉県", 6);
	rank.put("兵庫県", 7);
	rank.put("北海道", 8);
	rank.put("福岡県", 9);
	rank.put("静岡県", 10);
			
	//Scannerインスタンスの作成
	Scanner scan = new Scanner(System.in);
			
	//リストの要素がなくならない限り、出題→入力受付を繰り返す
	while(rank.size() != 0) {
		System.out.println(QUESTION);
		String pref = scan.nextLine();
		//正解、不正解の場合ともにメッセージを出力
		//正解した場合、その都道府県はリストから削除
		if( rank.containsKey(pref)) {
			System.out.println(CORRECT);
			String result = String.format(pref + "%s" + rank.get(pref) + "%s",is,isrank);
			System.out.println(result);
			rank.remove(pref);
		}else {
			System.out.println(DIFFERENT);
			System.out.println(pref + DIFFERENT_MSG);
			break;
		}
	}
				
	//全問正解した場合はその旨のメッセージを出力
	if(rank.size() == 0) {
		System.out.println(PERFECT);
	}
				
	//Scannerをクローズ
	scan.close();
	}
}
