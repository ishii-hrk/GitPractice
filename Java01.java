package SelfStudy;

public class Java01 {
	public static void main(String[] args) {
		/*
		 * 1.出力する文字の定数化
		 * 2.コメントの追記
		 * 3.変数名の変更
		 */
		
		final String ZERO = "0です";
		final String PLUS = "正です";
		final String MINUS = "負です";
		
		//判定用変数の定義
		int num = 6;
		
		//numの正負の判定
		if( num == 0 ) {
			System.out.println(ZERO);
		}else if( num > 0){
			System.out.println(PLUS);
		}else {
			System.out.println(MINUS);
		}
	
  }

}
