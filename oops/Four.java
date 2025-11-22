class Book {
    int pageNum;

    void setPage(int number){
        pageNum = number;
    }

    void display(){
        if(pageNum > 0){
            System.out.println("Book has "+ pageNum + " page");
        }else{
            System.out.println("Kindly Enter greater than 0 value.");
        }
    }
}
public class Four{
    public static void main(String[] args){
        Book b = new Book();

        b.setPage(500);
        b.display();
    }
}
