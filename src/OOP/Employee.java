package OOP;

public class Employee {
    String name;
    String city = "Chicago";
    int id;

    //constructor with no parameter/argument and this is overloading
    public Employee() {
        System.out.println("No argument constructor");
    }

    //constructor
    public Employee(String newCity) {// we do not need to put parameter all the tile in the constructor

        this.city = newCity;//this as a keyword, it refers to the current class


        System.out.println("This is constructor to initialize city");
    }

    //method to set value for city
    public void setCity(String city1) {
        city = city1;
        this.name = "Efe";


    }

    //multiple parameter constructor
    public Employee(String name, String city, int id) {
        this.name = name;//
        this.city = city;
        this.id = id;
        System.out.println("Three arguments Constructor");

    }

    @Override
    public String toString() {
        return "Name is: " + name + "city" + city + "id:" + id;
    }
}
    /*Write a public method named isValidPhone in Main.java that takes a string parameter
as a phone number that is separated by hyphens.
Check if the phone number is valid or not.
 If it is a valid phone number, return true.
 If it is not a valid phone number,  return false.
Note : The return type of a method will be boolean.

Mobile Number validation criterias:
The number shouldn't have a space or spaces.
The hyphens place is shown on the following line.
***-***-**** (3 digits-3 digits-4 digits)
The first digit should be between 7 and 9(Including 7 and 9).
The rest 9 digits can be any number between 0 and 9.(Including 0 and 9).

Example:
773-773-2374 -> return true   -> because the format of the number is correct.
224-224-2224 -> return false  -> because first character is not between 7 to 9
773-7777-711 -> return false  -> because one of hyphens are not in the right place


Preview of ReadMe.txtWrite a public method named isValidPhone in Main.java that takes a string parameter
as a phone number that is separated by hyphens.
Check if the phone number is valid or not.
 If it is a valid phone number, return true.
 If it is not a valid phone number,  return false.
Note : The return type of a method will be boolean.

Mobile Number validation criterias:
The number shouldn't have a space or spaces.
The hyphens place is shown on the following line.
***-***-**** (3 digits-3 digits-4 digits)
The first digit should be between 7 and 9(Including 7 and 9).
The rest 9 digits can be any number between 0 and 9.(Including 0 and 9).

Example:
773-773-2374 -> return true   -> because the format of the number is correct.
224-224-2224 -> return false  -> because first character is not between 7 to 9
773-7777-711 -> return false  -> because one of hyphens are not in the right place

     */




