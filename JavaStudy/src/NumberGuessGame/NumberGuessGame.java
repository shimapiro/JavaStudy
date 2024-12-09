package NumberGuessGame;

import java.util.Scanner;

public class NumberGuessGame {
	public static void main(String[] args) {
		int targetNmber = (int) (Math.random() * 100) + 1;
		Scanner scanner = new Scanner(System.in);
		int guess = 0;

		System.out.println("１から100の数をあててください");

		while (guess != targetNmber) {
			System.out.println("数を入力");
			guess = scanner.nextInt();

			if (guess > targetNmber) {
				System.out.println("もっと小さい数字です");
			} else if (guess < targetNmber) {
				System.out.println("もっと大きい数字です");
			} else {
				System.out.println("正解です");
			}

		}
		scanner.close();

	}
}
