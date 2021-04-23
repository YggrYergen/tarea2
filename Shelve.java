import java.util.ArrayList;

public class Shelve {
    private int eNumero;
    private String eSeccion;
    private ArrayList<Book> books;

    public Shelve(int eNumero, String eSeccion) {
        books = new ArrayList<>();
        this.eNumero = eNumero;
        this.eSeccion = eSeccion;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public String toString() {
        String string = "";
        for (Book book : books) {
            string += book.toString() + "\nEstante: " + this.eNumero + "\nSeccion: " + this.eSeccion;
        }
        return string;
    }

    public void deleteBook() {

    }

    public int getENumero() {
        return this.eNumero;
    }

    public void setENumero(int eNumero) {
        this.eNumero = eNumero;
    }

    public String getESeccion() {
        return this.eSeccion;
    }

    public void setESeccion(String eSeccion) {
        this.eSeccion = eSeccion;
    }

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

}
