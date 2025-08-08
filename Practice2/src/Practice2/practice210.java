package Practice2;

public class practice210 {
	public static void main(String[] args) {
        // 普通の時計オブジェクトの生成
        Clock c1 = new Clock(10, 15, 30);
        
        // 普通の時計の情報の表示
        c1.showData();
        System.out.println();
        
        // 目覚まし時計オブジェクトの生成
        AlarmClock c2 = new AlarmClock(15, 45, 20, 6, 30);
        
        // 目覚まし時計の情報の表示
        c2.showData();
    }

}

class Clock{
	// 時分秒
    private int hour;
    private int minute;
    private int second;
   
    // コンストラクタ
    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    // 情報表示メソッド
    public void showData() {
        System.out.println("ただいまの時刻：" + hour + "時" + minute + "分" + second + "秒");
    }
	
}

class AlarmClock extends Clock{
	
	int alarmHour;
	int alarmMinute;
	
	public AlarmClock(int hour, int minute, int second,int alarmHour,int alarmMinute) {
		super(hour,minute,second);
		this.alarmHour = alarmHour;
		this.alarmMinute = alarmMinute;
	}
	
	@Override
	public void showData() {
		 super.showData();
		 System.out.println("アラーム設定時刻：" + alarmHour + "時" + alarmMinute + "分");
	}
	
}