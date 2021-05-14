import java.util.ArrayList;

public class Rack {
    public ArrayList<Book> books;
    public int eNumero;
    public String eSeccion;

    public Rack(int eNumero, String eSeccion) {
        books = new ArrayList<>();
        this.eNumero = eNumero;
        this.eSeccion = eSeccion;
    }

    public void addBook(Book book) {
        int flag = 0;
        for (Book books : books) {
            if (books.getTitulo().equalsIgnoreCase(book.getTitulo())) {
                flag++;
                break;
            }
        }
        if (flag == 0)
            this.books.add(book);
    }

    public void deleteBook() {
    }

    public String buscarTitulo(String titulo) {
        String info = "";
        for (Book book : books) {
            if (titulo.equalsIgnoreCase(book.getTitulo())) {
                return info += book.toString() + this.toString();
            }
        }
        return null;
    }

    public String obtenerInfoCSV(String titulo) {
        String info = "";
        for (Book book : books) {
            if (titulo.equalsIgnoreCase(book.getTitulo())) {
                return info += book.pure_toString() + this.pure_toString();
            }
        }
        return null;
    }

    public Book getBook(String titulo) {
        for (Book book : books) {
            if (titulo.equalsIgnoreCase(book.getTitulo())) {
                return book;
            }
        }
        return null;
    }

    public void moveBook() {

    }

    public String toString() {
        String string = "";
        string += "Estante: " + this.eNumero + "\nSeccion: " + this.eSeccion + "\n";
        return string;
    }

    public String pure_toString() {
        String string = "";
        string += this.eNumero + ",\"" + this.eSeccion + "\",";
        return string;
    }

    // ################ Getter&Setters ##############################

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
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

}
