package chapter9;

public class Cake {
    protected String flavor;
    protected double price;

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printFlavor() {
        System.out.println("The flavor of this cake is " + flavor);
    }

    public void printPrice() {
        System.out.println("The price of this cake is " + price);
    }
}
