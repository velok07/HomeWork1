package HW6;

public class Animal {
    String name;
    static int runDistance;
    int swimDistance;
    private static int animalCount;



    public Animal(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;

        animalCount++;
    }

    public Animal(String name, int runDistance) {
        this.name = name;
        this.runDistance = runDistance;

        animalCount++;
    }


    public static int getAnimalCount() {
        return animalCount;
    }

    void run(int runDistance){
    }

    void swim(int swimDistance){
    }
}
