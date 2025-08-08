package Practice2;

public class Practice215 {
	public static void main(String[] args) {
		// ミュージシャン配列の作成
        Musician[] band = {
                    new Vocalist("桜井"),
                    new Guitarist("田原", "リードギター"),
                    new Guitarist("中川", "ベース"),
                    new ChorusDrummer("鈴木")
        };
        // ミュージックスタート！
        for(Musician mem : band) {
        	if( mem instanceof Singable) {
        		
        	}
        }
    }
}
// ミュージシャン抽象クラス
abstract class Musician {
    // 名前フィールド
    private String name;
    // コンストラクタ
    public Musician(String name) {
        this.name = name;
    }
    // 名前取得メソッド
    public String getName() {
        return name;
    }
}
// 歌唱可能インタフェース
interface Singable {
    void sing();
}
// 演奏可能インタフェース
interface Playable {
    void play();
}
// ここにボーカリストクラスを作成してください
class Vocalist extends Musician implements Singable{
	public Vocalist(String name) {
		super(name);
	}
	
	public void sing() {
		System.out.println(this.getName() + "は熱唱しました");
	}
}
// ここにギタリストクラスを作成してください
class Guitarist extends Musician implements Playable{
	private String guitarType;
	
	public Guitarist(String name, String gType) {
		super(name);
		this.guitarType = gType;
	}
	
	public void play() {
		System.out.println(this.getName() + "は" + guitarType + "を演奏しました!");
	}
}
// ここにコーラス＆ドラマークラスを作成してください
class ChorusDrummer extends Musician implements Singable,Playable{
	public ChorusDrummer(String name) {
		super(name);
	}
	
	public void sing() {
		System.out.println(this.getName() + "はコーラスでハモリました!");
	}
	
	public void play() {
		System.out.println(this.getName() + "はドラムを演奏しました！");
	}

}
