package HW7;

public class Main {
    public static void main(String[] args) {


        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Bonya", false, 15);
        cats[1] = new Cat("Barsik", false, 25);
        cats[2] = new Cat("Murzik", false, 20);
        Plate plate = new Plate(100);

        while (plate.food > 0){
            for (int i = 0; i < cats.length; i++) {
                System.out.println(cats[i].name + " идет есть");
                cats[i].eating(plate);
    //            plate.plateInfo();
            }
        }

        for (int i = 0; i < cats.length ; i++) {
            System.out.println(cats[i].name + " наелся: ");
            cats[i].satietyStatus();

        }



    }
}
