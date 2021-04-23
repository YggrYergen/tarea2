
public class App2 {

    public static void main(String[] args) {
        Methods.readCsv(args[0]);

        // Methods.dispMenu();

        Book b1 = new Book("Introduction to Algorithms",
                "Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, and Clifford Stein", 2009);
        Book b2 = new Book("Programming Language Pragmatics", "Michael L. Scott, Morgan Kaufman", 2015);
        Sedes s1 = new Sedes(1, "A", "Santiago");
        Sedes s2 = new Sedes(1, "B", "Vina del Mar");
        Shelve e1 = new Shelve(4, "Estructura de Datos y Algoritmos");
        Shelve e2 = new Shelve(1, "Estructura de Datos y Algoritmos");

        e1.addBook(b1);
        e2.addBook(b2);
        s1.addSede(e1);
        s2.addSede(e2);

        System.out.println(s1);
        System.out.println(s2);

        // ob1.printLibro();
    }

}
