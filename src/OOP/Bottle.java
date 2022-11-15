package OOP;

public class Bottle {
    double size;
    boolean isClean;
    double LiquidAmountInBottle;

    public Bottle(boolean isClean) {
        this.isClean = isClean;
    }

    public Bottle(double size) {
        this.size = size;
    }

    //create one usage method which takes
    public void usage(double amount){
        LiquidAmountInBottle-=amount;
    }

    public static void main(String[] args) {

    }

    @Override
    protected void finalize()  {
        System.out.println("This is Gc calling");
    }
}
