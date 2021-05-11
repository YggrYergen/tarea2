import java.util.ArrayList;

public class Edificio {
    protected String edificio;
    public ArrayList<Floor> floors;

    public Edificio(String edificio) {
        floors = new ArrayList<>();
        this.edificio = edificio;
    }

    public void addFloor(Floor floor) {
        this.floors.add(floor);
    }

    public void removeFloor(Floor floor) {
        this.floors.remove(floor);
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
