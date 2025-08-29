package drill08;

public class Drill0819 {
	public static void main(String[] args) {
		int[] numbers = {20,47,56,12,58};
		System.out.println(findMax(numbers));
	}
	
	public static int findMax(int[] array) {
		//最大値の変数を初期化
		int max = 0;
		
		for(int i : array) {
			if(max < i) {
				max = i;
			}
		}
		
		return max;
	}

}
