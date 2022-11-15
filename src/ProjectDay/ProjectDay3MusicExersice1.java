package ProjectDay;

import java.util.Scanner;

public class ProjectDay3MusicExersice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose the song: \n1Classical \n2Pop and \n3Country");
        int song = scanner.nextInt();
        switch (song) {
            case 1:
                System.out.println("This is Classical: What would you like to listen? \nFour Seasons \nFur Elise \nFinlandia \nVocalise \nThe Planets");

                String classical = scanner.nextLine().toLowerCase();
                classical = scanner.nextLine();
                switch (classical) {
                    case "Four Seasons":
                        System.out.println("You choose Four Seasons. To listen this song you need to insert 2$");
                        Scanner money=new Scanner(System.in);
                        int dollar=money.nextInt();
                        if(dollar==2){
                            System.out.println("Happy to listen your Four Season");
                        }else if(dollar<2){
                            System.out.println("Sorry can't play this song");
                }else if (dollar>2){
                            System.out.println("Here we go your change"+ (dollar-2)+"$");
                        }
                        break;
                    case "Fur Elise":
                        System.out.println("You choose Fur Elise. To listen this song you need to insert 2$");
                        Scanner moneyFUR=new Scanner(System.in);
                        int dollarFUR=moneyFUR.nextInt();
                        if(dollarFUR==2 || dollarFUR>=4){
                            System.out.println("Happy to listen your Fur Elise songs");
                        }else{
                            System.out.println("Sorry can't play Fur Elise");
                        }
                        break;
                    case "Finlandia":
                        System.out.println("You choose Finlandia. To listen this song you need to insert 2$");
                        Scanner moneyCounty=new Scanner(System.in);
                        int dollarCount=moneyCounty.nextInt();
                        if(dollarCount==2 || dollarCount>=4){
                            System.out.println("Happy to listen your Finlandia");
                        }else{
                            System.out.println("Sorry can't play Finlandia");
                        }
                        break;
                    case "Vocalise":
                        System.out.println("You choose Vocalise. To listen this song you need to insert 2$");
                        Scanner moneyVocal=new Scanner(System.in);
                        int dollarVocal=moneyVocal.nextInt();
                        if(dollarVocal==2 || dollarVocal>=4){
                            System.out.println("Happy to listen your Vocalise");
                        }else{
                            System.out.println("Sorry can't play Vocalise");
                        }
                        break;
                    case "The Planets":
                        System.out.println("You choose The Planets. To listen this song you need to insert 2$");
                        Scanner moneyPlanet=new Scanner(System.in);
                        int dollarPlanet=moneyPlanet.nextInt();
                        if(dollarPlanet==2 || dollarPlanet>=4){
                            System.out.println("Happy to listen your The Planets");
                        }else{
                            System.out.println("Sorry can't play The Planets");
                        }
                        break;





                }



                }



        }

    }

