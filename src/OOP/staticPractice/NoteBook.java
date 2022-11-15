package OOP.staticPractice;

public class NoteBook extends Book {

    public void read(){
        System.out.println("Notebook is reading");
    }
    public static void write(){
        System.out.println("Notebook is writing");//jus because of static word it will be the different method
    }


    public static void main(String[] args) {
        NoteBook nb = new NoteBook();
        System.out.println(nb.page);

        System.out.println("Should be coming from book object>>" + nb.page);
        nb.page = 300;
        System.out.println("nb"+nb.page);

        Book book1 = new Book();
        System.out.println("book1>"+book1.page);

        System.out.println(nb.page);

        Book book2=new Book(999);
        System.out.println("book2>"+book2.page);
        System.out.println("nb >"+nb.page);
        System.out.println("book1"+book1.page);


        book1.setPage(100);
        System.out.println(book1.page);

        System.out.println(book2.page);
        System.out.println(nb.page);

        nb.read();
        book1.read();

        nb.write();
        book1.write();





















//        //book1.page=400;
//        System.out.println(book1.page);
//
//        Book book2 = new Book(999);
//
//        System.out.println(book2.page);
//
//        System.out.println(nb.getPage());//999
//        System.out.println(book1.getPage());//999
//        System.out.println(book2.getPage());//999
//
//        book1.setPage(200);
//        System.out.println(book1.page);//200
//
//        System.out.println(book2.getPage());
//
//        book1.read();
//        nb.read();
//
//        nb.write();
//
//        NoteBook.write();
//
//
//
//    }
//
    }
}