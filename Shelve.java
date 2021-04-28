public class Shelve {
    private int eNumero;
    private String eSeccion;

    public Shelve(int eNumero, String eSeccion) {

        this.eNumero = eNumero;
        this.eSeccion = eSeccion;
    }

    public String toString() {
        String string = "";
        string += "Estante: " + this.eNumero + "\nSeccion: " + this.eSeccion;
        return string;
    }

    public void deleteBook() {

    }

    public int getENumero() {
        return this.eNumero;
    }

    public void setENumero(int eNumero) {
        this.eNumero = eNumero;
    }

    public String getESeccion() {
        return this.eSeccion;
    }

    public void setESeccion(String eSeccion) {
        this.eSeccion = eSeccion;
    }

}
