package RecapWithAhmet;

public class Arrays {
    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-What is the difference between Array and arrayList?

    -Array is a storage for primitives and objects
    -Array is fixed size
    -Array has MULTIMENSIONAL form
    -Array has a length function-->NO methods
    -Array can not be manipulated(you can not play with it)
    -Array
    ==> write an implementation that initialize int array and find the the
    1-Sum of the even number
    2-sum of the odd number
    3-difference between them (tips:the answer shouldn't be minus)
    ex:{1,2,3,8,12,76,5,22,17}


    -->Write an implementation that initialize int array and find the:
    1-The smallest number
    2-The biggest number

    {100,300, 200, 450, 350}
    sout(The smallest number is 100 and the largest number  is 450);
    NOTE: you can not use sort method



     */
    public static void main(String[] args) {
//        int [] numbers=new int[5];//-Array is fixed size, we need to assign the size directly
//        int [] number2={1,2,3,4,4};
//        String [] str1={"Ahmet","Mehmet","Merve","Mahmut"};

        int [] array={1,2,3,8,12,65,76,5,22,17};
        int  evenNum=0;
        int oddNum=0;
        for(int arrays:array){//whenever you need to iterate all the values then use it
            if(arrays%2==0){
                evenNum+=arrays;
            }else {
                oddNum+=arrays;
            }
        }
        System.out.println(evenNum);
        System.out.println(oddNum);

        int differnce=(evenNum-oddNum)>=0 ? evenNum-oddNum:oddNum-evenNum;
        System.out.println(differnce);

        int []numbers={100,300, 200, 450, 350};

        int smallest = numbers[0];
        int largetst = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largetst)
                largetst = numbers[i];
            else if (numbers[i] < smallest)
                smallest = numbers[i];
        }

        System.out.println("Largest Number is : " + largetst);
        System.out.println("Smallest Number is : " + smallest);



        int nums[]={100,300, 200, 450, 350};
        int small=200;
        int largest=0;
        for(int num:nums){
            if(num<small){
               small=num;
            } else if (num>largest) {
                largest=num;
            }
        }
        System.out.println("the samllest number is "+ small+ "and the largest "+largest);





    }
       }


