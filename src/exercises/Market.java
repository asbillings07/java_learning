package exercises;

import chapter10.Apple;
import chapter10.Banana;
import chapter10.Fruit;

public class Market {
    public static void main(String[] args) {
        Fruit apple = new Apple(87);
        Fruit banana = new Banana(100);
        juiceFruit(apple);
        juiceFruit(banana);



    }

    public static void juiceFruit(Fruit fruit) {
        if (fruit instanceof Apple) {
            ((Apple) fruit).removeSeeds();
            fruit.makeJuice();
        }

        if (fruit instanceof Banana) {
            ((Banana) fruit).peel();
            fruit.makeJuice();
        }
    }
}
