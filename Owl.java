public class Owl extends Animal implements Pettable{

    public void pet() {
        System.out.println(this + " is worth for petting");
    }
    @Override
    void sound() {
        System.out.println("Hook Hoot");
    }
    void fly() {
        System.out.println("i believe i can fly");
    }
    void glide() {
        System.out.println("i can also ron");
    }
}
