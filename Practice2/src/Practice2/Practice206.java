package Practice2;

public class Practice206 {
	public static void main(String[] args) {
        // 1台目の車インスタンス生成
        Car car1 = new Car("トント", 1234, 10.0);
        
        // 2台目の車インスタンス生成
        Car car2 = new Car("ファット", 6789);
        
        // 2台の車を走行させる
        car1.run(7.0);
        car2.run(7.0);
        
        // 2台の車の情報を出力
        car1.showInfo();
        car2.showInfo();
    }

}

class Car{
	private String type;
	private int number;
	private double gasoline;
	
	public Car(String type,int number, double gasoline) {
		this.type = type;
		this.number = number;
		this.gasoline = gasoline;
		
	}
	
	public Car(String type,int number) {
		this(type,number,5.0); 
	}
	
	public void run(double runGasoline) {
		if(gasoline >= runGasoline) {
			System.out.println("ナンバー" + number + "の" + type + "はガソリン" 
								+ runGasoline + "リットル分走行しました");
			gasoline -= runGasoline;
		}
		if(gasoline < runGasoline) {
			System.out.println("ナンバー" + number + "の" + type + 
								"はガソリン不足のため走行できません");
		}
	}
	
	public void showInfo() {
		System.out.println("車種：" + type + "　ナンバー：" + number + "　ガソリン" + 
							gasoline + "リットル");
	}
}
