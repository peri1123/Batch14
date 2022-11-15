package OOP.Interface1;

public class Duck extends Migrators implements CanFly, CanSwim{
    public void fly(String destination){
        System.out.println("Duck is flying "+destination);
    }


    public void swim() {
        System.out.println("Duck is swimming");
    }

    public void sleep(){
        System.out.println("Owl is sleeping");
    }



}

