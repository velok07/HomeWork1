package HW8;

public class Treadmill implements Obstacles {
    int lenght;

    public Treadmill(int lenght) {
        this.lenght = lenght;
    }


    public void tryObstacle(Competitors competitors) {
        competitors.run(Treadmill.this);

    }
}
