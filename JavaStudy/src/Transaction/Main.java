package Transaction;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BudgetManager manager = new BudgetManager();
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		String filename = "transactions.csv";

		manager.setTransactions(FileManager.loadFormFile(filename));

		do {
			System.out.println("家計簿メニュー");
			System.out.println("1:収入・支出を登録");
			System.out.println("2:収入・支出一覧を表示");
			System.out.println("3:現在の収入を表示");
			System.out.println("4:終了します");
			System.out.println("5:カテゴリーの合計金額");
			System.out.println("１〜4を選択してください");

			try {
				choice = scanner.nextInt();
				scanner.nextLine();
			} catch (Exception e) {
				System.out.println("入力が無効です");
				scanner.nextLine();
				continue;
			}

			switch (choice) {
			case 1:
				try {
					System.out.println("日付を入力してください(2025-01-01)");
					String date = scanner.nextLine();
					System.out.println("カテゴリーを入力してください(食費)");
					String category = scanner.nextLine();
					System.out.println("金額を入力してください(1900)");
					double amount = scanner.nextDouble();
					manager.addTransaction(date, category, amount);
				} catch (Exception e) {
					System.out.println("無効な入力です");
					scanner.nextLine();
				}

				break;

			case 2:
				manager.showTransaction();
				break;
			case 3:
				double calculate = manager.calculateTransaction();
				System.out.println("現在の金額は" + calculate + "円");
				break;
			case 4:
				FileManager.saveToransaction(filename, manager.getTransactions());
				System.out.println("アプリを終了します");
				break;
			case 5:
				System.out.println("カテゴリーを入力してください（食費）");
				String category = scanner.nextLine();
				double categoryTotal = manager.calculateCategory(category);
				System.out.println(category+"の合計："+categoryTotal+"円");
				break;
			default:
				System.out.println("無効な選択です。もう一度選択してください");
			}

		} while (choice != 4);
		scanner.close();
	}
}
