package OOP.Interface1;

public interface CanFly {
    int WINGS=2;
    int TAIL=1;

    void fly(String destination);

//    void abc(){  you can
//
//    }

    default void printInfo(){
        System.out.println("Number of wings"+WINGS+ "\nnumber of tails:"+TAIL);

    }





}
