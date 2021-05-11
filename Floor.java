import java.util.ArrayList;

public class Floor {
    public ArrayList<Rack> racks;
    int floor;

    public Floor(int floor) {
        racks = new ArrayList<>();
        this.floor = floor;
    }

    public void addRack(Rack rack) {
        this.racks.add(rack);

    }

    public void removeRack(Rack rack) {
        this.racks.remove(rack);
    }

    public String toString() {
        String string = "";
        for (Rack rack : racks) {
            string += rack.toString();
        }
        return string;
    }

    // ################ Getter&Setters ##############################

    public ArrayList<Rack> getRacks() {
        return this.racks;
    }

    public int getFloor() {
        return this.floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
