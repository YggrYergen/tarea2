import java.util.ArrayList;

public class Seccion {
    protected String seccion;
    public ArrayList<Book> books;
    public int rack;

    public Seccion(int numero, String seccion) {
        books = new ArrayList<>();
        this.rack = numero;
        this.seccion = seccion;
    }

    // ################ Getter&Setters ###################

    public String getSeccion() {
        return this.seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getRack() {
        return this.rack;
    }

    public void setRack(int rack) {
        this.rack = rack;
    }

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
