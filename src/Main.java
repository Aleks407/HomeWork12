public class Main {


    public static void main(String[] args) {


        Author author = new Author("Лев", "Толстой");
        Author author1 = new Author("Иван", "Тургенев");
        Book book = new Book("Война и мир", "Л.Н.Толстой", 1869);
        Book book1 = new Book("Муму", "И.С. Тургенев", 1854);


        System.out.println("Имя автора - " + author.getName() + " " + author.getSurname());
        System.out.println("Название - " + book.getNameBook());
        System.out.println("Год издания - " + book.getPublishingYear());
        book.setPublishingYear(1900);
        System.out.println("Год издания - " + book.getPublishingYear());
        System.out.println();

        System.out.println("Имя автора - " + author1.getName() + " " + author1.getSurname());
        System.out.println("Название - " + book1.getNameBook());
        System.out.println("Год издания - " + book1.getPublishingYear());
        System.out.println();
    }

}