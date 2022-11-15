package OOP;

public class Animal {
    // instance variables
    String name="King";
    int age;
    String color;
    String gender;


    String []toys={"ball", "bone", "string"};
    int energy =100;

    public void sleep(){
        energy=100;
        System.out.println("After sleeping energy is full "+energy);
        System.out.println(name + " is sleeping");
    }

    //create one speak method and print out "animal is speaking"
    //call this method with a bird object
    public void speaking(){
        energy=energy-10;
        System.out.println(name + " is speak");
        System.out.println("After speaking energy is now :"+ energy);

   }

   public  Animal test(){
       System.out.println("This is a new method");
       return new Animal();
   }

    }



