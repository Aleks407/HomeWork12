public class Book {
    private String nameBook;
    private Author author;
    private int publishingYear;

    public Book(String nameBook, Author author, int publishingYear) {
        this.nameBook = nameBook;
        this.author = author;
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
}
