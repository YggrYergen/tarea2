import java.util.ArrayList;
import java.util.Scanner;

public class Books {
    public ArrayList<Book> books;

    public Books() {
        books = new ArrayList<>();
    }

    public void buscarTitulo(Scanner input) {
        input.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.println("Ingresar Titulo a buscar:");
        String titulo = input.nextLine();
        int flag = 0;
        for (Book book : books) {
            if (titulo.equalsIgnoreCase(book.getTitulo())) {
                System.out.print("\033[H\033[2J");
                System.out.println("\nLibro encontrado!\n");
                System.out.println(book.toString());
                flag++;
                System.out.println(("\nPresione enter para continuar."));
                input.nextLine();
            }

        }
        if (flag == 0) {
            System.out.println("No se encontró el libro \"" + titulo + "\".");
            System.out.println(("\nPresione enter para continuar."));
            input.nextLine();
        }
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void deleteBook() {
    }

    public void editBook(Scanner input) {
        input.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.println("\nIngresar Libro a editar:");
        String titulo = input.nextLine();
        System.out.print("\033[H\033[2J");
        for (Book book : books) {
            if (titulo.equalsIgnoreCase(book.getTitulo())) {
                Boolean exit = false;
                while (exit != true) {
                    System.out.print("\033[H\033[2J");
                    System.out.println("Informacion actual: \n");
                    System.out.println("Titulo: " + book.getTitulo() + "\n" + "Autor: " + book.getAutor() + "\n"
                            + "Anio: " + book.getAnio() + "\n");
                    System.out.println("\nEliga una opcion:\n");
                    System.out.println("[1] Editar titulo.");
                    System.out.println("[2] Editar autor.");
                    System.out.println("[3] Editar anio.");
                    System.out.println("[4] Salir.");
                    System.out.print("\nOpcion:  ");
                    int opcion = input.nextInt();
                    System.out.print("\033[H\033[2J");

                    switch (opcion) {
                        case 1:
                            input.nextLine();
                            System.out.print("Titulo actual: " + book.getAutor() + "\n");
                            System.out.println("Ingresar nuevo titulo:");
                            String nuevotitulo = input.nextLine();
                            book.setTitulo(nuevotitulo);
                            break;
                        case 2:
                            input.nextLine();
                            System.out.println("Ingresar nuevo autor:");
                            String nuevoautor = input.nextLine();
                            book.setAutor(nuevoautor);
                            break;
                        case 3:
                            input.nextLine();
                            System.out.println("Ingresar nuevo año:");
                            int nuevoano = input.nextInt();
                            book.setAnio(nuevoano);
                            break;
                        default:
                            System.out.print("\033[H\033[2J");
                            exit = true;
                            System.out.println("\nVolviendo...\n");
                            break;
                    }
                }
            }
        }
    }

    public void moveBook() {

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
}