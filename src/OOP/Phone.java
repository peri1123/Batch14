package OOP;

public class Phone {
    String brand;
    String IMEINumber;
    public Phone (String brand){
       // this();
        this.brand=brand;
    }
    public Phone() {
        this ("X", "Y");
        System.out.println("No Argument");
    }
    public Phone (String brand,String IMEINumber){
        this.brand=brand;
        this.IMEINumber=IMEINumber;
        System.out.println("Two Parameter");

    }


    @Override
    public String toString() {
        return "Phone brand"+brand;
    }





    public static void main(String[] args) {
        //Phone object=new Phone("Iphone 14");
        //Phone phone2=new Phone("Samsung");
       // System.out.println(object);

       // Phone phone4=new Phone("Nexus", "123jdsgk");
        //System.out.println(phone4);//Phone brandNexus
       // System.out.println(phone4.IMEINumber);//123jdsgk

        Phone phone5=new Phone();





    }

}
