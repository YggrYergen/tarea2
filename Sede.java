import java.util.ArrayList;

public class Sede {
    protected String sede;
    public ArrayList<Edificio> edificios;

    public Sede(int piso, String edificio, String sede) {
        this.sede = sede;
        edificios = new ArrayList<>();
    }

    public void addEdificio(Edificio edificio) {
        this.edificios.add(edificio);
    }

    public void removeEdificio(Edificio edificio) {
        this.edificios.remove(edificio);
    }

    public String toString() {
        String string = "";
        string += this.sede + "\n\n";
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
