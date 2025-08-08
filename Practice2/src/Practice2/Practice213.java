package Practice2;

public class Practice213 {
	public static void main(String[] args) {
        // アスリート配列オブジェクトの生成
        Athlete[] athlete = {
                new Swimmer("北島光一"),
                new MarathonRunner("高橋昭子"),
                new Swimmer("岩崎正子"),
                new MarathonRunner("野口みきえ")
        };
        // 自己紹介
        for(int i = 0; i < athlete.length; i++) {
            System.out.println(athlete[i]);
        }
        System.out.println();
        // ここから作業してください
        // アスリートの種目に応じたメソッドの実行
        for(int j = 0; j < athlete.length; j++) {
        	if(athlete[j] instanceof Swimmer) {
        		((Swimmer)athlete[j]).swim();		
        	}else {
        		((MarathonRunner)athlete[j]).run();
        	}
        }
    }
}
// Athlete抽象クラス
abstract class Athlete {
    // 選手名
    protected String name;
    
    // 種目名取得メソッド（抽象メソッド）
    public abstract String getType();
    
    @Override
    public String toString() {
        return "私の名前は" + name + "、" + getType() + "の選手です。";
    }
}
// ここにSwimmerクラスを作成してください
class Swimmer extends Athlete{
	public static final String TYPE = "水泳";
	
	public Swimmer (String name) {
		this.name = name;
	}
	
	public String getType() {
		return TYPE;
	}
	
	public void swim() {
		System.out.println(name + "は泳ぎました");
	}	
}

// ここにMarathonRunnerクラスを作成してください
class MarathonRunner extends Athlete{
	public static final String TYPE = "マラソン";
	
	public MarathonRunner(String name) {
		this.name = name;
	}
	
	public String getType() {
		return TYPE;
	}
	
	public void run() {
		System.out.println(name + "は走りました");
	}

}
