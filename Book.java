public class Book {
    protected String titulo;
    protected String autor;
    protected int año;
    protected int eNumero;
    protected String eSeccion;
    protected String sede;
    protected String edificio;
    protected int piso;

    public Book(String titulo, String autor, int año, int eNumero, String eSeccion, int piso, String sede,
            String edificio) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.eNumero = eNumero;
        this.eSeccion = eSeccion;
        this.sede = sede;
        this.edificio = edificio;
        this.piso = piso;
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

    public int getAño() {
        return this.año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getEstanteNumero() {
        return this.eNumero;
    }

    public void setEstanteNumero(int eNumero) {
        this.eNumero = eNumero;
    }

    public String getEstanteSeccion() {
        return this.eSeccion;
    }

    public void setEstanteSeccion(String eSeccion) {
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

    public String toString() {
        return "Titulo: " + this.titulo + "\nAutor: " + this.autor + "\naño: " + this.año + "\nSede: " + this.sede;
    }
}
