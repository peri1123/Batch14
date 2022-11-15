package Switch;

public class SwitchNumberReception {
    public static void main(String[] args) {
        int number = 4;//will be invalid entry

        switch (number) {
            default:// can go anywhere between cases
                System.out.println("invalid entry");
            case 2:
                System.out.println("This is admin");
                break;// that's the stop
            case 1:
                System.out.println("This is HR");
                break;
            case 3:
                System.out.println("this is reception");
                break;
            case 6:
                System.out.println("This is IT");
                break;

        }
    }
}
