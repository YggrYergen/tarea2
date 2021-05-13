import java.util.ArrayList;
import java.util.Scanner;

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

    /*
     * public void editBook() { System.out.print("\033[H\033[2J"); for (Book book :
     * books) { if (titulo.equalsIgnoreCase(book.getTitulo())) { Boolean exit =
     * false; while (exit != true) { System.out.print("\033[H\033[2J");
     * System.out.println("Informacion actual: \n");
     * System.out.println(book.toString());
     * System.out.println("Eliga una opcion:\n");
     * System.out.println("[1] Editar titulo.");
     * System.out.println("[2] Editar autor.");
     * System.out.println("[3] Editar anio."); System.out.println("[4] Salir.");
     * System.out.print("\nOpcion:  "); int opcion = input.nextInt();
     * System.out.print("\033[H\033[2J");
     * 
     * switch (opcion) { case 1: input.nextLine();
     * System.out.print("Titulo actual: " + book.getTitulo() + "\n");
     * System.out.println("Ingresar nuevo titulo:"); String nuevotitulo =
     * input.nextLine(); book.setTitulo(nuevotitulo); break; case 2:
     * input.nextLine(); System.out.print("Autor actual: " + book.getAutor() +
     * "\n"); System.out.println("Ingresar nuevo autor:"); String nuevoautor =
     * input.nextLine(); book.setAutor(nuevoautor); break; case 3: input.nextLine();
     * System.out.println("Anio actual: " + book.getAnio() + "\n");
     * System.out.println("Ingresar nuevo año:"); int nuevoano = input.nextInt();
     * book.setAnio(nuevoano); break; default: System.out.print("\033[H\033[2J");
     * exit = true; System.out.println("\nVolviendo...\n"); break; } } } } }
     */

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
