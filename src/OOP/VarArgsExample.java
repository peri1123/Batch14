package OOP;

public class VarArgsExample {
    /*
    return sum of the numbers from array
    create a method to solve it
     */

    public int sumFinder(int[] array){
        int sum=0;
       for (int i=0; i< array.length; i++){
           sum += array[i];
       }
        return sum;
    }

    public int totalFinder(int ...array){//... it will allow to add multi value//we can add different type of Data
        // like String a, int ... array
        int sum=0;
        for (int i=0; i< array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    //print out given names as in following format
    // 1.Name is... Alex...
    // 2. Name is ..Dima..

    public void printNames(String... studentNames){
        for (int i=0;i< studentNames.length; i++){
            System.out.println(i+1+ ". Name is "+ studentNames[i]);
        }
    }


    public static void main(String[] args) {
        VarArgsExample object=new VarArgsExample();
        int [] ns ={1,2,3,4,5,6};
        int r1=object.sumFinder(ns);
        System.out.println(r1);

        int [] nsi={1,2};
        int r2=object.sumFinder(nsi);
        System.out.println(r2);

        object.totalFinder(2,3,4);
        object.totalFinder(5,6);
        System.out.println(object.totalFinder());

        object.printNames("Alex","Dima", "Ahmet" );
    }
}
