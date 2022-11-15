package OOP.inheritance1;

public class Lily extends  Flower{
    //String color;
    public Lily(double price, String color, String size, String type) {
        super(88, "color", "size", "type");
        this.color=color;
        this.price=price;
        this.size=size;
        this.type=type;
    }

    public Lily(){
        super(9, "Pink","small", "lily" );
    }

}
