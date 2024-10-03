public class Main {


    public static void main(String[] args) {


        Book book = new Book("Война и мир", new Author("Лев","Толстой"), 1869);
        Book book1 = new Book("Муму",new Author("Иван","Тургенев"),
                1854);


        System.out.println(book.getAuthor());
        System.out.println("Название - " + book.getNameBook());
        System.out.println("Год издания - " + book.getPublishingYear());
        book.setPublishingYear(1900);
        System.out.println("Год издания - " + book.getPublishingYear());
        System.out.println();

        System.out.println(book1.getAuthor());
        System.out.println("Название - " + book1.getNameBook());
        System.out.println("Год издания - " + book1.getPublishingYear());
        System.out.println();
        System.out.println("Сравнение обьектов "+book.equals(book1));
        System.out.println(book);
        System.out.println(book1);

    }

}