package Transaction;

import java.util.ArrayList;

public class BudgetManager {

	private ArrayList<Transaction> transactions;

	public BudgetManager() {
		transactions = new ArrayList<Transaction>();
	}

	public void addTransaction(String date, String category, double amount) {
		Transaction transaction = new Transaction(date, category, amount);
		transactions.add(transaction);

		System.out.println("登録しました：" + transaction);
	}

	public void showTransaction() {
		System.out.println("ーーーーー収入、支出一覧ーーーー");

		for (Transaction transaction : transactions) {
			System.out.println(transaction);
		}
	}

	public double calculateTransaction() {
		double total = 0;
		for (Transaction transaction : transactions) {
			total += transaction.getAmount();
		}
		return total;
	}

}
