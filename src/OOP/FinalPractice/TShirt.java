package OOP.FinalPractice;

final public class TShirt extends Shirt{
    //FINAL METHODS CAN"T be overriden

    final String color="Blue";

    final public void dye(){
        System.out.println("Choose your own color");
    }

    public void print (){
        //super.PRICE you can not change final variable

    }

}
