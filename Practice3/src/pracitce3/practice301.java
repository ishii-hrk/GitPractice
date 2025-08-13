package pracitce3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class practice301 {
	public static void main(String[] args) {
        // ここにファイルコピー処理を記述してください
	
		//読み込んだファイルの内容を格納するリストを作成
		List<String> file = new ArrayList<>();
		
		
		if(args != null) {
			//ファイルを読み込み
			try(BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
				String line;
				while((line = reader.readLine()) != null){
					file.add(line);
				}
			}catch(FileNotFoundException e) {
				System.out.println("ファイル名の指定が不正です");
			}catch(IOException e){
				System.out.println("入出力エラーです。");
			}
			
			//ファイルを書き込み
			try(PrintWriter writer = new PrintWriter(new FileWriter(args[1]))){
				for(String str : file) {
					writer.println(str);
				}
			}catch(IOException e) {
				System.out.println("入出力エラーです。");
			}
		}else {
			System.out.println("2つのファイル名を正しく指定してください");
		}
    }
}
