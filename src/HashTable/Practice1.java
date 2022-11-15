package HashTable;

import java.util.Hashtable;

public class Practice1 {
    public static void main(String[] args) {
        Hashtable<String,Integer> table=new Hashtable();
        table.put("IT department", 505);
        table.put("HR", 609);
        table.put("Help", 101);
        System.out.println(table.get("HR"));

        //table.put(null,999);//cannot have null key, it will give an error at the run time
        System.out.println(table);

        //table.put("Accounting", null);//can't have null key
        System.out.println(table);

        System.out.println(table.entrySet());

        System.out.println("===========Blocks===========");
        /*
        {}- instance block>> it will work for each object, when object is created
        static {} static variable- belong to the  class, it will work 1st thing for that class and only time


        instance variable--> will work with the individual
        static variable-->
         */


    }
}
