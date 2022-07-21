package HW6;

public class Cat extends Animal {

    public Cat(String name, int runDistance) {
        super(name, runDistance);

    }

    @Override
    void run(int runDistance) {
        if (runDistance <= 200 && runDistance <= Cat.super.runDistance){
            System.out.println(name + " пробежал дистанцию " + runDistance);
        } else {
            System.out.println(name + " не бегает на такую дистанцию");
        }
    }

    @Override
    void swim(int swimDistance) {
        System.out.println(name + " не умеет плавать, это же кот");
    }
}
