package OOP;

public class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloadingPractice object=new MethodOverloadingPractice();
        object.sum(3,2);

        object.sum(7,8,1);
        object.sum("add", 4,5);
        object.sum("subtract", 5,2);
        object.sum("xyz", 5,6);




    }
}
