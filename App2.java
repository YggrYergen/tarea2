public class App2 {

    public static void main(String[] args) {
        Books books = new Books();
        Shelves shelves = new Shelves();
        Sedes sedes = new Sedes();

        Methods.readCsv(args[0], books, shelves, sedes);
        DisplayMenu.dispMenu(books, shelves, sedes);
    }
}
