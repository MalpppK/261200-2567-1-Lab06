public class Duck extends Animal implements Flyable, Pettable {

    void clean(Animal cleanee) {
        System.out.println(this + " is cleaning " + cleanee);
    }

    public void pet() {
        System.out.println(this + " is worth for petting");
    }
    @Override
    public void sound() {
        System.out.println("Gaab Quack");
    }
    @Override
    public void fly() {
        System.out.println("i believe i can fly");
    }
    @Override
    public void glide() {
        System.out.println("i can also ron");
    }
    @Override
    public void land() {
        System.out.println("i can land");
    }
}