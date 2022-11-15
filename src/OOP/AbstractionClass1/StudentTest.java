package OOP.AbstractionClass1;

public class StudentTest {
    public static void main(String[] args) {

        CampusStudent campusStudent=new CampusStudent("Peri", 138);
        OnlineStudents onlineStudents=new OnlineStudents("ABD", 139);
        Student student=new CampusStudent("Nur", 170);
        campusStudent.tableTennis();



        JrAlex jrAlex=new JrAlex("JrAlex", 151);
        Alex jr2=new JrAlex("2", 132);
        CampusStudent jr3=new JrAlex("3",152);
        Student jr4=new JrAlex("4",154);


        jrAlex.play();
        jr2.play();

        jrAlex.eat();
        jr3.eat();

        jr4.eat();
        jr2.speak();

    }
}
