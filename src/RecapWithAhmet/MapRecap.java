package RecapWithAhmet;

import java.util.Map;
import java.util.TreeMap;

public class MapRecap {
    /*
    1. Can you tell me about map and wht=y do you use map in your project?
* Map is an awesome interface to be used in my project to share/store my data as KEY AND VALUE
2. What is the connection between Map and Collection?
They are all useful that I use in my project for different purposes.
As I mentioned before set is all about uniqueness
                            list is all about duplication if you need it
                            map is all about key-value pair.
Show off NOTE: Map is the combination of collections.
               As you know key part of the map must be unique which refers to "SET"
                            value part of the map might be duplicated which refers to "LIST"

    ->Notes:Map is the combination of the Set and List
    As you know key part of the map
    Value part of the map might be duplicated which refers to List

    3-What is the type of MAp and difference between them?
    ->We have HashMap->random order
    ->LinkedHashMap-.insertion order
    ->TreeMap->Ascending order

    4-Wha is synchronization? can you give examples and what do you know about synchronization usage in java?
    -->it executes any actions one by one (FCFS)(one after another)
    -->as you know We have two most common concept in java->HashTable-->StringBuffer
    ***-->Synchronized system is ***THREAD SAFE*** and ***SLOW***
    -->Non synchronized system is NOT THREAD SAFE and faster
    -->The example of non-synchronized->MAP,StringBuilder

    String[]fruits={"Apples","banana", "peach", "apple", "orange", "strawberry","Cherry","Orange"};
    TASK:I want you get the output of total item for each:
    -->

    -->In this question you are asking me to get the elements from map and also provide how many of them I have in a key and value format right?
    -->First of all, I would use a map bc I see you want the answer as key and value
    -->To be able to access each of the element, I will use loops to iterate them
    --> Then I am going to use if statement for the specific condition
    --> I believe it will solve the task in here


     */

    public static void main(String[] args) {
        String[]fruits={"apple","banana", "peach", "apple", "orange", "strawberry","cherry","orange"};
        Map <String, Integer> mapCounter=new TreeMap<>();
        for (String str:fruits) {
            if(!mapCounter.containsKey(str)){
                mapCounter.put(str,1);
            } else {
                mapCounter.put(str,mapCounter.get(str)+1);
            }
        }System.out.println(mapCounter);


    }
}
