package Tasks;

import java.lang.reflect.Array;

public class Duplicates {
    /*Create a public method named duplicates that takes
    two int arrays as parameters and returns common elements of both arrays as an int array.
    IF there is no common element of arrays, return null.
    NOTE: USE SORT METHOD ON ARRAY BEFORE YOU RETURN IT.
    For example:
    array 1 -> [1,2,3,45,6,6,7,9,8] and array 2 [2,3,9,10,11,12]

            return int array is [2,3,9] -> !!array is sorted

    example 2: array 1 -> [1,1,1,1,1,1,1,1] array 2 -> [1,1,2]

            return int array is [1]

    example 3 : array 1 -> [0,1,1,1,0]  array 2 -> [2,9,90]

            return null   -> because there is no common element for arrays.

            NOTE: This question might be harder than it seems, and it can take time .
    Please make sure you covered all the  posibilities and your return type name etc. are all correct.
    If you cover all possibilities with your method, tests shall pass.
    GOOD LUCK !

     */
//    public int[] removeDuplicates(int[] nums) {
//        //TODO
//        String b = "";
//        for (int i = 0; i < nums.length; i++) {
//            String str = nums[i] + "";
//            if (!b.contains(str)) {
//                b += nums[i] + " ";
//            }
//        }
//        String[] str2 = b.split(" ");
//        int[] result = new int[str2.length];
//        for (int j = 0; j < result.length; j++) {
//            result[j] = Integer.parseInt(str2[j]);
//        }
//        return result;


    // int array[] = {1, 2, 3, 45, 6, 6, 7, 9, 8};

//  public  static int[] duplicates(){
//       int array[] = {1, 2, 3, 45, 6, 6, 7, 9, 8};
//      String backet="";
//      for (int i=0; i< array.length; i++){
//          String str1=array[i]+" ";
//          if (!backet.contains(str1)){
//              backet=backet+array[i];
//          }else {
//              System.out.println("null");
//          }
//      }
//      String[] str2=backet.split(backet);
//      int result []= new int [str2.length];
//      for (int i = 0; i < array.length; i++) {
//          result[i]=Integer.parseInt(str2[i]);
//
//      }
//      return result;
//  }
//
//    public static void main(String[] args) {
//
//        System.out.println(Duplicates.duplicates());
//
//    }
//
//}

    public static void main(String[] args) {


        int[] a = {8,8, 9, 9, 10 };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                 if (a[i] == a[j] && i != j) {
                    a[j] = 0;
                }
            }
        }

        int counter=0;
        for (int k=0; k<a.length; k++){
            if(a[k] !=0){
                counter++;
            }
        }

        int [] a1 = new int[counter];
        int index=0;
        for(int l=0; l<a.length; l++ ){
            if(a [l] !=0){
                a1[index]=a[l];
                index++;
            }
        }

        for(int i:a1){
            System.out.println(i);
        }

    }
}




