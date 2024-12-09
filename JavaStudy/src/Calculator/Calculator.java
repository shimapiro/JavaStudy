package Calculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String repeat;
		do {
			System.out.println("1：足し算");
			System.out.println("2：引き算");
			System.out.println("3：掛け算");
			System.out.println("4：割り算");

			System.out.println("操作内容を選んでください(1~4)");
			int choice = scanner.nextInt();

			double result = 0;

			System.out.println("1つ目の数字を選んでください");
			double num1 = scanner.nextDouble();

			System.out.println("2つ目の数字を選んでください");
			double num2 = scanner.nextDouble();

			switch (choice) {
			case 1:
				result = num1 + num2;
				System.out.println("結果" + result);
				break;

			case 2:
				result = num1 - num2;
				System.out.println("結果" + result);
				break;
			case 3:
				result = num1 * num2;
				System.out.println("結果" + result);
				break;
			case 4:
				if (num2 != 0) {
					result = num1 / num2;
					System.out.println("結果" + result);
					break;
				} else {
					System.out.println("エラー");
				}
				break;
			}

			System.out.println("もう一度計算しますか？(yes/no)");
			repeat = scanner.next();

		} while (repeat.equalsIgnoreCase("yes"));

		scanner.close();
	}
}