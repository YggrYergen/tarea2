import java.util.ArrayList;

public class Sedes {
    protected String sede;
    protected String edificio;
    protected int piso;
    private ArrayList<Shelve> shelves;

    public Sedes(int piso, String edificio, String sede) {
        shelves = new ArrayList<>();
        this.sede = sede;
        this.edificio = edificio;
        this.piso = piso;
    }

    public void addSede(Shelve shelve) {
        this.shelves.add(shelve);

    }

    public String toString() {
        String string = "";
        for (Shelve shelve : shelves) {
            string += shelve.toString() + "\nPiso: " + this.piso + "\nEdificio: " + this.edificio + "\nSede: "
                    + this.sede + "\n";
        }
        return string;
    }

    public String getSede() {
        return this.sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getEdificio() {
        return this.edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public int getPiso() {
        return this.piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public ArrayList<Shelve> getShelves() {
        return this.shelves;
    }

    public void setShelves(ArrayList<Shelve> shelves) {
        this.shelves = shelves;
    }

}
