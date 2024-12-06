package Animal;

public class Cat extends Animal {
    private  String catColor;

    public Cat(String name, int age, String catColor) {
        super(name, age);
        this.catColor = catColor;
    }

    public String getColor() {
        return catColor;
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + "がにゃーと鳴いた");
    }
}
