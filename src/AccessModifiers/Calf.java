package AccessModifiers;

public class Calf extends Cow{
    public static void main(String[] args) {
        Cow cow1=new Cow();
        cow1.eatDefault();
        cow1.eatProtected();
        cow1.eatPublic();


        Calf calf=new Calf();
        calf.eatDefault();


    }
}
