package exercises;

import chapter9.BirthdayCake;
import chapter9.WeddingCake;

public class TasteTester {

    public static void main(String[] args) {
        printFlavorPrice();
    }

    public static void printFlavorPrice() {
        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setFlavor("BlueBerry");
        birthdayCake.setPrice(10.99);
        birthdayCake.printFlavor();
        birthdayCake.printPrice();

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavor("Chocolate Coconut");
        weddingCake.setPrice(109.99);
        weddingCake.setTiers(4);
        weddingCake.printFlavor();
        weddingCake.printPrice();

    }
}
