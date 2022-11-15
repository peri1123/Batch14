package AccessModifiers;

public class Test1Animal {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.colorProtected="red";
        animal.namePublic="public";
        animal.weight=3.5;


        ImmutablePractice cc=new ImmutablePractice();
        cc.getCardHolderName();

    }
}
