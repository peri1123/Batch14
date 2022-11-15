package OOP.AbstractionClass1;

public abstract class SelfLearner extends Student{
    public SelfLearner(String name, int id) {
        super(name, id);
    }

    @Override
    public void study() {
        System.out.println("Self learner study");
    }

    public abstract void watch();
}
