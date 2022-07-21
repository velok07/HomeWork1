package HW6;

public class Dog extends Animal {
    public Dog(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
    }

    @Override
    void run(int runDistance) {
        if (runDistance <= 500 && runDistance <= Dog.super.runDistance){
            System.out.println(name + " пробежал дистанцию " + runDistance);
        } else {
            System.out.println(name + " не бегает на такую дистанцию");
        }
    }

    @Override
    void swim(int swimDistance) {
        if (swimDistance <= 10 && swimDistance <= Dog.super.swimDistance){
            System.out.println(name + " проплыл дистанцию " + swimDistance);
        } else {
            System.out.println(name + " не плавает на такую дистанцию");
        }
    }
}
