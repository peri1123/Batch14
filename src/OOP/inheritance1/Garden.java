package OOP.inheritance1;

public class Garden {
    public static void main(String[] args) {
        Flower flower1 = new Flower(.99, "Orange", "Large", "FLOWER");
        System.out.println(flower1);

        Rose rose1=new Rose();
        System.out.println(rose1.color);

       rose1.color="Red";
        System.out.println(rose1.color);
        System.out.println(flower1.color);


        Lily  lily=new Lily();

        Lily lily2=new Lily(2,"purple", "Extra large", "Lily");

        System.out.println(lily.color);//Pink
        System.out.println(lily2.color);//Purple


        System.out.println(flower1.color);//won't effect to parent whatever we do in child class

        Flower f2=new Flower(0, "black", "abc", "Flower");
        System.out.println(f2.color);

    }
}
