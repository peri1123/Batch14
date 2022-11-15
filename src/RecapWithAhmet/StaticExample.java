package RecapWithAhmet;

public class StaticExample {
    public static void main(String[] args) {
        StaticAndInstanceBlock s=new StaticAndInstanceBlock();
//        s.run();
//        StaticAndInstanceBlock.run();
//
//        System.out.println(s.name);//

        StaticAndInstanceBlock s1=new StaticAndInstanceBlock();
        StaticAndInstanceBlock s2=new StaticAndInstanceBlock();
        StaticAndInstanceBlock s3=new StaticAndInstanceBlock();
        StaticAndInstanceBlock s4=new StaticAndInstanceBlock();


        System.out.println(s1.n1);

    }
}
