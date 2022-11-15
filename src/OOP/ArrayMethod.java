package OOP;

public class ArrayMethod {
   /* int array[]={1,2,2,4,4,5,66,77};

    public void Array(){
        String str="";
        for (int i=0; i<array.length; i++){
            boolean b1=false;
            for (int j=0; j< array.length; j++){
                if (array[i]==array[j]){
                    b1=true;
                }
            }
            if (!b1){
                str+=array[i];
            }else {
                System.out.println("it does not have duplicates");
            }
        }

    }

    */

    boolean b1=false;


    public boolean isValidPhone(String number) {

        if (number.charAt(0) >= 7 && number.charAt(0) <= 9 && number == "" && number.length()== 12 && number.charAt(3) == '-'
                && number.charAt(7) == '-'&& (number.charAt(1)>='0' && number.charAt(11)<='9')){

            b1 = true;
        }
        return b1;
    }

    public static void main(String[] args) {
        ArrayMethod ob=new ArrayMethod();
        ob.isValidPhone("773-999-9231");
        System.out.println(ob.isValidPhone("773-999-9231"));
    }

}

