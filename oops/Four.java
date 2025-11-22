class Book {
    int pageNum;

    void setPage(int number){
        pageNum = number;
    }

    void display(){
        System.out.println("Book has "+ pageNum + " page");
    }
}
public class Four{
    public static void main(String[] args){
        Book b = new Book();

        b.setPage(500);
        b.display();
    }
}
