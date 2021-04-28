import java.util.ArrayList;

public class Sedes {
    public ArrayList<Sede> sedes;
    public ArrayList<Shelve> shelves;
    public ArrayList<Book> books;

    public Sedes() {
        sedes = new ArrayList<>();
        books = new ArrayList<>();
        shelves = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void addShelve(Shelve shelve) {
        this.shelves.add(shelve);

    }

    public void addSede(Sede sede) {
        this.sedes.add(sede);

    }

    public String toString() {
        String string = "";
        for (Sede sede : sedes) {
            string += sede.toString();

        }
        return string;
    }

    public ArrayList<Sede> getSedes() {
        return this.sedes;
    }

    public void setSedes(ArrayList<Sede> sedes) {
        this.sedes = sedes;
    }

    public ArrayList<Shelve> getShelves() {
        return this.shelves;
    }

    public void setShelves(ArrayList<Shelve> shelves) {
        this.shelves = shelves;
    }

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

}
