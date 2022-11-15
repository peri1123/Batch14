package Tasks;

public class InstanceVsStatic {

    int data=20;
    static int num=100;


   public InstanceVsStatic(){
       data=29;

   }

    public static void main(String[] args) {
        System.out.println(num);
        System.out.println(num+100);
    }
}
