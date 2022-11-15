package OOP.Encapsulation;

public class TestCity {
    public static void main(String[] args) {
        City city=new City();
        city.getPopulation();
        System.out.println(city.getPopulation());

        city.setPopulation(70854);
        System.out.println(city.getPopulation());

        city.getArea();
        System.out.println( city.getArea());
        city.setArea(25.8);
        System.out.println(city.getArea());

    }
}
