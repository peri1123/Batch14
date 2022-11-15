package RecapWithAhmet;

public class IfStatement {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1-Many technical interview questions are related withe Conditions

    AND               OR
    T&T-->T          T||T--T
    T&F-->F          T||F--T
    F-F-->F          F||F-->F



     */
    public static void main(String[] args) {
        int rabbitPopulation=20;
        int catPigElePhantPop=19;
        int birdpopulation=3;

        boolean comparison=rabbitPopulation<birdpopulation;

        if(rabbitPopulation<catPigElePhantPop||rabbitPopulation>birdpopulation){
            System.out.println("We have rabbits");
        }else {
            System.out.println("We have more Birds");
        }

        if (comparison){
            System.out.println("Hello");
        }

    }


}
