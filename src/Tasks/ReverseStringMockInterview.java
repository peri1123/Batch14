package Tasks;

public class ReverseStringMockInterview {
    public static void main(String[] args) {
        String str = "Peri is too lazy and sweet";
        String b1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            b1 = b1 + str.charAt(i);
            System.out.println(b1);


        }
    }

    public static String green(String[] s) {
        int left = 0;
        int right = s.length - 1;
        String temp = "";
        while (left < right) {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;

        }
        return green(s);
    }
}
