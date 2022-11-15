package InterviewQuestions;

import java.util.*;

public class RemoveAllDuplicatesFromArrayList9 {
    public static void main(String[] args) {

        List<String> list= Arrays.asList("John", "Owl", "John","Red");
//        HashSet set=new HashSet<>(list);
//        System.out.println(set);


        ArrayList<String> unique=new ArrayList<>();
        for (int i=0; i<list.size(); i++){
            for (int j = i+1; j <list.size() ; j++) {
                if (!list.contains(list.get(i))){
                    unique.add(list.get(i));
                }

            }
        }
        System.out.println(unique);
    }
}
