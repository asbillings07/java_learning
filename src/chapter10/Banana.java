package chapter10;

public class Banana extends Fruit {
    public Banana(int calories) {
        super(calories);
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana Juice is made");
    }

    public void peel() {
        System.out.println("The Banana is peeled");
    }
}
