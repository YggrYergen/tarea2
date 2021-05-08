import java.awt.print.Book;
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

    // ################ Getter&Setters ##############################

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void editarLibro(){
        System.out.println("Ingresar Libro a editar:");
        String titulo = "\"" + input.nextLine() + "\"";
        for (Book book : books) {
            if (titulo.equalsIgnoreCase(book.getTitulo())) {
                System.out.println("Ingresar opcion:");
                System.out.println("[1] Editar titulo");
                System.out.println("[2] Editar autor");
                System.out.println("[3] Editar ano");
                String opcion = input.nextLine();

                switch(opcion){
                    case "1":
                        System.out.println("Ingresar Titulo a editar:");
                        String nuevotitulo = input.nextLine();
                        book.setTitulo(nuevotitulo);
                        break;
                    case "2":
                        System.out.println("Ingresar Autor a editar:");
                        String nuevoautor = input.nextLine();
                        book.setAutor(nuevoautor);
                        break;
                    case "3":
                        System.out.println("Ingresar Ano a editar:");
                        int nuevoano = input.nextInt();
                        book.setAnio(nuevoano);
                        break;
                    default:
                        System.out.println("Salir del sistema");
                        break;
                }
            }
        }
    }

    public void agregarSede(){
        System.out.println("Ingrese sede a agregar:");
        String sedeNueva = "\"" + input.nextLine() + "\"";
        Book sede = new Book("", "", 0, 0, "", 0, "", sedeNueva);
        books.add(sede);
    }

    public void quitarSede(){
        System.out.println("Ingrese sede a quitar:");
        String sedeAquitar = "\"" + input.nextLine() + "\"";
        for (Book book : books){
            if(sedeAquitar.equalsIgnoreCase(book.getSede())){
                System.out.println("Imposible quitar sede, aun tiene libros adentro!");
                System.out.println("Quite todos los libros de esa sede antes de volver a intenarlo");
                break;
            }
        }
    }

    public void agregarEdificio(){
        System.out.println("Ingrese edificio a agregar:");
        String edificioNuevo = "\"" + input.nextLine() + "\"";
        Book edificio = new Book("", "", 0, 0, "", 0, edificioNuevo, "");
        books.add(edificio);
    }

    public void quitarEdificio(){
        System.out.println("Ingrese edificio a quitar:");
        String edificioAquitar = "\"" + input.nextLine() + "\"";
        for (Book book : books){
            if(edificioAquitar.equalsIgnoreCase(book.getEdificio())){
                System.out.println("Imposible quitar edificio, aun tiene libros adentro!");
                System.out.println("Quite todos los libros de esa edificio antes de volver a intenarlo");
                break;
            }
        }
    }

    /*
    Book(String titulo, String autor, int anio, int eNumero, String eSeccion, int piso, String edificio,
            String sede)
    */
}