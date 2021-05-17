import java.util.ArrayList;

public class Sede {
    private String sede;
    public ArrayList<Edificio> edificios;

    public Sede(String sede) {
        this.sede = sede;
        edificios = new ArrayList<>();
    }

    public void addEdificio(Edificio edificio) {
        int flag = 0;
        for (Edificio edificios : edificios) {
            if (edificios.getEdificio().equalsIgnoreCase(edificio.getEdificio())) {
                flag++;
                break;
            }
        }
        if (flag == 0)
            this.edificios.add(edificio);
    }

    public void removeEdificio(Edificio edificio) {
        this.edificios.remove(edificio);
    }

    public Book getBook(String titulo) {
        Book book;
        for (Edificio edificio : edificios) {
            book = edificio.getBook(titulo);
            if (book != null)
                return book;
        }
        return null;
    }

    public String buscarTitulo(String titulo) {
        String book = "";
        for (Edificio edificio : edificios) {
            book = edificio.buscarTitulo(titulo);
            if (book != null)
                return book += this.toString();
        }
        return null;
    }

    public String getUbicacion(String titulo) {
        String info = "";
        for (Edificio edificio : edificios) {
            info = edificio.obtenerInfoCSV(titulo);
            if (info != null)
                return info += ", " + this.sede;
        }
        return null;
    }

    public String obtenerInfoCSV(String titulo) {
        String book = "";
        for (Edificio edificio : edificios) {
            book = edificio.obtenerInfoCSV(titulo);
            if (book != null)
                return book += this.pure_toString();
        }
        return null;
    }

    public int delete(String[] seccion, int opcion) {
        int i = 0;
        // 1= PISO, 2 = SECCION
        switch (opcion) {
            case 1:
                for (Edificio edificio : edificios) {
                    if (edificio.getEdificio().equals(seccion[1])) {
                        i = edificio.delete(seccion, opcion);
                    }

                }
                return i;
            case 2:
                for (Edificio edificio : edificios) {
                    if (edificio.getEdificio().equals(seccion[3])) {
                        i = edificio.delete(seccion, opcion);
                    }

                }
                return i;
        }
        return i;
    }

    public String toString() {
        String string = "";
        string += "Sede: " + this.sede + "\n\n";
        return string;
    }

    public String pure_toString() {
        String string = "";
        string += this.sede + "\"";
        return string;
    }

    // ################ Getter&Setters ##############################

    public String getSede() {
        return this.sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public ArrayList<Edificio> getEdificios() {
        return this.edificios;
    }
}
