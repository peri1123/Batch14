package OOP;

public class NetFlix {

    /* !* create NetFlix-Class:
                `create following instance fields in the NetFlix-Class
            -familyAccountName, userName, monthlyData
        `create a method that will update monthlyData for every usage
        `make sure this method takes parameter for data usage
        `run your code in a Test-Class

        */
    String familyAccountName, userName;
    static int monthlyData;

    public void usage(int usage){
        monthlyData=monthlyData-usage;
        System.out.println("Remaining data is  "+ monthlyData + " after " + userName+ " used the account ");


    }


}
