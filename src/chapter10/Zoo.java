package chapter10;

public class Zoo {
    public static void main(String[] args) {
        doggy();
    }

    public static void doggy() {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal sasha = new Dog();
        sasha.makeSound();

        sasha = new Cat();
        sasha.makeSound();
        ((Cat) sasha).scratch();
        feed(sasha);

    }

    public static void feed(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("Here's your dog food");
        }

        if (animal instanceof Cat) {
            System.out.println("Here's your cat food");
        }
    }


}
