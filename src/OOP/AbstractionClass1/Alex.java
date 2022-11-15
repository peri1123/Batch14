package OOP.AbstractionClass1;

public abstract class Alex extends CampusStudent{
    public Alex(String name, int id) {
        super(name, id);
    }
    abstract public void play();

    public void speak(){
        System.out.println("Abstract alex is speaking");
    }
}
