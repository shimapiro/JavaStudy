package FinanceManager;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		FinanceManager finance = new FinanceManager();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("===家計簿アプリ===");
			System.out.println("1.収入を追加");
			System.out.println("2.支出を追加");
			System.out.println("3.残高を表示");
			System.out.println("4.終了");
			System.out.println("1~4を選択してください");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1 -> {
				System.out.println("収入を追加してください");
				int income = scanner.nextInt();
				finance.addIncome(income);
				System.out.println("収入を追加しました" + income + "円");
			}
			case 2 -> {
				System.out.println("支出を追加してください");
				int expense = scanner.nextInt();
				finance.addExpense(expense);
				System.out.println("支出を追加しました" + expense + "円");
			}
			case 3 -> finance.displayBalance();
			case 4 -> {
				System.out.println("終了します");
				scanner.close();
				System.exit(0);
			}
			default -> System.out.println("無効な選択です");
			}
		}

	}
}
