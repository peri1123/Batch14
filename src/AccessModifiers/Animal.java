package AccessModifiers;

public class Animal {
    public String namePublic;
    protected String colorProtected;
    private int agePrivate;
    double weight;

    public void eatPublic(){
        System.out.println("eating in public");

    }
    protected void eatProtected(){
        System.out.println("eating protected");
    }

    private void eatPrivate(){
        System.out.println("eating in private");
    }

    void eatDefault(){
        System.out.println("eating by default");
    }



}
