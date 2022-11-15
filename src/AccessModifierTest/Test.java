package AccessModifierTest;

import AccessModifiers.Animal;

public class Test {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.eatPublic();
        animal.namePublic="Public";

    }
}
