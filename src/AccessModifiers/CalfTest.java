package AccessModifiers;

public class CalfTest {
    public static void main(String[] args) {
        Cow cow= new Cow();
        cow.eatPublic();
        cow.eatProtected();
        cow.eatDefault();
        cow.eatDefault();
        cow.eatDefault();

    }


}
