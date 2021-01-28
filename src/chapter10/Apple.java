package chapter10;

public class Apple extends Fruit {


    public Apple(int calories) {
        super(calories);
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple Juice is made");
    }

    public void removeSeeds() {
        System.out.println("Apple seeds are removed");
    }
}
