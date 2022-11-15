package Tasks;

public class RemoveDuplicatesLeetCode {
    public static int RemoveDuplicates(int num[]){
        int index=1;
        for (int i=0; i<num.length-1; i++){
            if(num[i]!=num[i+1]){
                num[index++]=num[i+1];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int num[]={1,1,2,2,3,3,4,4,5};
        System.out.println(RemoveDuplicates(num));
    }
}
