package Map;

import java.util.HashMap;
import java.util.Set;

public class Practice2 {
    public static void main(String[] args) {
        HashMap <Integer,String> studentInfo= new HashMap<>();
        studentInfo.put(501,"Adilet");
        studentInfo.put(583, "Alex;");
        studentInfo.put(609,"Mary");
        studentInfo.put(895,"Aizat");
        studentInfo.put(111,"Asel");

        System.out.println( studentInfo);//{609=Mary, 501=Adilet, 583=Alex;, 895=Aizat, 111=Asel}
        System.out.println(studentInfo.get(609));//Mary

        //remove() we can remove with key  and the value
        studentInfo.remove(111);
        System.out.println(studentInfo);//{609=Mary, 501=Adilet, 583=Alex;, 895=Aizat}

        studentInfo.remove(609,"very");
        System.out.println(studentInfo);//{609=Mary, 501=Adilet, 583=Alex;, 895=Aizat} still there since does not match

        studentInfo.remove(609, "Mary");
        System.out.println(studentInfo);//{501=Adilet, 583=Alex;, 895=Aizat}



        //KeySet()--> it will return all the keys as a set from the map
        Set keys=studentInfo.keySet();//returning set
        System.out.println(studentInfo.keySet());//[501, 583, 895]

        System.out.println(keys);//[501, 583, 895]

        printingValues(studentInfo);
        printingValues1(studentInfo);



    }

    //create a method that will take a HashMap as a parameter, it will print  all values one by one, by using keyset()  method call

    public static void printingValues (HashMap<Integer, String> mapList){//

        Set<Integer>  keys= mapList.keySet();//
        int i=1;
      for (Integer key:keys){
          //first value is ... Adilet
          //2. values is ... Alex

          System.out.println(i + ". value is :" +  mapList.get(key));
          i++;

          }
      }
    public static void printingValues1(HashMap<Integer, String> mapList){//

        Set keys= mapList.keySet();//take a note Peri
        int i=1;
        for (Object key:keys){
            //first value is ... Adilet
            //2. values is ... Alex

            System.out.println(i + ". value is :" +  mapList.get(key));
            i++;

        }


    }

    }







