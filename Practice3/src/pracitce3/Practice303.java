package pracitce3;

import java.util.ArrayList;

public class Practice303 {
	 public static void main(String[] args) {
	        // デジカメオブジェクトの宣言と生成
	        DigitalCamera myCamera = new DigitalCamera();
	        // デジカメにて撮影
	        myCamera.takePicture("子猫");
	        myCamera.takePicture("ランチ");
	        myCamera.takePicture("カプチーノ");
	        myCamera.takePicture("赤ちゃん");
	        myCamera.takePicture("ツーショット");
	        System.out.println();
	        // 撮影画像数の確認
	        System.out.println("現在の撮影枚数：" + myCamera.getPictureCount());
	        System.out.println();
	        // 画像の閲覧
	        myCamera.showPictures();
	        System.out.println();
	        // 画像ファイルのクリア
	        myCamera.clearMemory();
	        System.out.println();
	        // 撮影画像数の再確認
	        System.out.println("現在の撮影枚数：" + myCamera.getPictureCount());
	    }
	}
	
	// ここにデジカメクラスを作成してください
class DigitalCamera{
	private ArrayList<Picture> memory;
	
	public DigitalCamera() {
		memory = new ArrayList<Picture>();
	}
	
	public void takePicture(String picture) {
		System.out.println(picture + "を撮影しました");
		memory.add(new Picture(picture));
	}
	
	public void showPictures() {
		System.out.println("★☆　画像一覧　☆★");
		for(Picture p : memory) {
			System.out.println(p);
		}
	}
	
	public int getPictureCount() {
		return memory.size();
	}
	
	public void clearMemory() {
		memory.clear();
		System.out.println("すべての画像を消去しました");
	}
}


	// ここに画像クラスを作成してください
class Picture{
	String target;
	
	public Picture(String target) {
		this.target = target;
	}
	
	public String toString() {
		return this.target + "の画像";
	}
}

