package InterviewQuestions;

public class ReverseStringWithSplit {
    public static void main(String[] args) {
        String str="Techorial Java";
        String []array=str.split(" ");
        for (String arrays:array) {
            String result="";
            for (int i = arrays.length()-1; i>=0; i--) {
                result+=arrays.charAt(i);
            }
            //System.out.print(result+ " ");
        }

        for (int i=0; i<array.length; i++){
            String bucket="";
            for(int j=array[i].length()-1; j>=0; j--){
                bucket+=array[i].charAt(j);
            }
            System.out.println(bucket);
        }



    }
}
