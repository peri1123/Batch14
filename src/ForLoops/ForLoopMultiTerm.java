package ForLoops;

public class ForLoopMultiTerm {
    public static void main(String[] args) {
        int m=5, k=10;
        for (m=0,k=20; m<10&& k>5 ; m++, k--){
            System.out.println("m is >>" +m);
            System.out.println("k is >>" +k);
        }
        System.out.println("=============");
        for(int x=5, y=x+1, z=10; x<=z; y++, z--){//we can reassign it inside od the loop
            System.out.println("y is:" +y);
        }
        //for (int a=1, char ch='l' ;;)//we can create the same variable at the same line as long as the same primitive DT

        for(String str="test"; str.equals("test"); str=str.toUpperCase() ){
            System.out.println("String example");
        }
        /*

         */




    }
}
