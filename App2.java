import java.util.Scanner;

public class App2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Books books = new Books();
        Shelves shelves = new Shelves();
        Sedes sedes = new Sedes();

        Methods.readCsv(args[0], books, shelves, sedes);

        books.buscarTitulo(input);

        // DisplayMenu.dispMenu(input);
        // Methods.dispMenu();
    }

}
