package OOP.inheritance;

public class Domestic extends Animal {

    void play() {
        System.out.println("Domestic animal is playing");
    }

    public Integer energyAmount(int foodAmount) {
        System.out.println(name + "energy is" + (foodAmount * 200));
    return foodAmount*200;
    }
    public Domestic test1(){
        System.out.println("This is Test1 method");
        return new Domestic();
    }
}
