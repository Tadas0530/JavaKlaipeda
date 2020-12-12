package sda.kursai.klaipeda.treciapaskaita;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        book1.setAuthor("First Author");
        book2.setAuthor("Second Author");

        System.out.println(book1.getAuthor()== book2.getAuthor());

        Book book3 = new Book(52);

        System.out.println(book1.getAuthor()== book3.getAuthor());

        Book book4 = new Book("Author", "Name",52);
        System.out.println(book4.getAuthor());
        System.out.println(book4.getPages()==book3.getPages()); // TODO pasidometi kas yra Singleton
    }
}
