import java.util.ArrayList;

public class Edificio {
    protected String edificio;
    public ArrayList<Floor> floors;

    public Edificio(String edificio) {
        floors = new ArrayList<>();
        this.edificio = edificio;
    }

    public void addFloor(Floor floor) {
        int flag = 0;
        for (Floor floors : floors) {
            if (floors.getFloor() == floor.getFloor()) {
                flag++;
                break;
            }
        }
        if (flag == 0)
            this.floors.add(floor);
    }

    public void removeFloor(Floor floor) {
        this.floors.remove(floor);
    }

    public String buscarTitulo(String titulo) {
        String book = "";
        for (Floor floor : floors) {
            book = floor.buscarTitulo(titulo);
            if (book != null)
                return book += this.toString();
        }
        return null;
    }

    public Book getBook(String titulo) {
        Book book;
        for (Floor floor : floors) {
            book = floor.getBook(titulo);
            if (book != null)
                return book;
        }
        return null;
    }

    public String toString() {
        String string = "";
        string += "Edificio: " + this.edificio + "\n";
        return string;
    }

    // ################ Getter&Setters ##############################

    public String getEdificio() {
        return this.edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public ArrayList<Floor> getFloors() {
        return this.floors;
    }
}
