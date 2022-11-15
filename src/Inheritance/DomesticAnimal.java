package Inheritance;

public class DomesticAnimal extends Animal{

   void play (){
      System.out.println("Domestic animal is playing");
  }

    public Integer energyAmount(int foodAmount){
        System.out.println(name+ "> energy is " + foodAmount*200);
        return foodAmount*200;
    }


    public DomesticAnimal test1(){
        System.out.println("This is coming from domestic animal");
        return new DomesticAnimal();
    }
}

