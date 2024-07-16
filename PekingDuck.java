public class PekingDuck extends Duck {
    public void beCrispy() {
        System.out.println("Grob Grab");
    }

    @Override
    void clean(Animal cleanee) {
        System.out.println("i cant clean, i alrady die. Sorry.");
    }

}
