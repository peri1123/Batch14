package AccessModifierTest;

import AccessModifiers.Animal;

public class Bird {
    public static void main(String[] args) {
        Animal animal= new Animal();
        animal.eatPublic();
        animal.namePublic="Public Bird";

       Bird bird =new Bird();


    }
}
