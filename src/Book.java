import java.util.Objects;

public class Book {
    private String nameBook;
    private Author author;
    private int publishingYear;

    public Book(String nameBook,Author author,int publishingYear) {
        this(nameBook, publishingYear);
        this.author=author;
    }
    public Book(String nameBook,int publishingYear){
        this.nameBook = nameBook;
        this.publishingYear = publishingYear;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        if (publishingYear < 1950 || publishingYear > 2050) {
            System.out.println("Неверный год издания: " + publishingYear);
            return;
        }
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Книга: " +
                "Название " +'\"' + nameBook + '\"' +
                ", " + author +
                ", год издания " + publishingYear ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return publishingYear == book.publishingYear && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, publishingYear);
    }
}


