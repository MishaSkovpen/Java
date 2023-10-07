import java.util.ArrayList;
import java.util.Iterator;
public class SimpleLibrary {

    public static void main(String[] args){



                ArrayList<Book> library = new ArrayList<>();


                library.add(new Book("Book 1", "Author 1", "12345", 2000));
                library.add(new Book("Book 2", "Author 2", "67890", 2010));
                library.add(new Book("Book 3", "Author 3", "54321", 2015));


                System.out.println("All Books in the Library:");
                for (Book book : library) {
                    System.out.println(book);
                }


                String searchTitle = "Book 2";
                boolean found = false;
                for (Book book : library) {
                    if (book.getTitle().equalsIgnoreCase(searchTitle)) {
                        System.out.println("Book found: " + book);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Book not found with title: " + searchTitle);
                }


                String isbnToRemove = "12345";
                Iterator<Book> iterator = library.iterator();
                while (iterator.hasNext()) {
                    Book book = iterator.next();
                    if (book.getIsbn().equals(isbnToRemove)) {
                        iterator.remove();
                        System.out.println("Book with ISBN " + isbnToRemove + " removed from the library.");
                    }
                }

             
                System.out.println("Updated List of Books in the Library:");
                for (Book book : library) {
                    System.out.println(book);
                }
            }
        }

        class Book {
            private String title;
            private String author;
            private String isbn;
            private int year;

            public Book(String title, String author, String isbn, int year) {
                this.title = title;
                this.author = author;
                this.isbn = isbn;
                this.year = year;
            }

            public String getTitle() {
                return title;
            }

            public String getIsbn() {
                return isbn;
            }

            @Override
            public String toString() {
                return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Year: " + year;



    }


}

