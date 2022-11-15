package OOP;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.age = 21;
        student1.lName ="Brown";
        student1.fName="Jack";

        student1.assignFName("Mattew");
        System.out.println(student1.fName);

        //System.out.println(student1.setAge(4);); not going to work since it is void
        student1.setAge(19);
        System.out.println(student1.age);

        student1.age=21;
        System.out.println(student1.age);

        student1.lNameFinder();
        System.out.println(student1.lNameFinder());//Brown

        String lastNameoFStudent1=student1.lNameFinder();
        System.out.println(student1.lNameFinder());//Brown
        System.out.println(lastNameoFStudent1.equals("Brown"));//true

       String str1=student1.lNameFinder("Chicago").replace('c','*');
        System.out.println(str1);

        student1.sleep();
        student1.sleep(9);

        student1.study();
        student1.study(5);

        student1.hourCreator();
        System.out.println(student1.hourCreator());


    }

}
