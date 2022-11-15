package OOP;

public class PetTest {
    public static void main(String[] args) {

        Pet lion = new Pet();

        lion.name= "Simba";
        System.out.println(lion.name);

        Pet tiger=new Pet();
        tiger.name="Shah";
        System.out.println(tiger.name);//Shah
        lion.name="Umar";
        System.out.println(lion.name);//Umar
        System.out.println(tiger.name);//Shah

        Pet snake= new Pet();
        System.out.println(snake.name);//null

        System.out.println("Lion");
        System.out.println(lion.food);
        System.out.println("Tiger");
        System.out.println(tiger.food);
        System.out.println("Snake");
        System.out.println(snake.food);

        lion.eat();
        System.out.println("Food calling for tiger  "+tiger.food);
        System.out.println("Food calling for lion  "+lion.food);
        tiger.eat();
        tiger.eat();
        tiger.eat();
        System.out.println("Food calling for tiger which is checking food amount  "+ lion.food);

        //calling static run method by using object
        lion.run();

        //calling static run method by using class name (Pet)
        Pet.run();
        System.out.println("&&&&&&&&&&&&&&&&&&");
        System.out.println(lion);//not hashcode anymore it is>>> name: Umarcolor: nullage:0
        System.out.println(tiger);
        System.out.println("((((((((");
        String str1=tiger.toString();
        System.out.println("!!!!!!" + str1);
        //String str1=tiger; we can not put method into str
    }
}
