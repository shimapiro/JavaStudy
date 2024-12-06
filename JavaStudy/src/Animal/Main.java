package Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Animal> animals =new ArrayList<Animal>();
		
		animals.add(new Cat("タマ",11,"白色"));
		
		for(Animal animal : animals) {
			System.out.println("名前"+animal.getName());
			System.out.println("年齢"+animal.getAge());
			animal.makeSound();
			
			if(animal instanceof Cat) {
				Cat cat =(Cat)animal;
				System.out.println("毛色"+cat.getColor());
			}
			
		}
	}

}
