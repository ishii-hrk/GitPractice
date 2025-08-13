package pracitce3;

import java.util.Random;

public class Practice307 {
	public static void main(String[] args) {
        // 平均的な性能のnormal号
        RacingCar normal = new RacingCar("Normal号", 10, 10);
        
        // スピードはあるがエンストが多いgambler号
        RacingCar gambler = new RacingCar("Gambler号", 20, 3);
        
        // 安全面を重視したcareful号
        RacingCar careful = new RacingCar("Careful号", 5, 1000);
        
        // 各車一斉にスタート！！
        normal.start();
        gambler.start();
        careful.start();
        
        // 前車がゴールするのを待つ
        try {
            normal.join();
            gambler.join();
            careful.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("レースが終了しました");
    }

}

class RacingCar extends Thread{
	final int GOAL = 100;
	
	private String name;
	private int maxDistance;
	private int engineStop;
	
	public RacingCar(String name, int maxDistance, int engineStop) {
		this.name = name;
		this.maxDistance = maxDistance;
		this.engineStop = engineStop;
	}
	
	@Override
	public void run() {
		int totalMileage = 0;
		int mileage = 0;
		
		Random ran = new Random();

		while(true) {
			try {
				if(ran.nextInt(engineStop) == 0) {
					System.out.println(name + "がエンストしました！");
					Thread.sleep(3000);
				}else {
					mileage = ran.nextInt(maxDistance) + 1;
					System.out.println(name + "が" + mileage + "km走行しました！");
					totalMileage += mileage;
					if(totalMileage >= GOAL) {
						break;
					}
					Thread.sleep(1000);
				}
			}catch(InterruptedException e) {
				e.printStackTrace();
			}	
		}
		
		System.out.println(name + "がゴールしました！");
	}
}
