package ArrayList;

import java.util.ArrayList;

public class FlowerTest {
    public static void main(String[] args) {
        TaskFlower object1=new TaskFlower("red", "Rose", "small",3.99);
        TaskFlower object2=new TaskFlower("Yellow", "Violet", "large",4.99);
        TaskFlower object3=new TaskFlower("White", "Daisy", "Large",.99);
        TaskFlower object4=new TaskFlower("Red", "Lily", "small",2.99);

        ArrayList<TaskFlower> list=new ArrayList<>();

        list.add(object1);
        list.add(object2);
        list.add(object3);
        list.add(object4);

        TaskFlower.findCheapestFlower(list);







    }
}
