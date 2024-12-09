package FizzBuzz;

public class FizzBuzz1 {
	public static void main(String[] args) {
		fizzbuzz1(1, 100, 3, 5);
	}

	public static void fizzbuzz1(int start, int end, int fizz, int buzz) {
		for (int i = start; i <= end; i++) {
			if (i % (fizz * buzz) == 0) {
				System.out.println("FIZZBUZZ");
			} else if (i % fizz == 0) {
				System.out.println("FIZZ");
			} else if (i % buzz == 0) {
				System.out.println("BUZZ");
			}else {
				System.out.println(i);
			}
		}
	}
}
