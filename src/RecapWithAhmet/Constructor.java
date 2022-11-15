package RecapWithAhmet;

public class Constructor {
    /*
    *1-What is constructor and what do you do with it?
    ->It is a way to initialize the instance variables.
    -> I assign the values into the object variables
    *
    **2-Can you tell me the difference between constructor and method?
    Constructor:                             Method:
    -Doesn't have return type (public Employee)   -Must have return type(public,double, method)
    -It must have same name of class               -May or may not have same name of class
    Ex:public Employee ()-->Employee class          Ex: public double Employee or public double tax()


    3-Can you make the constructor static,final, private?
     No, you cannot make the constructor final and static
    * Show off: As you know(we MUST TO METION) in Automation we have a specific class which is called Singleton Pattern Design.
     At this moment, I make my constructor private to protect and hide from other classes.

     4-What is the different between this, this(), super()?
     this -> is a keyword which refers to instance variables/methods
     this()-> refers to the constructor from SAME CLASS
     super-> is a keyword which refers to parent's instance variables/methods
     super()-->refers to the constructor from parent class.
     *
     * NOTE:
     Ths most efficient usage is creating constructor with parameters(overloading) and initialized instead of doing it with this();



     */
    String name="Ahmet";//directly inializing
    int age;
    int salary;

    public Constructor(String name, int age){
       // name=name if we won't use
        this(1000);
        this.name=name;
        this.age=age;
    }

    public Constructor(int salary){
       this.salary=salary;
    }

    public static void main(String[] args) {
        Constructor constructor=new Constructor("Ahmwt", 30);
        System.out.println(constructor.name);
        System.out.println(constructor.salary);
        System.out.println(constructor.age);



    }
}
