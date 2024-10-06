package Animal;

public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat Meows");
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.sound();

    }

}
