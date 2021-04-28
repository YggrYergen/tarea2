public class Sede {
    protected String sede;
    protected String edificio;
    protected int piso;

    public Sede(int piso, String edificio, String sede) {

        this.sede = sede;
        this.edificio = edificio;
        this.piso = piso;
    }

    public String toString() {
        String string = "";
        string += "\nPiso: " + this.piso + "\nEdificio: " + this.edificio + "\nSede: " + this.sede + "\n\n";
        return string;
    }

    // ################ Getter&Setters ##############################

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

}
