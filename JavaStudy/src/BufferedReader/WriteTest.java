package BufferedReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTest {
	public static void main(String[] args) {
		
		String fileName="example.txt";
		
		try(BufferedWriter writer =new BufferedWriter(new FileWriter(fileName))){
			writer.write("書き込み練習");
			writer.newLine();
			writer.write("ファイルを作る");
			System.out.println("ファイルの書き込みが完了しました");
		}catch(IOException e){
			System.out.println("エラーが発生しました"+e.getMessage());
		}
	}
}
