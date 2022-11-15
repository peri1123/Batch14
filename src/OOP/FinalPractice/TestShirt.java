package OOP.FinalPractice;

public class TestShirt {
    public static void main(String[] args) {
        Shirt shirt=new Shirt();
        //shirt.PRICE=9.99; you can not change final variable
        TShirt tshirt=new TShirt();
       //  tshirt.PRICE=7.99; you can not change the value of final variable


        System.out.println(tshirt.PRICE);

        shirt.wash();
        tshirt.wash();
        shirt.wash();

        System.out.println(shirt.color);//null bc it comes from default variable
        System.out.println(tshirt.color);//blue

        shirt.color="green";
        //tshirt.color="red"; comes from final variable and it is not


    }
}
