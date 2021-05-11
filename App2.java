public class App2 {

    public static void main(String[] args) {
        Books books = new Books();
        Shelves shelves = new Shelves();
        Sedes sedes = new Sedes();

        Methods.readCsv(args[0], books, shelves, sedes);
<<<<<<< Updated upstream
        DisplayMenu.dispMenu(books, shelves, sedes);
=======

        //books.buscarTitulo(input);
        //biblioteca.editShelves();
        books.editBook(input);

        //System.out.println(biblioteca.books.get(0));
        //System.out.println(biblioteca.books.get(1));
        //System.out.println(biblioteca.books.get(2));
        // DisplayMenu.dispMenu(input);
        // Methods.dispMenu();
>>>>>>> Stashed changes
    }
}
