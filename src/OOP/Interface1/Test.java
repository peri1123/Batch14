package OOP.Interface1;

public class Test {
    public static void main(String[] args) {
       // CanFly canFly=new CanFly();

        Bird bird1=new Bird();
        bird1.fly("  south");
        bird1.sing(9);
        System.out.println(bird1.TAIL);
       // bird1.TAIL=5;; you can not reassign a new value to interface bc they are final

        Fish fish1=new Fish();
        fish1.swim();
        fish1.eatWeed();

        CanFly c1=new Bird();
        c1.fly("North");

        CanSwim sw1=new Fish();
        sw1.swim();

        Duck duck=new Duck();
        duck.fly("down to the water");
        duck.swim();

        duck.lookFood();

        duck.printInfo();
        bird1.printInfo();
        c1.printInfo();



    }
}
