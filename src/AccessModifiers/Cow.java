package AccessModifiers;

public class Cow {
    public String namePublic;
    protected String colorProtected;
    private int agePrivate;
    double weightDefault;

    public void eatPublic(){
        System.out.println("eating in public ");
    }

    protected void eatProtected(){
        System.out.println("eating in Protected ");

    }

    private void eatPrivate(){
        System.out.println("eating in eatPrivate ");
    }

    void eatDefault(){
        System.out.println("eat default");
    }

}
