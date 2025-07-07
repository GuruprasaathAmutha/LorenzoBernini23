package selvan.ponniyin.dto;


import jakarta.persistence.*;

@Entity
public class Books {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "book_seq")
    @SequenceGenerator(name = "book_seq",sequenceName = "book_sequence",allocationSize = 1)
    private int BookId;
    private String BookName;
    private String Author;



    public Books(String BookName,String Author){
        this.BookName=BookName;
        this.Author=Author;
    }

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}
