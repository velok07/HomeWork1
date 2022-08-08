package HW8;

public class Main {
    public static void main(String[] args) {
        Robot optimus = new Robot("Optimus", 1000, 100);
        Human steve = new Human("Steve", 500, 25);
        Cat barsik = new Cat("Barsik", 100, 30);
        Human james = new Human("James", 450,30);

        Wall wall = new Wall(30);
        Treadmill treadmill = new Treadmill(450);

        Competitors[] competitors = {steve,barsik, optimus, james};
        Obstacles[] obstacles = {wall, treadmill};


        for (int i = 0; i < obstacles.length ; i++) {
            for (int j = 0; j < competitors.length; j++) {
                obstacles[i].tryObstacle(competitors[j]);
            }
        }



//        optimus.jump(wall);
//        optimus.run(treadmill);
//
//        barsik.jump(wall);
//        barsik.run(treadmill);
//
//        steve.jump(wall);
//        steve.run(treadmill);
    }

}
