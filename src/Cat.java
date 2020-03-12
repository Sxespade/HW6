public class Cat extends Animal {

    private final int DISTANCERUN = 200;
    private final double HEIGHTJUMP = 2;


    @Override
    public void run(int lengthObstacleRun) {
        boolean a = lengthObstacleRun < DISTANCERUN & lengthObstacleRun > 0;
        System.out.println("run " + a);
    }

    @Override
    public void swim(int lengthObstacleSwim) {
        System.out.println("Коты не умеют плавать");
    }

    @Override
    public void jump(double heightObstacle) {
        boolean a = heightObstacle < HEIGHTJUMP & heightObstacle > 0;
        System.out.println("jump " + a);
    }
}