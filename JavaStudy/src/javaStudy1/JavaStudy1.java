package javaStudy1;

import java.util.Scanner;

public class JavaStudy1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("数字を入力してください");

		int number = scanner.nextInt();

		if (number % 2 == 0) {
			System.out.println(number + "偶数です");
		}else {
			System.out.println(number+"奇数です");
		}
		
		scanner.close();
	}
}
