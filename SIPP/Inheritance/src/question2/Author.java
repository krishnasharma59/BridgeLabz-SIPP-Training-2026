package question2;

public class Author extends Book{
    String name;
    String bio;
    public Author(String title, int publishYear,String name, String bio){
        super(title, publishYear);
        this.name = name;
        this.bio = bio;
    }
    @Override
    void display() {
        super.display();
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}
