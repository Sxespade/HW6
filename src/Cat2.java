import java.text.DecimalFormat;
import java.util.Random;
public class Cat2 extends Animal {

    @Override
    public void run(int lengthObstacleRun) {
        Random random  = new Random();
        int distanceRun = random.nextInt(6)*100 + 100;
        boolean a = lengthObstacleRun < distanceRun & lengthObstacleRun > 0;
        System.out.println("run " + a);
        System.out.println("Ограничение по бегу: " + distanceRun);
    }

    @Override
    public void swim(int lengthObstacleSwim) {
        System.out.println("Коты не умеют плавать");
    }

    @Override
    public void jump(double heightObstacle) {
        Random random  = new Random();
        double distanceRun = random.nextDouble()*2 + 0.5;
        DecimalFormat f = new DecimalFormat("#.##");
        boolean a = heightObstacle < distanceRun & heightObstacle > 0;
        System.out.println("jump " + a);
        System.out.println("Ограничение по прыжкам: " + f.format(distanceRun));
    }
}