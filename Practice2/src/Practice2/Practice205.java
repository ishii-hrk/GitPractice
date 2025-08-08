package Practice2;

public class Practice205 {
	public static void main(String[] args) {
        // Squareクラスのオブジェクトを作成
        Square square = new Square(4.5, 2.8);
        
        // 四角形の情報を出力
        square.inform();
        
        // 面積の表示
        System.out.println("この四角形の面積は" + square.getArea() + "です。");
        
        // 幅を3.0増加させる
        square.addWidth(3.0);
        System.out.println();
        
        // 四角形の情報を出力
        square.inform();
        
        // 面積の表示
        System.out.println("この四角形の面積は" + square.getArea() + "です。");
    }

}

class Square{
	double height;
	double width;
	
	public Square(double width, double height) {
		this.height = height;
		this.width = width;
	}
	
	public void inform() {
		System.out.println("この四角形の幅は" + width + "、高さは" + height + "です");
	}
	
	public double getArea() {
		return width * height;
		
	}
	
	void addWidth(double width) {
		width += width;
	}
}
