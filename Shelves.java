public class Shelves extends Book {
    protected int estanteNumero;
    protected String estanteSeccion;

    public Shelves() {

    }

    public int getEstanteNumero() {
        return this.estanteNumero;
    }

    public void setEstanteNumero(int estanteNumero) {
        this.estanteNumero = estanteNumero;
    }

    public String getEstanteSeccion() {
        return this.estanteSeccion;
    }

    public void setEstanteSeccion(String estanteSeccion) {
        this.estanteSeccion = estanteSeccion;
    }

}
