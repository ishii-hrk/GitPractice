package drill08;

public class Drill0818 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		System.out.println(calculateAverage(array));
	}
	
	public static int calculateAverage(int[] array) {
		//平均値の初期化
		int avg = 0;
		
		//ループで使用する合計の変数の初期化
		int sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		if(array.length != 0) {
			avg = sum / array.length;
			return avg;
		}else {
			System.out.println("配列が空です");
		}
		return 0;
	}

}
