package FizzBuzz;

public class FizzBuzz {
	public static void main(String[] args) {
		fizzBuzz(1,100);
	}

	public static void fizzBuzz(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FIZZBUZZ");
			}else if(i%3==0) {
				System.out.println("FIZZ");
			}else if(i%5==0) {
				System.out.println("BUZZ");
			}else {
				System.out.println(i);
			}
		}
	}
}
