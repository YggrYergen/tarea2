import java.util.ArrayList;
import java.util.Scanner;

public class Books {
    Scanner input = new Scanner(System.in);
    public ArrayList<Book> books;

    public Books() {
        books = new ArrayList<>();
    }

    public void buscarTitulo() {
        System.out.println("Ingresar Titulo a buscar:");
        String titulo = "\"" + input.nextLine() + "\"";
        int flag = 0;
        for (Book book : books) {
            if (titulo.equalsIgnoreCase(book.getTitulo())) {
                System.out.println("\nLibro encontrado!\n");
                System.out.println(book.toString());
                flag++;
            }

        }
        if (flag == 0)
            System.out.println("No Books of " + titulo + " Found.");
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public String toString() {
        String string = "";
        for (Book book : books) {
            string += book.toString();
        }
        return string;
    }

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

}