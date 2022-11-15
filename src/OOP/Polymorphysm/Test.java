package OOP.Polymorphysm;

public class Test {
    public static void main(String[] args) {
       Atm atm = new Atm();
       atm.deposit(100);
       atm.printInfo();
       atm.withdraw(100);

       Branch branch= new Branch();
       branch.loan();
       branch.openAccount();

       Bank bank=new Bank();
       bank.loan();
       bank.openBranch();

       //===================
        Atm atm1=new Branch();//Atm is the parent
        ((Branch)atm1).loan();//we are casting

        Atm atm2=new Bank();
        ((Bank)atm2).openBranch();







    }
}
