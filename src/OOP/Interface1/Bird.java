package OOP.Interface1;

public class Bird implements CanFly{
   public void fly(String destination){
        System.out.println("Bird is flying"+ destination);
    }

    public int sing(int words){
        System.out.println("Bird is singing");
       return words;
    }

    public void printInfo(){
        System.out.println("Print info in the Bird");
    }


}
