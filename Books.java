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
}