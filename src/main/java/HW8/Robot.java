package HW8;

public class Robot implements Runnable, Jumpable, Competitors {
    String name;
    int canRun;
    int canJump;
    boolean previousObstacleDone;

    public Robot(String name, int canRun, int canJump) {
        this.name = name;
        this.canRun = canRun;
        this.canJump = canJump;
    }

    public void jump(Wall wall) {
        if (canJump >= wall.height) {
            System.out.println(name + " прыгнул на высоту: " + wall.height);
            previousObstacleDone = true;
        } else {
            System.out.println(name + " не может прыгнуть на такую высоту");

        }

    }

    public void run(Treadmill treadmill) {
        if (previousObstacleDone == true) {
            if (canRun >= treadmill.lenght) {
                System.out.println(name + " пробежал расстояние: " + treadmill.lenght);
            } else {
                System.out.println(name + " не может пробежать такое расстояние");
            }
        } else {
            System.out.println(name + " Не прошел предыдущее препятствие");
        }
    }


}
