package HW7;

public class Cat {
    String name;
    Boolean satiety = false;
    int appetite;

    public Cat(String name, Boolean satiety, int appetite) {
        this.name = name;
        this.satiety = satiety;
        this.appetite = appetite;
    }

    public void eating(Plate plate){
        plate.catEating(appetite);
        satiety = true;

    }

    public String getName() {
        return name;
    }

    public void satietyStatus(){
        System.out.println(satiety);
    }
}
