package OOP.staticPractice;

public class Book {
    String title;
    String author;
     static int page=500;//static keyword makes variable become to that class

    public Book(int page) {
        this.page = page;
    }
    public  Book(){

    }

    public int getPage(){
        return  page;
    }

    public void setPage(int page){
        this.page=page;
    }

    public  void read(){
        System.out.println("you are reading");
    }

    public static void write(){
        System.out.println("You are writing");
    }
}
