package NumberGuessGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenGuessGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int evenNumber = -1;

		System.out.println("偶数、奇数判定プログラム");
		System.out.println("0を入力すると終了します");
		while (evenNumber != 0) {
			System.out.println("数を入力してください");

			try {
				evenNumber = scanner.nextInt();
				if (evenNumber == 0) {
					System.out.println("終了です");
					break;
				} else if (evenNumber % 2 == 0) {
					System.out.println("偶数です");
				} else {
					System.out.println("奇数です");
				}
			} catch (InputMismatchException e) {
				System.out.println("無効な数字です");
				scanner.nextLine();

			}
		}
		scanner.close();
	}

}
