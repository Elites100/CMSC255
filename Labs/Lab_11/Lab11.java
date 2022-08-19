package Labs.Lab_11;


public class Lab11 {
    public static void main (String []args){
        Book book1 = new Book("The Lord of the Rings","J.R.R Tolkien");
        Book book2 = new Book("Nixonland","Rick Perlstein");
        Book book3 = new Book("Hunger games", "Suzanne Collins");

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println();

        Bookshelf bookshelf1 = new Bookshelf(3);
        bookshelf1.addBook(book1);
        bookshelf1.addBook(book2);
        bookshelf1.addBook(book3);

       /* //this is how you would get information of variable
        int Num = bookshelf1.getSize();
        System.out.println(Num);*/
        for(Book newerBooks : bookshelf1.getBooks()) {
            System.out.print(newerBooks + " ");
        }
        System.out.println();


        bookshelf1.emptyBookshelf();
        System.out.println();

        System.out.println("removing the bookcase");
        for(Book noBooks : bookshelf1.getBooks()) {
            System.out.println(noBooks);
        }




    }
}

