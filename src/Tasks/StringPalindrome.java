package Tasks;

public class StringPalindrome {
    public static void main(String[] args) {
        int i=121;
        if(i<0){
            System.out.println(false);
        }int num=i;
        int reverse=0;
        while(num>0){
            reverse=reverse*10+num%10;
            num/=10;

        }
        System.out.println("Reversed" +reverse);

    }}
