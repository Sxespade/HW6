import java.text.DecimalFormat;
import java.util.Random;
public class Dog2 extends Animal {

    @Override
    public void run(int lengthObstacleRun) {
        Random random  = new Random();
        int distanceRun = random.nextInt(7)*100 + 100;
        boolean a = lengthObstacleRun < distanceRun & lengthObstacleRun > 0;
        System.out.println("run " + a);
        System.out.println("Ограничение по бегу: " + distanceRun);
    }

    @Override
    public void swim(int lengthObstacleSwim) {
        Random random  = new Random();
        int distanceSwim = random.nextInt(4)*100 + 100;
        boolean a = lengthObstacleSwim < distanceSwim & lengthObstacleSwim > 0;
        System.out.println("swim  " + a);
        System.out.println("Ограничение по плаванью: " + distanceSwim);
    }

    @Override
    public void jump(double heightObstacle) {
        Random random  = new Random();
        double distanceRun = random.nextDouble();
        DecimalFormat f = new DecimalFormat("#.##");
        boolean a = heightObstacle < distanceRun & heightObstacle > 0;
        System.out.println("jump " + a);
        System.out.println("Ограничение по прыжкам: " + f.format(distanceRun));
    }
}
