package Practice2;

public class practice214 {
	public static void main(String[] args) {
        // 鳥配列オブジェクトの生成
        Bird[] birds = {new Swallow(), new Penguin(), new Atthis()};
        
        // 鳥たちの紹介
        // ここからコーディングしてください
        
        for( Bird b : birds) {
        	b.eat();
        	if(b instanceof Flyable) {
        		((Flyable) b).fly();
        	}
        	if(b instanceof Swimable) {
        		((Swimable) b).swim();
        	}
        }
    }
}

// 飛行可能インタフェース
interface Flyable {
    // 飛ぶ抽象メソッド
    void fly();
}
// 水泳可能インタフェース
interface Swimable {
    // 泳ぐ抽象メソッド
    void swim();
}
// 食事可能インタフェース
interface Eatable {
    // 食べる抽象メソッド
    void eat();
}
// 鳥抽象クラス
abstract class Bird implements Eatable {}

// ここにつばめクラスを作成してください
class Swallow extends Bird implements Flyable{
	public void fly() {
		System.out.println("つばめがスイスイ飛んでいます。");
	}
	
	public void eat() {
		System.out.println("つばめが虫を食べました。");
	}
}
	
// ここにペンギンクラスを作成してください
class Penguin extends Bird implements Swimable{
	public void swim() {
		System.out.println("ペンギンがスイスイ泳いでいます。");
	}
	
	public void eat() {
		System.out.println("ペンギンが魚を食べました。");
	}
}

// ここにカワセミクラスを作成してください	
class Atthis extends Bird implements Flyable,Swimable{
	public void fly() {
		System.out.println("カワセミがスイスイ飛んでいます。");
	}
	
	public void swim() {
		System.out.println("カワセミがスイスイ泳いでいます。");
	}
	
	public void eat() {
		System.out.println("カワセミが小魚をたべました");
	}
}
