package Loops;

public class NestedIFLoopMonthYears {
    public static void main(String[] args) {
        /*
        print out months for the years from 2020 to 2023
        2020--> 1,2,3,4,5,6...12
        2021-->1,2,3,..........12

        2020--->1 Jan--->2 Feb--->3--->4--->5--->6--->7--->8--->9--->10--->11--->12
2021--->1 Jan--->2 Jan--->3--->4--->5--->6--->7--->8--->9--->10--->11--->12
2022--->1--->2--->3--->4--->5--->6--->7--->8--->9--->10--->11--->12
2023--->1--->2--->3--->4--->5--->6--->7--->8--->9--->10--->11--->12

        int years=3;
        int months=12;
        int i=0;
        for(int y=2020; y<=2023;y++){
            System.out.print(y);
            for (int m=1; m<=12;m++){
                switch (m){
                    case 1:
                        System.out.println("-->"+m+"Jan");break;
                    case 2:
                        System.out.println("---"+m+"Feb");
                }
                System.out.print( "--->" +m);
            }
            System.out.println();

        }

         */
        for (int y=2020; y<=2023; y++){
            System.out.println(y);

            for (int m=1; m<=12; m++){
                switch (m){
                    case 1:System.out.print("-->"+m + "Jan");
                    case 2:System.out.print("-->"+m + "Feb");
                    case 3:System.out.print("-->"+m + "March");
                    case 4:System.out.print("-->"+m + "April");
                    case 5:System.out.print("-->"+m + "May");
                    case 6:System.out.print("-->"+m + "June");
                    case 7:System.out.print(">>>"+m + "July");
                    case 8:System.out.print(">>>"+m + "August");
                    case 9:System.out.print(">>>"+m + "September");
                    case 10:System.out.print(">>>"+m + "October");
                    case 11:System.out.print(">>>"+m + "November");
                    case 12:System.out.print(">>>"+m + "December");


                }

            }System.out.println();
        }



    }
}
