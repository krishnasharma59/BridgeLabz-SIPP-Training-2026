package question2;

public class Book {
    String title;
    int publishYear;
    Book(String title, int publishYear){
        this.title = title;
        this.publishYear = publishYear;
    }
    void display(){
        System.out.println("Book Title: "+title);
        System.out.println("Published Year: " + publishYear);
    }
}
