package Loops;

public class NestedForLoopHoursMinutesSeconds {
    public static void main(String[] args) {
        /*for (int i=0; i<3; i++){
            for (int k=0; k<5; k++){
                System.out.println("Hi");
            }
        }

         */
        /*
        you want to create java code that will show time in hours and minutes
        clock
        1:0
        1:1
        1:2
        1:3
        ...
        ..
        1:59
        2:00
        ....
        hour, minutes and second


        for (int h=1; h<=24; h++){
            for(int min=0;min<60;min++){
                for (int sec=0; sec<60; min++){
                    System.out.println(h+min+sec);
                }

            }
        }

         */

        /*System.out.println("Count Down Clock");
        for (int hour=23; hour>=0; hour--){

              for (int min=59; min>=0; min--){
                  if (hour==5) break;
                  for (int sec=59; sec>=0; sec--){
                      System.out.println("New code"+ hour+":"+min+":"+sec);
                  }
              }
          }

         */

        System.out.println("Normal Clock");
        HOUR:
        for (int hour=0; hour<24; hour++){
            if (hour>10 && hour<20)continue;
            MIN:
            for (int min=0; min<60; min++){
                if (min>10 && min<20)continue;
                //if (hour==5) break HOUR;
                for (int sec=0; sec<60; sec++){
                    System.out.println("New code"+ hour+":"+min+":"+sec);
                }
            }
        }



    }
}
