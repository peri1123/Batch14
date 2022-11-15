package OOP;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1=new Employee("LA");//
        System.out.println(e1.city);//it was Chicago but it is LA
        e1.city="New York";
        System.out.println(e1.city);
        e1.setCity("Boston");
        System.out.println(e1.city);

        Employee e2= new Employee("Miami");
        System.out.println(e2.city);

        Employee e3=new Employee();//No argument constructor

        System.out.println("+++++++++");
        Employee e4=new Employee("John", "Denver", 1);//Three arguments Constructor

        System.out.println(e4.city);//hashcode
        System.out.println(e4);//Name is: JohncityDenverid:1



    }
}
