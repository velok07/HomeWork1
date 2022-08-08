package HW8;

public class Wall implements Obstacles {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    public void tryObstacle(Competitors competitors) {
        competitors.jump(Wall.this);
    }
}
