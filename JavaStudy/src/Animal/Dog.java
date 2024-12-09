package Animal;

public class Dog extends Animal {
	private String dogColor;

	public Dog(String name, int age, String dogColor) {
		super(name, age);
		this.dogColor = dogColor;
	}
	
	public String getColor() {
		return dogColor;
	}
	
	public void makeSound() {
		System.out.println(getName()+"わんわん鳴きます");
	}
	
	public void eated() {
		System.out.println(getName()+"ドックフードを食べた");
	}
}
