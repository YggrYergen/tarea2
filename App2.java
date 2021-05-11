import java.text.Bidi;

public class App2 {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

<<<<<<< HEAD
<<<<<<< HEAD
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
=======
        Methods.readCsv(args[0],biblioteca);
=======
        Methods.readCsv(args[0], biblioteca);
>>>>>>> 1f3ab396e380e619ffbb36d4069ffc084252aaba
        DisplayMenu.dispMenu(biblioteca);
>>>>>>> e8f0e9d8bb62a7f74c775cf6d83c9cbc00e9cbcd
    }
}
