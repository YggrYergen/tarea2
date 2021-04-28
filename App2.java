
public class App2 {

    public static void main(String[] args) {
        // Sedes sede = new Sedes();
        Books biblioteca = new Books();
        Methods.readCsv(args[0], biblioteca);

        biblioteca.buscarTitulo();

        // System.out.println(biblioteca.books.get(1).getAutor());

        // .sedes.get(0).shelves.get(0).books.get(0).getAutor()

        // Methods.readCsv(args[0]);
        // Methods.dispMenu();
        // Methods.System.out.println(se);
        // ob1.printLibro();

    }

}
