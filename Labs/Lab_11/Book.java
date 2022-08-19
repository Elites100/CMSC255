package Labs.Lab_11;

public class Book {
        // the constants
        private String title;
        private String author;
        //default constructor
        public Book(){
            this.title = "Test";
            this.author = null;
        }
        //modified constructor
        public Book(String aTitle, String aAuthor){
            this.title = aTitle;
            this.author = aAuthor;
        }
        //getting the title
        public String getTitle(){
            return title;
        }
        //getting the author
        public String getAuthor(){
            return author;
        }
        //setting the author
        public void setAuthor(String anAuthor){
            this.author = anAuthor;
        }
        //setting the title
        public void setTitle(String anTitle){
            this.title = anTitle;
        }
        //string variable where it would print out
        public String toString() {
            return String.format("\"%s\" by %s", title, author);
        }

}
