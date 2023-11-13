public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.makeSound();
        dog.makeSound();
        cat.eat("laks");
        dog.eat("lak");

        dog.showMood(false);
        dog.showMood(true);
        cat.showMood(true);
        cat.showMood(false);


    }
}
