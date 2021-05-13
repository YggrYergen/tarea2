import java.util.ArrayList;

public class Biblioteca {
    public ArrayList<Sede> sedes;

    public Biblioteca() {
        sedes = new ArrayList<>();
    }

    public void addSede(Sede sede) {
        /*
         * int flag = 0; for (Sede sedes : sedes) { if
         * (sedes.getSede().equalsIgnoreCase(sede.getSede())) { flag++; break; } } if
         * (flag == 0)
         */
        this.sedes.add(sede);
    }

    public void removeSede(Sede sede) {
        this.sedes.remove(sede);
    }

    public String buscarTitulo(String titulo) {
        String book = "";
        for (Sede sede : sedes) {
            book = sede.buscarTitulo(titulo);
            if (book != null)
                return book;
        }
        return null;
    }

    public String obtenerInfoCSV(String titulo) {
        String book = "";
        for (Sede sede : sedes) {
            book = sede.obtenerInfoCSV(titulo);
            if (book != null)
                return book;
        }
        return null;
    }

    public Book getBook(String titulo) {
        Book book;
        for (Sede sede : sedes) {
            book = sede.getBook(titulo);
            if (book != null)
                return book;
        }
        return null;
    }

    // ################ Getter&Setters ##############################

    public ArrayList<Sede> getSedes() {
        return this.sedes;
    }
}
