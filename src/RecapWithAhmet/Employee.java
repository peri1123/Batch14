package RecapWithAhmet;

public class Employee {
    //intance variable belong to the class
    String name;
    double salary;//default value is 0.5
    int hours;
    int hireYear;

    public Employee(String name, double salary, int hours, int hireYear) {
        //These are the initialization of the instance variable
        this.name = name;
        this.salary = salary;
        this.hours = hours;
        this.hireYear = hireYear;
    }
    public Employee(){

    }

    public double tax() {
        if (salary <= 1000) {
            return 0.0;
        }
        return salary * 0.03;
    }

    public double bonus() {
        //local variable belongs to the block
        double extraHours=hours-40;
        if(extraHours>0){
            return extraHours*30;
        }

        return 0.0;
    }

    public double increaseSalary() {
        int year = 2015 - hireYear;
        if (year < 10) {
            return salary * 0.05;
        } else if (year > 9 && year < 20) {
            return salary * 0.1;
        } else if (year > 19) {
            return salary * 0.15;
        }
        return 0.0;
    }
    public void information(){
        //to be able to use the value from methods you should return it
        System.out.println("Name :"+ name);
        System.out.println("Salary: "+salary);
        System.out.println("WorkHours: " + hours);
        System.out.println("WorkHours" +hireYear);
        System.out.println("Tax: " +"$" +tax());
        System.out.println("Bonus: "+ "$" + bonus());
        System.out.println("Increased salary :" + "$" + increaseSalary());
        System.out.println("Salary with TAX and BONUS "+ "$" + (salary+bonus()-tax()));
        System.out.println("Toatal salary with increase salary: "+ "$" +(salary+increaseSalary()));

    }


}
