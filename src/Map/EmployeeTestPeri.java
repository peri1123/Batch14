package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class EmployeeTestPeri {
    public static void main(String[] args) {

        EmplyeePeri e1 = new EmplyeePeri("Peri", "SF", 19);
        EmplyeePeri e2 = new EmplyeePeri("Ana", "LA", 25);
        EmplyeePeri e3 = new EmplyeePeri("Aibek", "NY", 22);
        EmplyeePeri e4 = new EmplyeePeri("Sultan", "Chicago", 39);

        Map<Integer, EmplyeePeri> map = new TreeMap<>();
        map.put(e1.id, e1);
        System.out.println(map.put(e1.id, e1));


    }
}


