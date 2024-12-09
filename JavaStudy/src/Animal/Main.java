package Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();

        animals.add(new Cat("タマ", 11, "白色"));
        animals.add(new Dog("ポチ", 5, "茶色"));

        for (Animal animal : animals) {
            System.out.println("名前" + animal.getName());
            System.out.println("年齢" + animal.getAge());
            animal.makeSound();
            animal.eated();

            if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                System.out.println("毛色" + cat.getColor());
            } else if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                System.out.println("毛色は" + dog.getColor());
            } else {
                System.out.println("未設定");
            }
        }
    }
}
