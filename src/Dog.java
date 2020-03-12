public class Dog extends Animal {

    private final int DISTANCERUN = 500;
    private final double HEIGHTJUMP = 0.5d;
    private final int DISTANCESWIM = 10;


    @Override
    public void run(int lengthObstacleRun) {
        boolean a = lengthObstacleRun < DISTANCERUN & lengthObstacleRun > 0;
        System.out.println("run " + a);
    }

    @Override
    public void swim(int lengthObstacleSwim) {
        boolean a = lengthObstacleSwim < DISTANCESWIM & lengthObstacleSwim > 0;
        System.out.println("swim  " + a);
    }

    @Override
    public void jump(double heightObstacle) {
        boolean a = heightObstacle < HEIGHTJUMP & heightObstacle > 0;
        System.out.println("jump " + a);
    }
}
