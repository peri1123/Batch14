package OOP.inheritance;

public class Cat extends Domestic{
String mealType;
    String name;
//Task: override sleep method in the cat class and make sure it prints name of the cat

    public void sleeping(){

        System.out.println(name+ " is Sleeping");
    }
    public void play(){
        System.out.println(name+ "Cat is playing with a yarn ball");
    }

    public Integer energyAmount(int foodAmount) {
        System.out.println(name + "Energy is" + (foodAmount * 10));
        return foodAmount*10;
    }


    public Cat  test1() {
        System.out.println("Test1 method in the CAT Class");
        return  new Cat();
    }
}
