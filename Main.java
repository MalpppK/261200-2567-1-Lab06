public class Main {
    public static void main(String[] args) {

        Duck mk= new Duck();

        Owl butterOwl = new Owl();

        Cow Chokchai = new Cow();

        Pig mukrata = new Pig();

        PekingDuck menu = new PekingDuck();

        mk.sound();
        butterOwl.sound();
        Chokchai.sound();
        mukrata.sound();

        ((Flyable)mk).fly();
        butterOwl.fly();

        mk.clean(butterOwl);
        menu.clean(butterOwl);

        menu.beCrispy();

        mk.pet();
        
    }

}