public class Books {

    Book theBooks[] = new Book[2];

    public Books() {
        theBooks[0] = new Book("Introduction to Algorithms",
                "Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, and Clifford Stein", 2009, 4,
                "Estructura de Datos y Algoritmos", 1, "A", "Santiago");
        theBooks[1] = new Book("Programming Language Pragmatics", "Michael L. Scott, Morgan Kaufman", 2015, 1,
                "Estructura de Datos y Algoritmos", 1, "B", "Vina del Mar");
    }

    public void printLibro() {
        System.out.println(theBooks[0]);
        System.out.println(theBooks[1]);
    }
}
