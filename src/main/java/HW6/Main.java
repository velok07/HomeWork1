package HW6;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bobiggg", 250, 5);
        Dog dog2 = new Dog("Tuzzzik", 501, 11);
        Cat cat1 = new Cat("Barsiggg", 115);
        Cat cat2 = new Cat("Murzikk", 215);

        cat1.run(160);
        cat2.swim(10);
        dog1.run(260);
        dog2.swim(11);
        cat2.run(160);

        System.out.println(Animal.getAnimalCount());
    }



}
