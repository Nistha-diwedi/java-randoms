class book{
    String name;
    String ISBN;
    String author_name;
    String publisher;
    book(String name, String ISBN, String author_name, String publisher){
        this.name = name;
        this.ISBN = ISBN;
        this.author_name = author_name;
        this.publisher = publisher;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public String getauthor_name() {
        return author_name;
    }
    public void setauthor_name(String author_name) {
        this.author_name = author_name;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void Bookinfo(){
        System.out.println("book name = "+name+"\nbook ISBN = "+ISBN+"\nauthor name = "+author_name+"publiser"+publisher);
    }
}
public class BookTest {
    public static void main(String[] args) {
        book[] books = new book[30];
        for (int i = 0; i < books.length; i++) {
            books[i] = new book("Book" + (i + 1), "ISBN" + (i + 1), "Author" + (i + 1), "Publisher" + (i + 1));
        }
        for (int i = 0; i < 30; i++) {
            books[i].Bookinfo();
            System.out.println("-----------------------------");
        }
    }
}
