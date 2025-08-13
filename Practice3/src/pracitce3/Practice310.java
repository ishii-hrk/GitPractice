package pracitce3;

public class Practice310 {
	public static void main(String[] args) {
        // 四季列挙子を格納した配列変数の宣言
        Season[] seasons = {
                        Season.SPRING,
                        Season.SUMMER,
                        Season.FALL,
                        Season.WINTER
             };
        // 四季をループで回す
        for(Season s : seasons) {
        	System.out.println(s);
        }
    }
}
// ここに季節列挙型を作成してください
enum Season{
	SPRING("春"),SUMMER("夏"),FALL("秋"),WINTER("冬");
	
	private final String name;
	
	private Season(final String name){
		this.name = name;
	}
	
	public String toString() {
		return this.name;
	}

}
