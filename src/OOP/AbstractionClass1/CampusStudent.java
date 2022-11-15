package OOP.AbstractionClass1;

public class CampusStudent extends Student {
    public CampusStudent (String name, int id){
super(name, id);
    }
    public void study(){
        System.out.println("Campus student is studying in class");
    }

    @Override
    public void eat() {
        System.out.println("Campus student is in the kitchen");
    }

    //public abstract void run(){}; you can not have abstract method in a non-abstract class

    public void tableTennis(){
        System.out.println("Playing ping pong");
    }



}
