package OOP;

import PracticeNotes.ScannerDay9;

import java.util.Arrays;
import java.util.Scanner;

public class AnimalTest {
    public static void main(String[] args) {

        //creating animal object
        Animal cat = new Animal();
        //cat is helper which means will represent everything from Animal Object
        Animal owl=new Animal();

        System.out.println(cat);// OOP.Animal@17f6480 just show where it is belonging to
        System.out.println(cat.name);
        System.out.println(cat.age);
        System.out.println(cat.color);// since
        cat.age=3;
        System.out.println(cat.age);
        cat.color="black";
        System.out.println(cat.color);

        //create one object and name it as a dog
        // initialize all instance variables for the new object
        // print all of those instance variables for the new object

        Animal dog= new Animal();
        System.out.println(dog);
        System.out.println(dog.name);//becomes King since we assigned on the temple
        System.out.println(dog.color);//null
        System.out.println(dog.age);//0


        dog.age=1;
        dog.color="white";
        dog.name="Hachi";
        System.out.println(dog.name);
        System.out.println(dog.age);
        System.out.println(dog.color);

        System.out.println(dog.gender="male");//it is assinging and printing
        System.out.println(dog.gender);//male
        System.out.println(cat.gender);//null since we did not assigned in template

        System.out.println(cat.toys[0]);//ball
        cat.toys[0]="yarn ball";
        System.out.println(cat.toys[0]);//yarn ball

//print all available toys for dog all together
        System.out.println(Arrays.toString(dog.toys));

        cat.sleep();

        dog.sleep();

String str="Test";
        System.out.println(str.length());//4

        Animal bird=new Animal();

        System.out.println("This is energy of bird :"+ bird.energy);
        bird.name="Tweeter";
        bird.speaking();
        System.out.println("After speaking bird="+bird.energy);

        System.out.println(cat.energy);
        cat.speaking();
        cat.speaking();
        cat.speaking();
        cat.sleep();
        System.out.println(cat.energy);

    }
}
