package OOP;

import java.util.Random;

public class Student {
    String fName,lName="Smith";
    int age;

    //create a method to assign a value to the fName
    public void assignFName(String userGivenName){
        fName=userGivenName;

    }
    //setter method is just setting value to  the instance variable
    public void setAge(int userGivenAge){
        age =userGivenAge;
    }
    // create a method that will return the lName
    public String lNameFinder(){
        return lName;
    }


    //overload example for lNameFinder
    //pass city name of the Student to the method and return
    // "Mr/s ... you live in ... city .."
    // test your method in the 'StudentTest' class

    public String lNameFinder(String city){

        return "Mr/s " +fName+ " you live in" + city;
    }
    //getter methods are just returning value of the instance variable
    public int getAge(){
        return  age;
    }

    public void sleep (){
        System.out.println(fName+ "is sleeping 6 hours");
    }
    public void sleep (int hours){
        System.out.println(fName+ "is sleeping " +hours);
    }

    public void study (){
        System.out.println(fName+ "is studying 3 hours");
    }
    public void study (int hours){
        System.out.println(fName+ "is studying " +hours);
    }



    //create a method that will give me a random hour/number
    //I will take that random hour from that method
    // and I will use it as Hours in my other methods
    public int hourCreator(){
        Random random=new Random();
     int hour=random.nextInt(12);
     return hour;
    }













}
