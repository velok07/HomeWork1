package HW7;

public class Plate {
    int food;

    public Plate(int food) {
        this.food = food;
    }

    public void catEating(int catAppetite){
            if (catAppetite <= food){
                food -= catAppetite;
                System.out.println("Котик покушал");
                System.out.println("Осталось еды: " + food);
            } else {
                System.out.println("Котику мало еды");

            }

        }


    public void plateInfo(){
        System.out.println(food);
    }

    public void addFood(int newFood){
        food+= newFood;
    }
}
