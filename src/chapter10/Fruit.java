package chapter10;

public class Fruit {
    protected int calories;

    public Fruit(int calories) {
        setCalories(calories);
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void makeJuice() {
        System.out.println("Juice is made");
    }
}
