package Transaction;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

	public static void saveToransaction(String filename, ArrayList<Transaction> transactions) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
			for (Transaction transaction : transactions) {
				writer.write(transaction.getDate() + "," + transaction.getCategory() + "," + transaction.getAmount());
				writer.newLine();
			}
			System.out.println("データを保存しました" + filename);
		} catch (IOException e) {
			System.out.println("エラーが発生しました" + e.getMessage());
		}
	}
	
	public static ArrayList<Transaction>loadFormFile(String filename){
		ArrayList<Transaction> transactions = new ArrayList<Transaction>();
		try(BufferedReader reader =new BufferedReader(new FileReader(filename))){
			String line;
			while((line=reader.readLine()) !=null) {
				String[] partts=line.split(",");
				String date =partts[0];
				String category =partts[1];
				double amount =Double.parseDouble(partts[2]);
				transactions.add(new Transaction(date, category, amount));
			}
			System.out.println("データを読み込みました"+filename);
		}catch (IOException e) {
			System.out.println("データの読み込み中にエラー"+e.getMessage());
		}
		return transactions;
	}
}
