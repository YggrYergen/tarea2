import java.util.ArrayList;

public class Sede {
    protected String sede;
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

    public String buscarTitulo(String titulo) {
        String book = "";
        for (Edificio edificio : edificios) {
            book = edificio.buscarTitulo(titulo);
            if (book != null)
                return book += this.toString();
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

    public Book getBook(String titulo) {
        Book book;
        for (Edificio edificio : edificios) {
            book = edificio.getBook(titulo);
            if (book != null)
                return book;
        }
        return null;
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
