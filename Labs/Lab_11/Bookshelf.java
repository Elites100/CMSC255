package Labs.Lab_11;
import java.util.ArrayList;


public class Bookshelf {
        private int size;
        private ArrayList <Book> books = new ArrayList<>();
        // default constructor
        public Bookshelf(){
            this.size = 2;
            this.books = new ArrayList<>();

        }
        // bookshelf change size or modified constructor
        public Bookshelf(int anSize) {
            this.size = anSize;
            this.books = new ArrayList<>();
        }
        // getting the size (this method return the size of size)
        public int getSize() {
            return size;
        }
        // getting the book (this method return the books of books)
        public ArrayList<Book> getBooks() {
            return books;
        }

        // adding the books (this method add books)
        public void addBook(Book anBook) {
            if (books.size() < size)
            books.add(anBook);

        }
        // subtracting the books (this method removes a book)
        public Book removeBook() {
            if (books.size()==0){
                return null;
            }
            else
            return books.remove(0);
        }
        // remove books (bookshelf) (this method clear the entire shelf)
        public void emptyBookshelf() {
            books.clear();
        }
}



