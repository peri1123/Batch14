package Inheritance;

public class Cat extends DomesticAnimal {

String mealType;
String name;
    public void sleep(){
        System.out.println( name +" is sleeping ");
    }

   public void play (){
        System.out.println("Can is playing with yarn ball");
    }

    public Integer energyAmount(int foodAmount){
        System.out.println(name+ "> energy is " + foodAmount*10);
        return foodAmount*10;
    }
    public Cat test1(){
        System.out.println("This is coming from cat test");
        return new Cat();
    }
}

