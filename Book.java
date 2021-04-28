
public class Book {
    private String titulo;
    private String autor;
    private int anio;
    private int eNumero;
    private String eSeccion;
    private String sede;
    private String edificio;
    private int piso;

    public Book(String titulo, String autor, int anio, int eNumero, String eSeccion, int piso, String edificio,
            String sede) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.eNumero = eNumero;
        this.eSeccion = eSeccion;
        this.sede = sede;
        this.edificio = edificio;
        this.piso = piso;
    }

    public String toString() {
        return "Titulo: " + this.titulo + "\nautor: " + this.autor + "\naño: " + this.anio + "\nEstante: "
                + this.eNumero + "\nSeccion: " + this.eSeccion + "\nPiso: " + this.piso + "\nEdificio: " + this.edificio
                + "\nSede: " + this.sede + "\n\n";

    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
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
