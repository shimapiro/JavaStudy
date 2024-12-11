package FinanceManager;

public class FinanceManager {
	private int totalIncome;
	private int totalExpense;

	public FinanceManager() {
		this.totalExpense = 0;
		this.totalIncome = 0;
	}

	public void addIncome(int income) {
		totalIncome += income;
	}

	public void addExpense(int expense) {
		totalExpense += expense;
	}
	
	public void displayBalance() {
		System.out.println("\n===現在の収支===");
		System.out.println("総収入"+totalIncome);
		System.out.println("総支出"+totalExpense);
		System.out.println("残高"+(totalIncome-totalExpense)+"円");
	}
}
