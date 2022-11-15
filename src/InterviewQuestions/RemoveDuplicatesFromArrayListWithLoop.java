package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatesFromArrayListWithLoop {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,3);
        ArrayList<Integer> newList=new ArrayList<>();
//        for(int i=0; i<list.size(); i++){
//            if(!newList.contains(list.get(i))){
//                newList.add(list.get(i));
//            }
//        }
        System.out.println(newList);

        HashSet set=new HashSet<>();
        for (Object a:list) {
            set.add(a);

            //System.out.println(a);
        }
        System.out.println(set);


    }
}
