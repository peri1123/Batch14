package Inheritance;



public class Zoo {
    public static void main(String[] args) {
        Animal a1=new Animal();
        System.out.println(a1.name);

        WildAnimal w1=new WildAnimal();
        System.out.println("WildAnimal>"+ w1.name);

        Lion l1=new Lion();
        System.out.println("Lion >" + l1.name);

        a1.name="Fluffy";// this will assign only to a1 which is parent class
        System.out.println("a1>"+a1.name);
        System.out.println("w1"+w1.name);
        System.out.println("l1"+l1.name);


        Cat cat=new Cat();
        System.out.println( cat.mealType);
        DomesticAnimal d1=new DomesticAnimal();
        cat.name="Tom";
        cat.sleep();

        Cat cat2=new Cat();
        cat2.sleep();

        d1.play();
        cat2.play();

        a1.energyAmount(5);
        d1.energyAmount(5);
        cat2.energyAmount(5);


        cat2.test1();








    }
}
