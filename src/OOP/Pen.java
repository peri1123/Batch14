package OOP;

public class Pen {
    String Fname,Lname="Smith";
    int age;

    public void addname(String usergivenName){
        Fname=usergivenName;
    }

    boolean isValidPhone;
    public boolean isValidPhone(int firstDigit, int hypens, int secondDigits){
        for (int i=0; i<firstDigit; i++){
            for (int h=0; h<hypens; h++){
                for(int j=0; j< secondDigits; j++ ){
                    if (i>=7 && i<=9 && h+2=='-' && h+6=='-' && j>=9 ){
                      isValidPhone=true;
                    }else {
                        isValidPhone=false;
                    }
                }
            }
        }


      return isValidPhone;
    }


    public static void main(String[] args) {
        Pen p= new Pen();
        p.Lname="Brown";
        p.Fname="Will";
        p.age=12;
        p.addname("Peri");
        System.out.println(p.Fname);


    }

}

