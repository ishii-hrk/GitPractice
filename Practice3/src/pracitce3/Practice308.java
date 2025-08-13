package pracitce3;

public class Practice308 {
	public static void main(String[] args) {
        // 募金箱オブジェクトの取得
        CollectionBox cb = CollectionBox.getInstance();
        
        // 偽物の募金箱を作れないようにする（コンパイルエラー）
        
        // CollectionBox imitation = new CollectionBox();
        
        // 5人の大富豪オブジェクトを生成
        MultiMillionaire mm1 = new MultiMillionaire(cb);
        MultiMillionaire mm2 = new MultiMillionaire(cb);
        MultiMillionaire mm3 = new MultiMillionaire(cb);
        MultiMillionaire mm4 = new MultiMillionaire(cb);
        MultiMillionaire mm5 = new MultiMillionaire(cb);
       
        // 募金の開始
        mm1.start();
        mm2.start();
        mm3.start();
        mm4.start();
        mm5.start();
        
        // 全員の募金が終わるまで待つ
        try {
            mm1.join();
            mm2.join();
            mm3.join();
            mm4.join();
            mm5.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        
        // 募金総額の発表
        System.out.println("募金総額は" + cb.getTotalAmount() + "円です。");
    }
}

class MultiMillionaire extends Thread{
	private CollectionBox collectionBox;
	
	public MultiMillionaire(final CollectionBox collectionBox) {
		this.collectionBox = collectionBox;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 1000000; i++) {
			collectionBox.contribute(1);
		}
	}
}

class CollectionBox {
	private static CollectionBox collectionBox = new CollectionBox();
	//合計金額フィールド
	private int totalAmount;
	
	private CollectionBox() {
	}
	
	public static CollectionBox getInstance() {
		if(collectionBox == null) {
			collectionBox = new CollectionBox();
		}
		return collectionBox;
	}
	
	
	
	public synchronized void contribute(int money) {
		totalAmount += money;
	}
	
	public int getTotalAmount() {
		return totalAmount;
	}
}
