package NumberGuessGame;

import java.util.Scanner;

public class MathRandom {
	public static void main(String[] args) {
		int targetNumber = (int) (Math.random() * 100) + 1;
		Scanner scanner = new Scanner(System.in);
		int choice = 0;

		System.out.println("1～100の好きな数字を入力してください");

		while (choice != targetNumber) {
			System.out.println("数字を入力してください");
			try {
				choice = scanner.nextInt();

				if (choice < targetNumber) {
					System.out.println("数が小さいです");
				} else if (choice > targetNumber) {
					System.out.println("数が大きいです");
				} else {
					System.out.println("正解です");
					break;
				}
			} catch (Exception e) {
				System.out.println("無効な入力です");
				scanner.nextLine();
			}
			
		}
		System.out.println("ゲームを終了します");
		scanner.close();
	}
}
