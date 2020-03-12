public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run(100);
        dog.run(600);
        dog.jump(1);
        dog.jump(0.2);

        Cat cat = new Cat();
        Cat2 cat2 = new Cat2();
        cat2.run(400);
        cat2.jump(1);

        Dog2 dog2 = new Dog2();
        Dog2 dog3 = new Dog2();
        dog2.jump(0.5);
        dog3.jump(0.5);

        dog2.swim(100);
        dog3.swim(100);

    }

}
