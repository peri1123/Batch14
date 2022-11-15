package OOP.inheritance;

public class Zoo {
    public static void main(String[] args) {
        Animal animal1=new Animal();
        System.out.println(animal1.name);

        WildAnimal wild1=new WildAnimal();
        System.out.println(wild1.name);

        Lion lion1=new Lion();
        System.out.println(lion1.name);

        animal1.name="Fluffy";
        System.out.println(animal1.name);
        System.out.println(wild1.name);
        System.out.println(lion1.name);


        System.out.println(animal1.color);
        System.out.println(wild1.color);
        System.out.println(lion1.color);

        Cat cat1=new Cat();
        System.out.println(cat1.mealType);

        Domestic domestic1=new Domestic();
        domestic1.eat();


        animal1.eat();
        wild1.eat();
        lion1.eat();
        cat1.eat();

        cat1.sleeping();
        cat1.name="Tom";
        cat1.sleeping();

        Cat cat2=new Cat();
        cat2.sleeping();

        System.out.println("--------");
        domestic1.play();
        cat2.play();

        animal1.energyAmount(5);//Number Object
        domestic1.energyAmount(5);//Integer
        cat2.energyAmount(5);//Integer

        //animal1.play(); play method  is created in the Domestic class for the  first time


        Cat c3=cat1.test1();
        Domestic d2=cat1.test1();




    }
}
