package Tasks;

public class Task3 {
    public static void main(String[] args) {
        String name= "chicago";
        boolean name1=name.equals("Chicago");
        System.out.println(name1);

        System.out.println(name.equals("CHICAGO"));

        String name2="CHICAGO";
        System.out.println(name2.toLowerCase().equals(name));

        System.out.println(name.toUpperCase().equals(name2));

        System.out.println(name.equalsIgnoreCase(name2));
        String name3="Chicago$";
        System.out.println(name2.equalsIgnoreCase(name3));//false



    }
}
