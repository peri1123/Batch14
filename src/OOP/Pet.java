package OOP;

public class Pet {
    String name;
    String color;
    int age;
    static int food=20;//static method belongs to entire class

    public String toString(){//toString method will return all instance variables does not depend on DT
        return"\nname: "+ name+"\ncolor: "+ color+ "\nage:" +age;
    }
    public void sleep(){
        System.out.println("Pet is sleeping ...");
    }
    public void eat(){
        run();// static run method can be called in non-static eat method without object
        sleep();// not static "sleep" method can be called in not-static 'eat method " object

        food-=1;
        System.out.println(name+ " is eating... left over food is: " + food);
    }

    public static void run(){// we can put static b4 access modifier
        System.out.println("Pet is running ..");
    }
    public static void main (String [] args){
        run();
        //eat(); --> you can't call not static method in the static method without object
        Pet pet1=new Pet();
        pet1.eat();// we can do it with object

    }



}
