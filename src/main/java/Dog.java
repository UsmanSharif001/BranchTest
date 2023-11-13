public class Dog extends Animal {

    private String name;

    public void makeSound(){
        System.out.println("VovVov");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

}
