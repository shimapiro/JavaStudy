package TodoApp;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		TaskList taskList = new TaskList();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("1.タスクを追加　2.タスクを表示　3.終了");
			System.out.println("選択してください：");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1 -> {
				System.out.println("タスクを入力してください");
				String description = scanner.nextLine();
				taskList.addTask(description);
			}
			case 2 -> taskList.displayTasks();
			case 3 -> {
				System.out.println("アプリを終了します");
				return;
			}
			default ->System.out.println("無効な入力です");
			}
		}

	}
}
